package com.example.gitbub.Trending;

import com.example.gitbub.di.ScreenScope;

import dagger.Subcomponent;
import dagger.android.AndroidInjector;

@ScreenScope
@Subcomponent
public interface TrendingRepoComponent extends AndroidInjector<TrendingRepoController> {

    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<TrendingRepoController> {}
}
