/*
 * Copyright (C) 2017-2019 HERE Europe B.V.
 * Copyright (C) 2019 Bosch Software Innovations GmbH
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * SPDX-License-Identifier: Apache-2.0
 * License-Filename: LICENSE
 */

package org.ossreviewtoolkit.analyzer.managers

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.should
import io.kotest.matchers.shouldBe

import java.io.File

import org.ossreviewtoolkit.downloader.VersionControlSystem
import org.ossreviewtoolkit.utils.normalizeVcsUrl
import org.ossreviewtoolkit.utils.test.DEFAULT_ANALYZER_CONFIGURATION
import org.ossreviewtoolkit.utils.test.DEFAULT_REPOSITORY_CONFIGURATION
import org.ossreviewtoolkit.utils.test.USER_DIR
import org.ossreviewtoolkit.utils.test.containExactly
import org.ossreviewtoolkit.utils.test.patchExpectedResult

class NuGetTest : StringSpec() {
    private val projectDir = File("src/funTest/assets/projects/synthetic/nuget").absoluteFile
    private val vcsDir = VersionControlSystem.forDirectory(projectDir)!!
    private val vcsUrl = vcsDir.getRemoteUrl()
    private val vcsRevision = vcsDir.getRevision()
    private val packageFile = File(projectDir, "packages.config")

    init {
        "Definition file is correctly mapped" {
            val mapper = NuGetPackageReferenceMapper()
            val result = mapper.mapPackageReferences(packageFile)

            result should containExactly(
                "jQuery" to "3.3.1",
                "WebGrease" to "1.5.2"
            )
        }

        "Project dependencies are detected correctly" {
            val vcsPath = vcsDir.getPathToRoot(projectDir)
            val expectedResult = patchExpectedResult(
                File(
                    projectDir.parentFile,
                    "nuget-expected-output.yml"
                ),
                url = normalizeVcsUrl(vcsUrl),
                revision = vcsRevision,
                path = vcsPath
            )
            val result = createNuGet().resolveSingleProject(packageFile)

            result.toYaml() shouldBe expectedResult
        }
    }

    private fun createNuGet() =
        NuGet("NuGet", USER_DIR, DEFAULT_ANALYZER_CONFIGURATION, DEFAULT_REPOSITORY_CONFIGURATION)
}
