package com.example.gitbub.home;

import com.bluelinelabs.conductor.Controller;
import com.example.gitbub.Trending.TrendingRepoComponent;
import com.example.gitbub.Trending.TrendingRepoController;
import com.example.gitbub.di.ControllerKey;

import dagger.Binds;
import dagger.Module;
import dagger.android.AndroidInjector;
import dagger.multibindings.IntoMap;

@Module(subcomponents = {
        TrendingRepoComponent.class
})
public abstract class MainScreenBindingModule {

    @Binds
    @IntoMap
    @ControllerKey(TrendingRepoController.class)
    abstract AndroidInjector.Factory<? extends Controller> bindTrendingReposInjector(TrendingRepoComponent.Builder builder);
}
