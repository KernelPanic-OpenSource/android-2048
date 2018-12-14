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
package com.afollestad.mnmlscreenrecord.common.lifecycle

import androidx.lifecycle.Lifecycle.Event.ON_CREATE
import androidx.lifecycle.Lifecycle.Event.ON_DESTROY
import androidx.lifecycle.Lifecycle.Event.ON_PAUSE
import androidx.lifecycle.Lifecycle.Event.ON_RESUME
import androidx.lifecycle.Lifecycle.Event.ON_START
import androidx.lifecycle.Lifecycle.Event.ON_STOP
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.LifecycleRegistry

/** @author Aidan Follestad (@afollestad) */
class SimpleLifecycle(provider: LifecycleOwner) : LifecycleRegistry(provider) {

  fun onCreate() {
    handleLifecycleEvent(ON_CREATE)
    handleLifecycleEvent(ON_START)
    handleLifecycleEvent(ON_RESUME)
  }

  fun onDestroy() {
    handleLifecycleEvent(ON_PAUSE)
    handleLifecycleEvent(ON_STOP)
    handleLifecycleEvent(ON_DESTROY)
  }
}
