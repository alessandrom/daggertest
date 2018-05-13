package com.news.free.core;


import javax.inject.Named;
import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class NewsModule {

    public static final String APP_NAME = "appName";

    @Provides
    @Singleton
    @Named(APP_NAME)
    String provideAppName() {
        return "test";
    }
}
