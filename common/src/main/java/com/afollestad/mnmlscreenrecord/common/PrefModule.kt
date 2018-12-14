/**
 * Designed and developed by Aidan Follestad (@afollestad)
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
 */
package com.afollestad.mnmlscreenrecord.common

import com.afollestad.mnmlscreenrecord.common.prefs.PrefNames.PREF_COUNTDOWN
import com.afollestad.mnmlscreenrecord.common.prefs.PrefNames.PREF_DARK_MODE
import com.afollestad.rxkprefs.RxkPrefs
import com.afollestad.rxkprefs.rxkPrefs
import org.koin.dsl.module.module

/** @author Aidan Follestad (@afollestad) */
val prefModule = module {

  single { rxkPrefs(get(), "settings") }

  factory(name = PREF_DARK_MODE) {
    get<RxkPrefs>().boolean(PREF_DARK_MODE, false)
  }

  factory(name = PREF_COUNTDOWN) {
    get<RxkPrefs>().integer(PREF_COUNTDOWN, 3)
  }
}
