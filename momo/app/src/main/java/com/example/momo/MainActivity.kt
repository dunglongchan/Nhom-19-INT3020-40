package com.example.momo

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import com.example.momo.databinding.ActivityMainBinding
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)



        binding.nvBtm.setOnNavigationItemReselectedListener(object : BottomNavigationView.OnNavigationItemReselectedListener{
            override fun onNavigationItemReselected(item: MenuItem) {
                when(item.itemId){
                    R.id.home ->{

                    }
                    R.id.voucher ->{

                    }
                    R.id.qrcode ->{

                    }
                    R.id.chat ->{

                    }
                    R.id.profile ->{

                    }

                }
            }

        })
    }
}