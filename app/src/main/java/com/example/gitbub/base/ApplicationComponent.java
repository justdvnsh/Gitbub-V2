package com.example.gitbub.base;

// a component in dagger is a class that actually injects dependencies.
// it is build on its own dependencies and the dependencies on top of it.
// we define the interface and dagger implements them.

import javax.inject.Singleton;

import dagger.Component;

@Singleton // this tells that the lifecycle of the component is essentially the lifecycle of the component.
// component tells that which modules/ or which dependencies are to be provided.
@Component(modules = {
        ApplicationModule.class
})
public interface ApplicationComponent {
}
