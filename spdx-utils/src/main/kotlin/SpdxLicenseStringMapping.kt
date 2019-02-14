/*
 * Copyright (C) 2017-2019 HERE Europe B.V.
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

package com.here.ort.spdx

import com.here.ort.spdx.SpdxLicense.*
import com.here.ort.spdx.SpdxLicenseException.*

/**
 * A mapping from license strings collected from the declared licenses of open source packages to SPDX expressions. This
 * mapping only contains license strings which cannot be parsed by [SpdxExpression.parse], for example because the
 * license names contain white space. See [SpdxLicenseIdMapping] for a mapping of misspelled license IDs.
 */
object SpdxLicenseStringMapping {
    val mapping = mapOf(
            "(MIT-style) netCDF C library license" to NETCDF.toExpression(),
            "2-clause BSD license" to BSD_2_CLAUSE.toExpression(),
            "2-clause BSDL" to BSD_2_CLAUSE.toExpression(),
            "3-Clause BSD" to BSD_3_CLAUSE.toExpression(),
            "3-Clause BSD License" to BSD_3_CLAUSE.toExpression(),
            "3-clause BSD" to BSD_3_CLAUSE.toExpression(),
            "AL 2.0" to APACHE_2_0.toExpression(),
            "ASF 2.0" to APACHE_2_0.toExpression(),
            "ASL 2" to APACHE_2_0.toExpression(),
            "ASL 2.0" to APACHE_2_0.toExpression(),
            "ASL, version 2" to APACHE_2_0.toExpression(),
            "Academic Free License (AFL)" to AFL_2_1.toExpression(),
            "Apache  Version 2.0, January 2004" to APACHE_2_0.toExpression(),
            "Apache 2" to APACHE_2_0.toExpression(),
            "Apache 2.0" to APACHE_2_0.toExpression(),
            "Apache 2.0 License" to APACHE_2_0.toExpression(),
            "Apache License" to APACHE_2_0.toExpression(),
            "Apache License (2.0)" to APACHE_2_0.toExpression(),
            "Apache License 2" to APACHE_2_0.toExpression(),
            "Apache License 2.0" to APACHE_2_0.toExpression(),
            "Apache License V2.0" to APACHE_2_0.toExpression(),
            "Apache License Version 2" to APACHE_2_0.toExpression(),
            "Apache License Version 2.0" to APACHE_2_0.toExpression(),
            "Apache License v2" to APACHE_2_0.toExpression(),
            "Apache License v2.0" to APACHE_2_0.toExpression(),
            "Apache License, 2.0" to APACHE_2_0.toExpression(),
            "Apache License, V2.0 or later" to APACHE_2_0.toExpression(),
            "Apache License, Version 2" to APACHE_2_0.toExpression(),
            "Apache License, Version 2.0" to APACHE_2_0.toExpression(),
            """Apache License, Version 2.0 and
        Common Development And Distribution License (CDDL) Version 1.0 """.trimIndent()
                    to (APACHE_2_0 and CDDL_1_0),
            "Apache License, version 2.0" to APACHE_2_0.toExpression(),
            "Apache License,Version 2.0" to APACHE_2_0.toExpression(),
            "Apache Public License 2.0" to APACHE_2_0.toExpression(),
            "Apache Software" to APACHE_2_0.toExpression(),
            "Apache Software License - Version 2.0" to APACHE_2_0.toExpression(),
            "Apache Software License 2.0" to APACHE_2_0.toExpression(),
            "Apache Software License, Version 1.1" to APACHE_1_1.toExpression(),
            "Apache Software License, version 1.1" to APACHE_1_1.toExpression(),
            "Apache Software License, version 2.0" to APACHE_2_0.toExpression(),
            "Apache Software Licenses" to APACHE_2_0.toExpression(),
            "Apache license" to APACHE_2_0.toExpression(),
            "Apache v2" to APACHE_2_0.toExpression(),
            "Apache v2.0" to APACHE_2_0.toExpression(),
            "Apache version 2.0" to APACHE_2_0.toExpression(),
            "Apache, Version 2.0" to APACHE_2_0.toExpression(),
            """Apache-2.0 */ &#39; &quot; &#x3D;end --

 """.trimIndent() to APACHE_2_0.toExpression(),
            "Artistic 2.0" to ARTISTIC_2_0.toExpression(),
            "BSD (3-clause)" to BSD_3_CLAUSE.toExpression(),
            "BSD - See ndg/httpsclient/LICENCE file for details" to BSD_3_CLAUSE.toExpression(),
            "BSD 2-Clause" to BSD_2_CLAUSE.toExpression(),
            "BSD 2-Clause License" to BSD_2_CLAUSE.toExpression(),
            "BSD 3 Clause" to BSD_3_CLAUSE.toExpression(),
            "BSD 3-Clause" to BSD_3_CLAUSE.toExpression(),
            "BSD 3-Clause \"New\" or \"Revised\" License (BSD-3-Clause)" to BSD_3_CLAUSE.toExpression(),
            "BSD 3-Clause License" to BSD_3_CLAUSE.toExpression(),
            "BSD 3-Clause license" to BSD_3_CLAUSE.toExpression(),
            "BSD 3-clause" to BSD_3_CLAUSE.toExpression(),
            "BSD Licence 3" to BSD_3_CLAUSE.toExpression(),
            "BSD License" to BSD_2_CLAUSE.toExpression(),
            "BSD License for HSQL" to BSD_3_CLAUSE.toExpression(),
            "BSD New" to BSD_3_CLAUSE.toExpression(),
            "BSD New license" to BSD_3_CLAUSE.toExpression(),
            "BSD licence" to BSD_2_CLAUSE.toExpression(),
            "BSD license" to BSD_2_CLAUSE.toExpression(),
            "BSD or Apache License, Version 2.0" to (BSD_2_CLAUSE or APACHE_2_0),
            "BSD style" to BSD_3_CLAUSE.toExpression(),
            "BSD style license" to BSD_3_CLAUSE.toExpression(),
            "BSD*" to BSD_3_CLAUSE.toExpression(),
            "BSD-Style License" to BSD_3_CLAUSE.toExpression(),
            "BSD-style license" to BSD_3_CLAUSE.toExpression(),
            "Berkeley Software Distribution (BSD) License" to BSD_2_CLAUSE.toExpression(),
            "Bouncy Castle Licence" to MIT.toExpression(),
            "Bouncy Castle License" to MIT.toExpression(),
            "CC0 1.0 Universal" to CC0_1_0.toExpression(),
            "CC0 1.0 Universal License" to CC0_1_0.toExpression(),
            "CDDL + GPLv2 with classpath exception" to (CDDL_1_0 and (GPL_2_0_ONLY with CLASSPATH_EXCEPTION_2_0)),
            "CDDL 1.0" to CDDL_1_0.toExpression(),
            "CDDL 1.1" to CDDL_1_1.toExpression(),
            "CDDL License" to CDDL_1_0.toExpression(),
            "CDDL or GPL 2 with Classpath Exception" to (CDDL_1_0 or (GPL_2_0_ONLY with CLASSPATH_EXCEPTION_2_0)),
            "CDDL or GPLv2 with exceptions" to (CDDL_1_0 or (GPL_2_0_ONLY with CLASSPATH_EXCEPTION_2_0)),
            "CDDL v1.0 / GPL v2 dual license" to (CDDL_1_0 and GPL_2_0_ONLY),
            "CDDL v1.1 / GPL v2 dual license" to (CDDL_1_0 and GPL_2_0_ONLY),
            "CDDL+GPL" to (CDDL_1_0 and GPL_2_0_ONLY),
            "CDDL+GPL License" to (CDDL_1_0 and GPL_2_0_ONLY),
            "CDDL+GPLv2" to (CDDL_1_0 and GPL_2_0_ONLY),
            "CDDL/GPLv2 dual license" to (CDDL_1_0 and GPL_2_0_ONLY),
            "CDDL/GPLv2+CE" to (CDDL_1_0 and (GPL_2_0_ONLY with CLASSPATH_EXCEPTION_2_0)),
            "COMMON DEVELOPMENT AND DISTRIBUTION LICENSE" to CDDL_1_0.toExpression(),
            "COMMON DEVELOPMENT AND DISTRIBUTION LICENSE (CDDL) Version 1.0" to CDDL_1_0.toExpression(),
            "Common Development and Distribution License" to CDDL_1_0.toExpression(),
            "Common Development and Distribution License (CDDL) v1.0" to CDDL_1_0.toExpression(),
            "Common Development and Distribution License (CDDL), Version 1.1" to CDDL_1_1.toExpression(),
            "Common Public License - v 1.0" to CPL_1_0.toExpression(),
            "Common Public License Version 1.0" to CPL_1_0.toExpression(),
            "Creative Commons 3.0 BY-SA" to CC_BY_SA_3_0.toExpression(),
            "Dual License: CDDL 1.0 and GPL V2 with Classpath Exception" to (CDDL_1_0 and GPL_2_0_ONLY),
            "Dual license consisting of the CDDL v1.1 and GPL v2" to (CDDL_1_1 and GPL_2_0_ONLY),
            "EPL (Eclipse Public License), V1.0 or later" to EPL_1_0.toExpression(),
            "Eclipse Distribution License (EDL), Version 1.0" to BSD_3_CLAUSE.toExpression(),
            "Eclipse Distribution License (New BSD License)" to BSD_3_CLAUSE.toExpression(),
            "Eclipse Distribution License - v 1.0" to BSD_3_CLAUSE.toExpression(),
            "Eclipse Distribution License v. 1.0" to BSD_3_CLAUSE.toExpression(),
            "Eclipse Public License" to EPL_1_0.toExpression(),
            "Eclipse Public License (EPL)" to EPL_1_0.toExpression(),
            "Eclipse Public License (EPL) 1.0" to EPL_1_0.toExpression(),
            "Eclipse Public License (EPL), Version 1.0" to EPL_1_0.toExpression(),
            "Eclipse Public License - Version 1.0" to EPL_1_0.toExpression(),
            "Eclipse Public License - v 1.0" to EPL_1_0.toExpression(),
            "Eclipse Public License 1.0" to EPL_1_0.toExpression(),
            "Eclipse Public License v1.0" to EPL_1_0.toExpression(),
            "Eclipse Public License v2.0" to EPL_2_0.toExpression(),
            "Eclipse Public License, Version 1.0" to EPL_1_0.toExpression(),
            "Eclipse Publish License, Version 1.0" to EPL_1_0.toExpression(),
            "GNU Affero General Public License v3" to AGPL_3_0_ONLY.toExpression(),
            "GNU GENERAL PUBLIC LICENSE Version 2, June 1991" to GPL_2_0_ONLY.toExpression(),
            "GNU GPL v2" to GPL_2_0_ONLY.toExpression(),
            "GNU General Lesser Public License (LGPL) version 2.1" to LGPL_2_1_ONLY.toExpression(),
            "GNU General Public Library" to GPL_3_0_ONLY.toExpression(),
            "GNU General Public License (GPL)" to GPL_3_0_ONLY.toExpression(),
            "GNU General Public License (GPL), version 2, with the Classpath exception" to GPL_2_0_ONLY.toExpression(),
            "GNU General Public License Version 2" to GPL_2_0_ONLY.toExpression(),
            "GNU General Public License v2 or later (GPLv2+)" to GPL_2_0_OR_LATER.toExpression(),
            "GNU General Public License v3 (GPLv3)" to GPL_3_0_ONLY.toExpression(),
            "GNU General Public License v3 or later (GPLv3+)" to GPL_3_0_OR_LATER.toExpression(),
            "GNU General Public License, Version 2 with the Classpath Exception"
                    to (GPL_2_0_ONLY with CLASSPATH_EXCEPTION_2_0),
            "GNU General Public License, Version 3" to GPL_3_0_ONLY.toExpression(),
            "GNU General Public License, version 2 (GPL2), with the classpath exception"
                    to (GPL_2_0_ONLY with CLASSPATH_EXCEPTION_2_0),
            "GNU General Public License, version 2, with the Classpath Exception"
                    to (GPL_2_0_ONLY with CLASSPATH_EXCEPTION_2_0),
            "GNU LESSER GENERAL PUBLIC LICENSE" to LGPL_2_1_ONLY.toExpression(),
            "GNU LESSER GENERAL PUBLIC LICENSE V3.0" to LGPL_3_0_ONLY.toExpression(),
            "GNU LESSER GENERAL PUBLIC LICENSE Version 2.1" to LGPL_2_1_ONLY.toExpression(),
            "GNU LESSER GENERAL PUBLIC LICENSE, Version 2.1" to LGPL_2_1_ONLY.toExpression(),
            "GNU LGP (GNU General Public License), V2 or later" to LGPL_2_0_OR_LATER.toExpression(),
            "GNU LGPL" to LGPL_2_1_ONLY.toExpression(),
            "GNU LGPL (GNU Lesser General Public License), V2.1 or later" to LGPL_2_1_OR_LATER.toExpression(),
            "GNU Lesser General Public Licence" to LGPL_2_1_ONLY.toExpression(),
            "GNU Lesser General Public License" to LGPL_2_1_ONLY.toExpression(),
            "GNU Lesser General Public License (LGPL)" to LGPL_2_1_ONLY.toExpression(),
            "GNU Lesser General Public License (LGPL), Version 2.1" to LGPL_2_1_ONLY.toExpression(),
            "GNU Lesser General Public License (LGPL), Version 3" to LGPL_3_0_ONLY.toExpression(),
            "GNU Lesser General Public License 2.1" to LGPL_2_1_ONLY.toExpression(),
            "GNU Lesser General Public License Version 2.1" to LGPL_2_1_ONLY.toExpression(),
            "GNU Lesser General Public License Version 2.1, February 1999" to LGPL_2_1_ONLY.toExpression(),
            "GNU Lesser General Public License v2 or later (LGPLv2+)" to LGPL_2_0_OR_LATER.toExpression(),
            "GNU Lesser General Public License v3 (LGPLv3)" to LGPL_3_0_ONLY.toExpression(),
            "GNU Lesser General Public License v3 or later (LGPLv3+)" to LGPL_3_0_OR_LATER.toExpression(),
            "GNU Lesser General Public License v3+" to LGPL_3_0_OR_LATER.toExpression(),
            "GNU Lesser General Public License, Version 2.1" to LGPL_2_1_ONLY.toExpression(),
            "GNU Lesser General Public License, version 2.1" to LGPL_2_1_ONLY.toExpression(),
            "GNU Lesser Public License" to LGPL_2_1_ONLY.toExpression(),
            "GNU Library or Lesser General Public License (LGPL)" to LGPL_2_1_ONLY.toExpression(),
            "GNU Public" to GPL_2_0_ONLY.toExpression(),
            "GPL (with dual licensing option)" to GPL_2_0_ONLY.toExpression(),
            "GPL 3" to GPL_3_0_ONLY.toExpression(),
            "GPL v2 with ClassPath Exception" to (GPL_2_0_ONLY with CLASSPATH_EXCEPTION_2_0),
            "GPL version 2" to GPL_2_0_ONLY.toExpression(),
            "GPL2 w/ CPE" to (GPL_2_0_ONLY with CLASSPATH_EXCEPTION_2_0),
            "GPLv2+CE" to (GPL_2_0_ONLY with CLASSPATH_EXCEPTION_2_0),
            "HSQLDB License" to BSD_3_CLAUSE.toExpression(),
            "HSQLDB License, a BSD open source license" to BSD_3_CLAUSE.toExpression(),
            "ICU License" to ICU.toExpression(),
            "ISC License (ISCL)" to ISC.toExpression(),
            "ISC license" to ISC.toExpression(),
            "ISC/BSD License" to (ISC and BSD_2_CLAUSE),
            "Jython Software License" to PYTHON_2_0.toExpression(),
            "Kirkk.com BSD License" to BSD_3_CLAUSE.toExpression(),
            "LGPL 2.1" to LGPL_2_1_ONLY.toExpression(),
            "LGPL 3" to LGPL_3_0_ONLY.toExpression(),
            "LGPL 3.0" to LGPL_3_0_ONLY.toExpression(),
            "LGPL v3" to LGPL_3_0_ONLY.toExpression(),
            "LGPL with exceptions or ZPL" to (LGPL_3_0_ONLY or ZPL_2_1),
            "LGPL+BSD" to (LGPL_2_1_ONLY and BSD_2_CLAUSE),
            "LGPL, version 2.1" to LGPL_2_1_ONLY.toExpression(),
            "LGPL/MIT" to (LGPL_3_0_ONLY and MIT),
            "LGPLv3 or later" to LGPL_3_0_OR_LATER.toExpression(),
            "Lesser General Public License (LGPL)" to LGPL_2_1_ONLY.toExpression(),
            "Lesser General Public License, version 3 or greater" to LGPL_3_0_OR_LATER.toExpression(),
            "License :: OSI Approved :: Apache Software" to APACHE_2_0.toExpression(),
            "License :: OSI Approved :: MIT" to MIT.toExpression(),
            "License :: OSI Approved :: MIT License (http://opensource.org/licenses/MIT)" to MIT.toExpression(),
            "License Agreement For Open Source Computer Vision Library (3-clause BSD License)"
                    to BSD_3_CLAUSE.toExpression(),
            "MIT / http://rem.mit-license.org" to MIT.toExpression(),
            "MIT Licence" to MIT.toExpression(),
            "MIT License" to MIT.toExpression(),
            "MIT licence" to MIT.toExpression(),
            "MIT license" to MIT.toExpression(),
            "MIT, 2-clause BSD" to (MIT and BSD_2_CLAUSE),
            "MIT/Expat" to MIT.toExpression(),
            "MIT/X11" to (MIT and X11),
            "MPL 1.1" to MPL_1_1.toExpression(),
            "MPL 2.0" to MPL_2_0.toExpression(),
            "MPL 2.0 or EPL 1.0" to (MPL_2_0 or EPL_1_0),
            "MPL 2.0, and EPL 1.0" to (MPL_2_0 and EPL_1_0),
            "MPL v2" to MPL_2_0.toExpression(),
            "Mockrunner License, based on Apache Software License, version 1.1" to APACHE_1_1.toExpression(),
            "Mozilla Public License" to MPL_2_0.toExpression(),
            "Mozilla Public License 1.1 (MPL 1.1)" to MPL_1_1.toExpression(),
            "Mozilla Public License 2.0 (MPL 2.0)" to MPL_2_0.toExpression(),
            "Mozilla Public License Version 1.0" to MPL_1_0.toExpression(),
            "Mozilla Public License Version 1.1" to MPL_1_1.toExpression(),
            "Mozilla Public License Version 2.0" to MPL_2_0.toExpression(),
            "Mozilla Public License version 1.1" to MPL_1_1.toExpression(),
            "Mozilla Public License version 2.0" to MPL_2_0.toExpression(),
            "Mozilla Public License, Version 2.0" to MPL_2_0.toExpression(),
            "Mozilla Public License, version 2.0" to MPL_2_0.toExpression(),
            "NetBeans CDDL/GPL" to (CDDL_1_0 and GPL_2_0_ONLY),
            "New BSD" to BSD_3_CLAUSE.toExpression(),
            "New BSD License" to BSD_3_CLAUSE.toExpression(),
            "New BSD license" to BSD_3_CLAUSE.toExpression(),
            "Perl Artistic v2" to ARTISTIC_1_0_PERL.toExpression(),
            "Public Domain, per Creative Commons CC0" to CC0_1_0.toExpression(),
            "Public domain (CC0-1.0)" to CC0_1_0.toExpression(),
            "Python Software Foundation" to PYTHON_2_0.toExpression(),
            "Ruby's" to RUBY.toExpression(),
            "Sleepycat License" to SLEEPYCAT.toExpression(),
            "TMate Open Source License (with dual licensing option)" to TMATE.toExpression(),
            "The (New) BSD License" to BSD_3_CLAUSE.toExpression(),
            "The Apache License" to APACHE_2_0.toExpression(),
            "The Apache License, Version 2.0" to APACHE_2_0.toExpression(),
            "The Apache Software Licence, Version 2.0" to APACHE_2_0.toExpression(),
            "The Apache Software License, Version 2.0" to APACHE_2_0.toExpression(),
            "The Apache Software License, version 2.0" to APACHE_2_0.toExpression(),
            "The BSD 2-Clause License" to BSD_2_CLAUSE.toExpression(),
            "The BSD 3-Clause License" to BSD_3_CLAUSE.toExpression(),
            "The BSD License" to BSD_2_CLAUSE.toExpression(),
            "The BSD Software License" to BSD_2_CLAUSE.toExpression(),
            "The Eclipse Public License Version 1.0" to EPL_1_0.toExpression(),
            "The GNU General Public License (GPL), Version 2, With Classpath Exception"
                    to (GPL_2_0_ONLY with CLASSPATH_EXCEPTION_2_0),
            "The GNU General Public License, Version 2" to GPL_2_0_ONLY.toExpression(),
            "The GNU Lesser General Public License, Version 2.1" to LGPL_2_1_ONLY.toExpression(),
            "The JSON License" to JSON.toExpression(),
            "The MIT" to MIT.toExpression(),
            "The MIT License" to MIT.toExpression(),
            "The MIT License (MIT)" to MIT.toExpression(),
            "The MIT License(MIT)" to MIT.toExpression(),
            "The MIT license" to MIT.toExpression(),
            "The New BSD License" to BSD_3_CLAUSE.toExpression(),
            "The PostgreSQL License" to POSTGRESQL.toExpression(),
            "The SAX License" to SAX_PD.toExpression(),
            "The Unlicense" to UNLICENSE.toExpression(),
            "The W3C License" to W3C.toExpression(),
            "The W3C Software License" to W3C.toExpression(),
            "Three-clause BSD-style" to BSD_3_CLAUSE.toExpression(),
            "Two-clause BSD-style license" to BSD_2_CLAUSE.toExpression(),
            "Unicode/ICU License" to ICU.toExpression(),
            "ZPL 2.1" to ZPL_2_1.toExpression(),
            "Zope Public" to ZPL_2_1.toExpression(),
            "http://ant-contrib.sourceforge.net/tasks/LICENSE.txt" to APACHE_1_1.toExpression(),
            "http://opensource.org/licenses/MIT" to MIT.toExpression(),
            "http://svnkit.com/license.html" to TMATE.toExpression(),
            "http://www.apache.org/licenses/LICENSE-2.0" to APACHE_2_0.toExpression(),
            "http://www.apache.org/licenses/LICENSE-2.0.txt" to APACHE_2_0.toExpression(),
            "http://www.gnu.org/copyleft/lesser.html" to LGPL_3_0_ONLY.toExpression(),
            "new BSD" to BSD_3_CLAUSE.toExpression(),
            "public domain, Python, 2-Clause BSD, GPL 3 (see COPYING.txt)"
                    to (((licenseRef("scancode-public-domain-disclaimer") and PYTHON_2_0.toExpression())
                    and BSD_2_CLAUSE.toExpression()) and GPL_3_0_ONLY.toExpression()),
            "the Apache License, ASL Version 2.0" to APACHE_2_0.toExpression()
    )

    private fun licenseRef(id: String) = SpdxLicenseReferenceExpression("LicenseRef-$id")

    fun map(license: String) = mapping[license] ?: SpdxLicense.forId(license)?.toExpression()
}