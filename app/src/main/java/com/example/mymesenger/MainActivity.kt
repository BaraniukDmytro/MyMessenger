package com.example.mymesenger

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.mymesenger.activity.NumberActivity
import com.example.mymesenger.databinding.ActivityMainBinding
import com.example.mymesenger.ui.CallFragment
import com.example.mymesenger.ui.ChatFragment
import com.example.mymesenger.ui.StatusFragment
import com.example.mymesenger.adapter.ViewPagerAdapter
import com.google.firebase.auth.FirebaseAuth


class MainActivity : AppCompatActivity() {
    private lateinit var auth: FirebaseAuth
    private var binding : ActivityMainBinding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding!!.root)

        val fragmentArrayList = ArrayList<Fragment>()

        fragmentArrayList.add(ChatFragment())
        fragmentArrayList.add(StatusFragment())
        fragmentArrayList.add(CallFragment())

        auth = FirebaseAuth.getInstance()

        if (auth.currentUser == null){
            startActivity(Intent(this, NumberActivity::class.java))
            finish()
        }

        val adapter = ViewPagerAdapter(this, supportFragmentManager, fragmentArrayList)

        binding!!.viewPager.adapter = adapter

        binding!!.tabs.setupWithViewPager(binding!!.viewPager)
    }
}