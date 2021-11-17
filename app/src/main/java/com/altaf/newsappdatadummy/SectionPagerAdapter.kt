package com.altaf.newsappdatadummy

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.altaf.newsappdatadummy.Fragment.AllNewsFragment
import com.altaf.newsappdatadummy.Fragment.PopularFragment
import com.altaf.newsappdatadummy.Fragment.TopFragment

class SectionPagerAdapter (fa : FragmentActivity) : FragmentStateAdapter(fa) {
    override fun getItemCount() = 3

    override fun createFragment(position: Int): Fragment {
        return when(position) {
            0 -> AllNewsFragment()
            1 -> TopFragment()
            2 -> PopularFragment()
            else -> TopFragment()
        }

    }

}