package com.example.gitbub.di;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;

// this tells that this annotation is a scope
@Scope
// retention tells to retain this in the final apk build
@Retention(RetentionPolicy.RUNTIME)
public @interface ActivityScope {
}
