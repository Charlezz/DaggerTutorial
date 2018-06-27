package com.example.soohwan.daggertutorial.di.modules.main

import android.databinding.DataBindingUtil
import com.example.soohwan.daggertutorial.R
import com.example.soohwan.daggertutorial.databinding.MainFragmentBinding
import com.example.soohwan.daggertutorial.di.scope.FragmentScope
import com.example.soohwan.daggertutorial.ui.MainActivity
import dagger.Module
import dagger.Provides

@Module
class MainFragmentModule {
    @Provides
    @FragmentScope
    fun provideMainFragmentBinding(activity: MainActivity): MainFragmentBinding {
        return DataBindingUtil.inflate<MainFragmentBinding>(
                activity.layoutInflater,
                R.layout.main_fragment,
                null,
                false
        )
    }
}