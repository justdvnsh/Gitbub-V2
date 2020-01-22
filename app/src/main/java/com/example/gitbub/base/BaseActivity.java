package com.example.gitbub.base;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.UUID;

import javax.inject.Inject;

public abstract class BaseActivity extends AppCompatActivity {

    private static String INSTANCE_ID = "instance_id";
    private String instanceId;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        if (savedInstanceState != null) {
            instanceId = savedInstanceState.getString(INSTANCE_ID);
        } else {
            instanceId = UUID.randomUUID().toString();
        }
        Injector.inject(this);
        super.onCreate(savedInstanceState);
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString(INSTANCE_ID, instanceId);
    }

    public String getInstanceId() {
        return instanceId;
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (isFinishing()) {
            Injector.clearComponent(this);
        }
    }
}
