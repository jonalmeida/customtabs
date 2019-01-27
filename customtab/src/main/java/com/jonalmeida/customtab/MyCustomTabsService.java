package com.jonalmeida.customtab;
/*
 * Copyright (C) 2015 The Android Open Source Project
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

import android.net.Uri;
import android.os.Bundle;
import android.support.customtabs.CustomTabsService;
import android.support.customtabs.CustomTabsSessionToken;
import android.util.Log;

import java.util.List;

public class MyCustomTabsService extends CustomTabsService {

    private static final String TAG = "MyCustomTabsService";

    @Override
    protected boolean warmup(long flags) {
        Log.i(TAG, "warming up the browser");
        // TODO Warm up the browser process asynchronously.
        return true;
    }

    @Override
    protected boolean newSession(CustomTabsSessionToken sessionToken) {
        // TODO create a new session.
        Log.i(TAG, "starting a newSession: " + sessionToken);
        return true;
    }

    @Override
    protected boolean mayLaunchUrl(CustomTabsSessionToken sessionToken,
                                   Uri url,
                                   Bundle extras,
                                   List<Bundle> otherLikelyBundles) {
        // TODO tell the browser about a likely future navigation to a URL.
        Log.i(TAG, "mayLaunchUrl: " + url);
        return true;
    }

    @Override
    protected Bundle extraCommand(String commandName, Bundle args) {
        Log.i(TAG, "extraCommand: " + commandName);
        return Bundle.EMPTY;
    }

    @Override
    protected boolean updateVisuals(CustomTabsSessionToken customTabsSessionToken, Bundle bundle) {
        // TODO Updates the visuals of custom tabs for the given session.
        Log.i(TAG, "update visuals");
        return true;
    }

    @Override
    protected boolean requestPostMessageChannel(CustomTabsSessionToken customTabsSessionToken, Uri uri) {
        return false;
    }

    @Override
    protected int postMessage(CustomTabsSessionToken customTabsSessionToken, String s, Bundle bundle) {
        return 0;
    }

    @Override
    protected boolean validateRelationship(CustomTabsSessionToken customTabsSessionToken, int i, Uri uri, Bundle bundle) {
        return false;
    }

    @Override
    protected boolean cleanUpSession(CustomTabsSessionToken sessionToken) {
        // TODO Called when the client side IBinder for this CustomTabsSessionToken is dead.
        return super.cleanUpSession(sessionToken);
    }
}

