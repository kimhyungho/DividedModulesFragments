package com.hardy.gateway

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.hardy.common.runner.FragmentRunner
import com.hardy.common.runner.qualifier.FeedFragmentQualifier
import com.hardy.common.runner.qualifier.MapFragmentQualifier
import com.hardy.gateway.databinding.ActivityGatewayBinding
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class GatewayActivity : AppCompatActivity() {

    @FeedFragmentQualifier
    @Inject
    lateinit var feedFragmentRunner: FragmentRunner

    lateinit var viewDataBinding: ActivityGatewayBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewDataBinding = DataBindingUtil.setContentView(this, R.layout.activity_gateway)

        supportFragmentManager.beginTransaction()
            .apply {
                add(
                    R.id.view_container,
                    feedFragmentRunner.getFragmentClass(),
                    null,
                    feedFragmentRunner.getFragmentName()
                )
            }.commit()
    }
}