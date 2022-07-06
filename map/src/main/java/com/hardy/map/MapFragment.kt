package com.hardy.map

import androidx.fragment.app.Fragment
import com.hardy.common.runner.FragmentRunner

class MapFragment : Fragment() {

    companion object : FragmentRunner {
        override fun getFragmentClass(): Class<Fragment> {
            return MapFragment().javaClass
        }

        override fun getFragmentName(): String {
            return MapFragment::class.java.name
        }
    }
}