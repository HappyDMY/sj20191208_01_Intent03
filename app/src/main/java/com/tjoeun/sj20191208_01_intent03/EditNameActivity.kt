package com.tjoeun.sj20191208_01_intent03

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_edit_name.*

class EditNameActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_name)
//
        cancelBtn.setOnClickListener {
            finish()
        }

        okBtn.setOnClickListener {
            val inputName = nameEdt.text.toString()

            val resultIntent =Intent()
            resultIntent.putExtra("name", inputName)

            setResult(Activity.RESULT_OK.resultIntent)


        }

    }
}
