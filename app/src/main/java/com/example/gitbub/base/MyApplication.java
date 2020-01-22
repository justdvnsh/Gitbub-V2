package com.example.gitbub.base;

import android.app.Application;

import com.example.gitbub.di.ActivityInjector;

import javax.inject.Inject;

public class MyApplication extends Application {

    private ApplicationComponent component;

    @Inject ActivityInjector activityInjector;

    @Override
    public void onCreate() {
        super.onCreate();

        component = DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this)).build();

        component.inject(this);
    }

    public ActivityInjector getActivityInjector() {
        return activityInjector;
    }
}
