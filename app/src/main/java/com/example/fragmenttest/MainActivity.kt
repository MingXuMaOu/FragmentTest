package com.example.fragmenttest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.fragmenttest.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.left_fragment.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        button.setOnClickListener {
            replaceFragment(AnotherRightFragment())
        }
        replaceFragment(RightFragment())

    }

    private fun replaceFragment(fragment: Fragment){
//        val fragmentManager = supportFragmentManager
//        val transient = fragmentManager.beginTransaction()
//        transient.replace(R.id.rightLayout,fragment)
//        transient.addToBackStack(null)
//        transient.commit()
    }
}