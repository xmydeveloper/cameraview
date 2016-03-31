/*
 * Copyright (C) 2016 The Android Open Source Project
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

package com.google.android.cameraview;

import android.view.TextureView;

abstract class CameraViewImpl {

    protected final Callback mCallback;

    public CameraViewImpl(Callback callback) {
        mCallback = callback;
    }

    abstract TextureView.SurfaceTextureListener getSurfaceTextureListener();

    abstract void onResume();

    abstract void onPause();

    abstract void startPreview();

    abstract void stopPreview();

    abstract SizeMap getSupportedPreviewSizes();

    abstract boolean isCameraOpened();

    abstract void setAspectRatio(AspectRatio ratio);

    abstract AspectRatio getAspectRatio();

    interface Callback {

        void onCameraOpened();

        void onCameraClosed();

    }
}
