package com.example.gitbub.base;

import android.app.Application;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {
        ApplicationModule.class,
        ActivityBindingModule.class
})
public interface ApplicationComponent {
    void inject(MyApplication myApplication);
}
