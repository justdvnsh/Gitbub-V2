package com.example.gitbub.base;

import android.app.Activity;

import com.example.gitbub.home.MainActivity;
import com.example.gitbub.home.MainActivityComponent;

import dagger.Binds;
import dagger.Module;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjector;
import dagger.multibindings.IntoMap;

@Module(subcomponents = {
        MainActivityComponent.class
})
public abstract  class ActivityBindingModule {

    // this will bind the method to the return type of the dependency
    @Binds
    // into a map
    @IntoMap
    // with the key of main activity
    @ActivityKey(MainActivity.class)
    abstract AndroidInjector.Factory<? extends Activity> providesMainActivityInjector(MainActivityComponent.Builder builder);
}
