package com.yangyan.xxp.navigationstudy

import android.annotation.SuppressLint
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.Navigation.findNavController
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    @SuppressLint("ResourceType")
    override fun onSupportNavigateUp(): Boolean {
        return findNavController(this,R.navigation.nav_graph_main).navigateUp()
    }
}
