package com.example.milizaapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.viewpager2.widget.ViewPager2
import com.example.milizaapp.databinding.ActivityLayouttabBinding
import com.google.android.material.tabs.TabLayout

class layouttab : AppCompatActivity() {

    private lateinit var binding: ActivityLayouttabBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_layouttab)

        binding.tabLayout.addTab(binding.tabLayout.newTab().setText("IMAGE"))
        binding.tabLayout.addTab(binding.tabLayout.newTab().setText("MESSAGE"))
        val adapter = FragmentPageAdapter(supportFragmentManager,lifecycle)
        binding.viewPager22.adapter = adapter
        binding.tabLayout.addOnTabSelectedListener(object  :TabLayout.OnTabSelectedListener{
            override fun onTabSelected(tab: TabLayout.Tab?) {
                if (tab != null){
                    binding.viewPager22.currentItem = tab.position
                }
            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {

            }

            override fun onTabReselected(tab: TabLayout.Tab?) {

            }
        })

        binding.viewPager22.registerOnPageChangeCallback(object  :ViewPager2.OnPageChangeCallback(){
            override fun onPageSelected(position: Int) {
                super.onPageSelected(position)
                binding.tabLayout.selectTab(binding.tabLayout.getTabAt(position))
            }
        })
    }
}