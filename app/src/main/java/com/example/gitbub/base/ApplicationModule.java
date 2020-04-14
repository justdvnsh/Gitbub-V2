package com.example.gitbub.base;

import android.app.Application;
import android.content.Context;

import dagger.Module;
import dagger.Provides;

// module tells dagger that this class is the provider of dependencies.
@Module
public class ApplicationModule {

    private final Application application;

    ApplicationModule(Application application) {
        this.application = application;
    }

    // Provide tells the annotation processor that this class is providing this dependency.
    @Provides
    Context provideApplicationContext() {
        return application;
    }
}
