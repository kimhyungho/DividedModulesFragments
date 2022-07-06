package com.hardy.feed.di

import com.hardy.common.runner.FragmentRunner
import com.hardy.common.runner.qualifier.FeedFragmentQualifier
import com.hardy.common.runner.qualifier.MapFragmentQualifier
import com.hardy.feed.FeedFragment
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class FeedModule {

    @FeedFragmentQualifier
    @Singleton
    @Provides
    fun provideFeedFragmentRunner(
    ): FragmentRunner = FeedFragment
}