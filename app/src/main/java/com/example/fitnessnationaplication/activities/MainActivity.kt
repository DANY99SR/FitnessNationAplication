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

        this.btn_go_to_sessions.setOnClickListener {
            gotoSessionActivity()
        }


    }

    private fun gotoSessionActivity(){
        val intent = Intent(this, FitnessNationSessionActivity::class.java)
        startActivity(intent)
    }
}
