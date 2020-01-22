package com.example.gitbub.base;

import android.app.Activity;

import com.example.gitbub.di.ActivityInjector;

public class Injector {

    private static Activity activity;

    private Injector() {

    }

    public static void inject(Activity activity) {
        ActivityInjector.get(activity).inject(activity);
    }

    public static void clearComponent(BaseActivity baseActivity) {
        ActivityInjector.get(baseActivity).clear(activity);
    }
}
