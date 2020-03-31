package com.example.fitnessnationaplication.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.fitnessnationaplication.R
import kotlinx.android.synthetic.main.activity_fitness_nation_session.*

class FitnessNationSessionActivity : AppCompatActivity() {

    companion object {
        enum class FragmentTags(value: String) {
            TAG_FRAGMENT_F1_A1("TAG_FRAGMENT_F1_A1"),
            TAG_FRAGMENT_F1_A2("TAG_FRAGMENT_F1_A2")
        }
    }

    var currentFragmentTag: String? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fitness_nation_session)

        btn_trigger.setOnClickListener{

        }
    }

    fun loginFragment() {
        currentFragmentTag = when (currentFragmentTag) {
            null -> TAG_FRAGMENT_F1_A1
            TAG_FRAGMENT_F1_A1 -> TAG_FRAGMENT_F1_A2
            TAG_FRAGMENT_F1_A2 -> TAG_FRAGMENT_F1_A1
        }
        replaceFragment(currentFragmentTag)
    }

    fun replaceFragment(TAG: String) {

    }
}
