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

package com.here.ort.scanner.storages

import com.here.ort.model.Identifier
import com.here.ort.model.Package
import com.here.ort.model.Result
import com.here.ort.model.ScanResult
import com.here.ort.model.ScanResultContainer
import com.here.ort.model.ScannerDetails
import com.here.ort.model.Success
import com.here.ort.scanner.ScanResultsStorage

/**
 * A dummy storage that does not store scan results at all. Can be used to disable storing of scan results to always
 * trigger new scans. All functions in this implementation always return a successful [Result] to not trigger any
 * errors.
 */
class NoStorage : ScanResultsStorage() {
    override fun readFromStorage(id: Identifier) = Success(ScanResultContainer(id, emptyList()))

    override fun readFromStorage(pkg: Package, scannerDetails: ScannerDetails) =
        Success(ScanResultContainer(pkg.id, emptyList()))

    override fun addToStorage(id: Identifier, scanResult: ScanResult) = Success(Unit)
}
