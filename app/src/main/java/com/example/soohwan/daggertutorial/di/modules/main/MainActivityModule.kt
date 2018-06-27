package com.example.soohwan.daggertutorial.di.modules.main

import android.databinding.DataBindingUtil
import com.example.soohwan.daggertutorial.R
import com.example.soohwan.daggertutorial.databinding.MainActivityBinding
import com.example.soohwan.daggertutorial.di.scope.ActivityScope
import com.example.soohwan.daggertutorial.di.scope.FragmentScope
import com.example.soohwan.daggertutorial.ui.MainActivity
import com.example.soohwan.daggertutorial.ui.MainFragment
import dagger.Module
import dagger.Provides
import dagger.android.ContributesAndroidInjector

@Module
abstract class MainActivityModule {
    @Module
    companion object {
        @JvmStatic
        @Provides
        @ActivityScope
        fun provideMainActivityBinding(activity: MainActivity): MainActivityBinding {
            return DataBindingUtil.setContentView(activity, R.layout.main_activity)
        }
    }

    @FragmentScope
    @ContributesAndroidInjector(modules = [(MainFragmentModule::class)])
    abstract fun getMainFragment(): MainFragment
}