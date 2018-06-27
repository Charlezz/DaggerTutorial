package com.example.soohwan.daggertutorial.di

import com.example.soohwan.daggertutorial.App
import com.example.soohwan.daggertutorial.di.modules.ActivityModule
import com.example.soohwan.daggertutorial.di.modules.AppModule
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

@Singleton
@Component(modules = [(AndroidSupportInjectionModule::class), (ActivityModule::class), (AppModule::class)])
interface AppComponent : AndroidInjector<App> {
    @Component.Builder
    abstract class Builder : AndroidInjector.Builder<App>()
}

