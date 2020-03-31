package com.example.fitnessnationaplication.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.fitnessnationaplication.R
import com.example.fitnessnationaplication.fragments.F1A1
import com.example.fitnessnationaplication.fragments.F1A2
import kotlinx.android.synthetic.main.activity_finess_nation_session.*

class FinessNationSessionActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finess_nation_session)
        btn_login.setOnClickListener {
            changeFragment()
        }
    }

    companion object {
        enum class FragmentTags(val value: String) {
            TAG_FRAGMENT_F1A1("TAG_FRAGMENT_F1A1"),
            TAG_FRAGMENT_F1A2("TAG_FRAGMENT_F1A2")
        }
    }

    var currentFragmentTag: FragmentTags? = null




    fun changeFragment() {

        val currentFragmentTag = when (currentFragmentTag) {
            null -> FragmentTags.TAG_FRAGMENT_F1A1
            FragmentTags.TAG_FRAGMENT_F1A1 -> FragmentTags.TAG_FRAGMENT_F1A2
            FragmentTags.TAG_FRAGMENT_F1A2 -> FragmentTags.TAG_FRAGMENT_F1A1

        }
        replaceFragment(currentFragmentTag)
    }

    private fun replaceFragment(TAG: FragmentTags?) {
        TAG?.run {

            val fragment = when (this) {
                FragmentTags.TAG_FRAGMENT_F1A1 -> F1A1.newInstance()
                FragmentTags.TAG_FRAGMENT_F1A2 -> F1A2.newInstance()

            }

            val transaction = supportFragmentManager.beginTransaction()
            transaction.replace(R.id.fly_android_session, fragment,this.value)
            transaction.addToBackStack(this.value)
            transaction.commit()



        }
    }


}
