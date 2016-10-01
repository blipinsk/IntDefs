/*
 * Copyright 2016 Bartosz Lipinski
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.bartoszlipinski.intdefs;

import android.os.Build;
import android.support.annotation.IntDef;
import android.support.annotation.RequiresApi;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@RequiresApi(Build.VERSION_CODES.M)
@IntDef({android.view.MotionEvent.ACTION_DOWN,
        android.view.MotionEvent.ACTION_UP,
        android.view.MotionEvent.ACTION_MOVE,
        android.view.MotionEvent.ACTION_CANCEL,
        android.view.MotionEvent.ACTION_OUTSIDE,
        android.view.MotionEvent.ACTION_POINTER_DOWN,
        android.view.MotionEvent.ACTION_POINTER_UP,
        android.view.MotionEvent.ACTION_HOVER_MOVE,
        android.view.MotionEvent.ACTION_SCROLL,
        android.view.MotionEvent.ACTION_HOVER_ENTER,
        android.view.MotionEvent.ACTION_HOVER_EXIT,
        android.view.MotionEvent.ACTION_BUTTON_PRESS,
        android.view.MotionEvent.ACTION_BUTTON_RELEASE})
@Retention(RetentionPolicy.CLASS)
public @interface MotionEventAction {
}
