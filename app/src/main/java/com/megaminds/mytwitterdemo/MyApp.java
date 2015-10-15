package com.megaminds.mytwitterdemo;

import android.app.Application;

import com.crashlytics.android.Crashlytics;
import com.digits.sdk.android.Digits;
import com.mopub.common.MoPub;
import com.twitter.sdk.android.Twitter;
import com.twitter.sdk.android.core.TwitterAuthConfig;

import io.fabric.sdk.android.Fabric;

/**
 * Created by Santosh on 10/8/2015.
 */
public class MyApp  extends Application {

    public static final String CRASHLYTICS_KEY_SESSION_ACTIVATED = "key_session_crashlytics";
    private static MyApp singleton;
    private TwitterAuthConfig authConfig;
    private String CONSUMER_KEY="NCVh0a0mcuyJhl1mhONFEo39K";
    private String CONSUMER_SECRET="5Oa2j9Izo8pP8p2KgupeNMuJyLYroPeaEaNukDqlcI36B6ogaN";

    @Override
    public void onCreate() {
        super.onCreate();
        singleton = this;
        authConfig
                = new TwitterAuthConfig(CONSUMER_KEY,CONSUMER_SECRET);
        Fabric.with(this, new Crashlytics(), new Digits(), new Twitter(authConfig), new MoPub());

    }
}
