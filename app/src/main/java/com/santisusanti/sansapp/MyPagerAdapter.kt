package com.santisusanti.sansapp

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class MyPagerAdapter (fm: FragmentManager): FragmentPagerAdapter(fm) {
    private val pages = listOf(
        fragment1(),
        fragment2(),
        fragment3()
    )

    override fun getItem(position: Int): Fragment {
        return pages[position]
    }

    override fun getCount(): Int {
        return pages.size
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return when(position){
            0 -> "First Tab"
            1 -> "Second Tab"
            else -> "Third Tab"
        }
    }
}