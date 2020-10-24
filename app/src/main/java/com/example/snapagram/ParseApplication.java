package com.example.snapagram;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        // Register your parse models
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("BJgwUp6DwrnKtfrJ5mQhyBkT1yP8HU577mJXzPkM")
                .clientKey("ahw4gHnPVgSAVSnUz6EMBfvQnrTM3MgAXlwwSqYz")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
