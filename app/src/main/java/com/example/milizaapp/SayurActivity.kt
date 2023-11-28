package com.example.milizaapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import com.example.milizaapp.databinding.ActivityMainBinding
import com.example.milizaapp.databinding.ActivitySayurBinding

class SayurActivity : AppCompatActivity() {


    private lateinit var binding: ActivitySayurBinding
    private lateinit var listAdapter: ListAdapter
    private lateinit var listData: ListData
    var dataArraylist = ArrayList<ListData?>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding =ActivitySayurBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val namelist = arrayOf("Tomat","Jagung","Kacang Panjang","Cabe Hijau","Wartel","Brokoli","Bayam","Terong","Timun","Bit")

        val imageList = intArrayOf(
            R.drawable.pic1,
            R.drawable.pic2,
            R.drawable.pic3,
            R.drawable.pic4,
            R.drawable.pic5,
            R.drawable.pic6,
            R.drawable.pic7,
            R.drawable.pic8,
            R.drawable.pic9,
            R.drawable.pic10,
            )
        val desclist = intArrayOf(
            R.string.TomatDesc,
            R.string.JagungDesc,
            R.string.KacangpanjangDesc,
            R.string.CabeijoDesc,
            R.string.wartelDesc,
            R.string.BrokoliDesc,
            R.string.BayamDesc,
            R.string.TerongDesc,
            R.string.TimunDesc,
            R.string.BitDesc,
        )
        for (i in imageList.indices){
            listData = ListData(namelist[i],desclist[i],imageList[i])
            dataArraylist.add(listData)
        }
        listAdapter = ListAdapter(this@SayurActivity,dataArraylist)
        binding.sayur.adapter =listAdapter
        binding.sayur.isClickable = true

        binding.sayur.onItemClickListener =AdapterView.OnItemClickListener { adapterView, view, i, l ->
            val intent = Intent (this@SayurActivity,PenjelasanActivity::class.java)
            intent.putExtra("sayur",namelist[i])
            intent.putExtra("detail",desclist[i])
            intent.putExtra("profilePic",imageList[i])
            startActivity(intent)
        }


    }
}