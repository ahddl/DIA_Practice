package com.cookandroid.sanpeu_practice1;

import android.app.Application;

import com.kakao.sdk.common.KakaoSdk;

public class KakaoApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        KakaoSdk.init(this, "8b291b4a80c63116ff358fe716fcefde");
        //김민정 기준 kakao appKey
    }
}
