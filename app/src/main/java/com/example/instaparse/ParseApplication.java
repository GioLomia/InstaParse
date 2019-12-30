package com.example.instaparse;

import android.app.Application;
import com.parse.Parse;

public class ParseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("giorgi-instaparse") // should correspond to APP_ID env variable
                .clientKey("CodepathInstaparseMoveFast")  // set explicitly unless clientKey is explicitly configured on Parse server
                .server("http://giorgi-instaparse.herokuapp.com/parse").build());
    }
}
