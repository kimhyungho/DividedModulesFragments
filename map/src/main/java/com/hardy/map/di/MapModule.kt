package com.hardy.map.di

import com.hardy.common.runner.FragmentRunner
import com.hardy.common.runner.qualifier.MapFragmentQualifier
import com.hardy.map.MapFragment
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class MapModule {
    @MapFragmentQualifier
    @Singleton
    @Provides
    fun provideMapFragmentRunner(
    ): FragmentRunner = MapFragment
}