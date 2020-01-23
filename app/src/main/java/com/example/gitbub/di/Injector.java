package com.example.gitbub.di;

import android.app.Activity;

import com.bluelinelabs.conductor.Controller;
import com.example.gitbub.base.BaseActivity;
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

    public static void inject(Controller controller) {
        ScreenInjector.get(controller.getActivity()).inject(controller);
    }

    public static void clearComponent(Controller controller) {
        ScreenInjector.get(controller.getActivity()).clear(controller);
    }
}
