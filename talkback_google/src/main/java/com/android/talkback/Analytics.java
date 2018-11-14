/*
 * Copyright (C) 2015 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */

package com.android.talkback;

import com.android.switchaccess.KeyboardAction;
import com.google.android.marvin.talkback.TalkBackServiceTest;

/**
 * Analytics that tracks talkback usage
 */
public class Analytics implements KeyboardAction.KeyboardActionListener {
    /**
     * The {@link TalkBackServiceTest} instance.
     */
    protected TalkBackServiceTest mService;

    public Analytics(TalkBackServiceTest service) {
        mService = service;
    }

    /**
     * To be called when TalkBack processes a gesture.
     *
     * @param gestureId The ID of the processed gesture.
     */
    public void onGesture(int gestureId){}

    /**
     * To be called when the user edits text.
     */
    public void onTextEdited(){}


    @SuppressWarnings("unused")
    public Analytics() {
    }

    public void start() {
    }

    public void stop() {
    }

    @Override
    public void onKeyboardAction(int preferenceIdForAction) {
    }
}
