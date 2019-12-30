package com.example.instaparse;

import android.app.Application;
import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        ParseObject.registerSubclass(Post.class);
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("giorgi-instaparse") // should correspond to APP_ID env variable
                .clientKey("CodepathInstaparseMoveFast")  // set explicitly unless clientKey is explicitly configured on Parse server
                .server("https://giorgi-instaparse.herokuapp.com/parse").build());
    }
}
