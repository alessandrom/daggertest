package com.news.free.dailynews;

import android.app.Application;

import com.news.free.core.NewsModule;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class DailyNewsModule extends NewsModule {

    private Application application;

    public DailyNewsModule(Application application) {
        this.application = application;
    }

    @Singleton
    @Provides
    @Named(NewsModule.APP_NAME)
    String provideAppName() {
        return application.getString(R.string.app_name);
    }
}
