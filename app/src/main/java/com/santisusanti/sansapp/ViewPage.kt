package com.santisusanti.sansapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_view_pager.*

class ViewPage : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_pager)

        viewpager.adapter = MyPagerAdapter(supportFragmentManager)

        end_pager.setOnClickListener(){
            val intent = Intent( this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}
