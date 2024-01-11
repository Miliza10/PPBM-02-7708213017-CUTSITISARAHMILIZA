package com.example.milizaapp

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.widget.CompositePageTransformer
import androidx.viewpager2.widget.MarginPageTransformer
import androidx.viewpager2.widget.ViewPager2


class FristFragment : Fragment() {

    private lateinit var viewPager2: ViewPager2
    private lateinit var handler: Handler
    private lateinit var imageList: ArrayList<Int>
    private lateinit var adapter: ImageAdapter
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        val view = inflater.inflate(R.layout.fragment_frist, container, false)
        init(view)
        // Inflate the layout for this fragment
        viewPager2.registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback(){
            override fun onPageScrolled(
                position: Int,
                positionOffset: Float,
                positionOffsetPixels: Int
            ) {
                super.onPageScrolled(position, positionOffset, positionOffsetPixels)
                handler.removeCallbacks(runnable)
                handler.postDelayed(runnable, 3000)
            }
        })

        return view
    }

    override fun onPause() {
        super.onPause()

        handler.removeCallbacks(runnable)
    }
    override fun onResume() {
        super.onResume()

        handler.postDelayed(runnable, 2000)
    }

    private val runnable = Runnable{
        viewPager2.currentItem = viewPager2.currentItem + 1
    }

    private fun setUpTransformer(){
        val transformer = CompositePageTransformer()
        transformer.addTransformer(MarginPageTransformer(40))
        transformer.addTransformer{ page,position ->
            val r = 1 - kotlin.math.abs(position)
            page.scaleY = 0.85f + r + 0.14f
        }

        viewPager2.setPageTransformer(transformer)
    }

    private fun init(view: View) {
        viewPager2 = view.findViewById(R.id.slideshow)
        handler = Handler(Looper.getMainLooper())
        imageList = ArrayList()

        imageList.add(R.drawable.pic1)
        imageList.add(R.drawable.pic2)
        imageList.add(R.drawable.pic3)
        imageList.add(R.drawable.pic4)
        imageList.add(R.drawable.pic5)
        imageList.add(R.drawable.pic6)
        imageList.add(R.drawable.pic7)
        imageList.add(R.drawable.pic8)
        imageList.add(R.drawable.pic9)
        imageList.add(R.drawable.pic10)

        adapter = ImageAdapter(imageList,viewPager2)

        viewPager2.adapter = adapter
        viewPager2.offscreenPageLimit = 3
        viewPager2.clipToPadding = false
        viewPager2.clipChildren = false
        viewPager2.getChildAt(0).overScrollMode = RecyclerView.OVER_SCROLL_NEVER

    }
}