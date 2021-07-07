package com.example.parstagram;

import android.app.Application;

import com.parse.Parse;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId(BuildConfig.parseappId)
                .clientKey(BuildConfig.clientKey)
                .server(BuildConfig.server)
                .build()
        );
    }
}
