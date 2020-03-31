package com.example.fitnessnationaplication.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.fitnessnationaplication.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

      /*  btn_go_to_sessions.setOnClickListener {
            gotoSessionActivity()
        }*/


    }

    private fun gotoSessionActivity(){
        val intent = Intent(this, FinessNationSessionActivity::class.java)
        startActivity(intent)
    }
}
