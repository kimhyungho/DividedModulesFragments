package com.hardy.home.di

import com.hardy.common.runner.FragmentRunner
import com.hardy.common.runner.qualifier.FeedFragmentQualifier
import com.hardy.common.runner.qualifier.HomeFragmentQualifier
import com.hardy.home.HomeFragment
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class HomeModule {

    @HomeFragmentQualifier
    @Singleton
    @Provides
    fun provideHomeFragmentRunner(
    ): FragmentRunner = HomeFragment
}