package me.abunka.singleappmodule.di

import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import me.abunka.singleappmodule.MyApplication

@Component(modules = [AndroidSupportInjectionModule::class, ActivitiesModule::class])
interface ApplicationComponent: AndroidInjector<MyApplication> {

    @Component.Builder
    abstract class Builder : AndroidInjector.Builder<MyApplication>() {

        abstract override fun build(): ApplicationComponent
    }
}

