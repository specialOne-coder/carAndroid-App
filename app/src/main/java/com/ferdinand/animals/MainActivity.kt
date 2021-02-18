package com.ferdinand.animals

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ferdinand.animals.fragments.HomeFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Injecter le fragment dans FrameLayout
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.frameContainer,HomeFragment())
        transaction.addToBackStack(null)
        transaction.commit()
    }
}
