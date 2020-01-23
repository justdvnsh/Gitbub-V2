package com.example.gitbub.base;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;

import com.bluelinelabs.conductor.Controller;
import com.example.gitbub.di.Injector;


public abstract class BaseController extends Controller {

    private boolean injected = false;

    @Override
    protected void onContextAvailable(@NonNull Context context) {
        if (!injected) {
            Injector.inject(this);
            injected = true;
        }

        super.onContextAvailable(context);
    }
}
