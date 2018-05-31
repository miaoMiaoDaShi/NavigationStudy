package com.yangyan.xxp.navigationstudy.fragment

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.yangyan.xxp.navigationstudy.R
import kotlinx.android.synthetic.main.fragment_main_page2.*

/**
 * Author : zhongwenpeng
 * Email : 1340751953@qq.com
 * Time :  2018/5/31
 * Description :
 */
class MainPage2Fragment :Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_main_page2,container,false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        button.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_mainPage2Fragment_to_mainPage3Fragment)
        }
    }
}