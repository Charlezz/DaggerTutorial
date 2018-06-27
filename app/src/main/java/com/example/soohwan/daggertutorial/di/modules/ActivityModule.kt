package com.example.soohwan.daggertutorial.di.modules

import com.example.soohwan.daggertutorial.di.modules.main.MainActivityModule
import com.example.soohwan.daggertutorial.di.scope.ActivityScope
import com.example.soohwan.daggertutorial.ui.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityModule {
    @ActivityScope
    @ContributesAndroidInjector(modules = [(MainActivityModule::class)])
    abstract fun getMainActivity(): MainActivity
}
