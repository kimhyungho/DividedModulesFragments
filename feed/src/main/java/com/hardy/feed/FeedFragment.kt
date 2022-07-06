package com.hardy.feed

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.hardy.common.runner.FragmentRunner
import com.hardy.feed.databinding.FragmentFeedBinding
import kotlin.reflect.KClass

class FeedFragment : Fragment() {

    private var _viewDataBinding: FragmentFeedBinding? = null
    val viewDataBinding: FragmentFeedBinding
        get() = _viewDataBinding
            ?: throw IllegalStateException("viewDataBinding can not be null")

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return DataBindingUtil.inflate<FragmentFeedBinding>(
            inflater,
            R.layout.fragment_feed,
            container,
            false
        )
            .also { viewDataBinding ->
                viewDataBinding.lifecycleOwner = viewLifecycleOwner
                this._viewDataBinding = viewDataBinding
            }.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

    companion object : FragmentRunner {
        override fun getFragmentClass(): Class<Fragment> {
            return FeedFragment().javaClass
        }

        override fun getFragmentName(): String {
            return FeedFragment::class.java.name
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _viewDataBinding = null
    }
}