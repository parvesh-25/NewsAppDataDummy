package com.altaf.newsappdatadummy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.altaf.newsappdatadummy.databinding.ActivityMainBinding
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.toolbar)
        binding.vpNews.adapter = SectionPagerAdapter(this)

        val tabList = arrayOf("All News", "Top News", "popular")
        TabLayoutMediator(binding.tabs, binding.vpNews){
            tab, position -> tab.text=tabList[position]
        }.attach()
    }
}