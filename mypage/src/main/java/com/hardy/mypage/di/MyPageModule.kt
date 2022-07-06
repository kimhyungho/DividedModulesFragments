package com.hardy.mypage.di

import com.hardy.common.runner.FragmentRunner
import com.hardy.common.runner.qualifier.MyPageFragmentQualifier
import com.hardy.mypage.MyPageFragment
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class MyPageModule {

    @MyPageFragmentQualifier
    @Singleton
    @Provides
    fun provideMyPageFragmentRunner(
    ): FragmentRunner = MyPageFragment
}