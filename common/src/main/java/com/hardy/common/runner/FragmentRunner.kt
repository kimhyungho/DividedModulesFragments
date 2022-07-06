package com.hardy.common.runner

import androidx.fragment.app.Fragment
import kotlin.reflect.KClass

interface FragmentRunner {
    fun getFragmentClass(): Class<Fragment>

    fun getFragmentName(): String
}