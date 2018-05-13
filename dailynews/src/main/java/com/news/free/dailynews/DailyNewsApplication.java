package com.news.free.dailynews;

import android.app.Application;
import android.util.Log;

import com.news.free.core.NewsModule;

import javax.inject.Inject;
import javax.inject.Named;

public class DailyNewsApplication extends Application {

    @Inject
    @Named(NewsModule.APP_NAME)
    String appName;

    @Override
    public void onCreate() {
        super.onCreate();

        DaggerDailyComponent.builder()
                .dailyNewsModule(new DailyNewsModule(this))
                .build()
                .inject(this);


        Log.d("test_",appName);
    }
}
