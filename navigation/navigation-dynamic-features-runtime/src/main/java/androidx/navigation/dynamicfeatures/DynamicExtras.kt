/*
 * Copyright 2019 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package androidx.navigation.dynamicfeatures

import androidx.navigation.Navigator

/**
 * Extras for dynamic navigators.
 *
 * You can set a [DynamicInstallMonitor] here to be notified of install state changes as well as any
 * [Navigator.Extras].
 */
public class DynamicExtras
@JvmOverloads
constructor(
    /** @return The [DynamicInstallMonitor] used. */
    public val installMonitor: DynamicInstallMonitor? = null,
    /** @return [Navigator.Extras] associated with these [DynamicExtras]. */
    public val destinationExtras: Navigator.Extras? = null
) : Navigator.Extras
