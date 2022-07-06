package com.hardy.home

import androidx.fragment.app.Fragment
import com.hardy.common.runner.FragmentRunner

class HomeFragment : Fragment() {

    companion object : FragmentRunner {
        override fun getFragmentClass(): Class<Fragment> {
            return HomeFragment().javaClass
        }

        override fun getFragmentName(): String {
            return HomeFragment::class.java.name
        }
    }
}