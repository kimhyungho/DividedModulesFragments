package com.hardy.mypage

import androidx.fragment.app.Fragment
import com.hardy.common.runner.FragmentRunner

class MyPageFragment : Fragment() {

    companion object : FragmentRunner {
        override fun getFragmentClass(): Class<Fragment> {
            return MyPageFragment().javaClass
        }

        override fun getFragmentName(): String {
            return MyPageFragment::class.java.name
        }
    }
}