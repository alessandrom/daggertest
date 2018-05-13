package com.news.free.dailynews;

import android.app.Activity;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = DailyNewsModule.class)
public interface DailyComponent {

    void inject(DailyNewsApplication app);
}
