package com.example.soohwan.daggertutorial.di.modules

import com.example.soohwan.daggertutorial.di.Named
import dagger.Module
import dagger.Provides

@Module
class AppModule {
    @Named("hello")
    @Provides
    fun provideHelloWorld() = "Hello World!!"

}