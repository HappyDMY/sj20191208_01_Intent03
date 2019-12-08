package com.tjoeun.sj20191208_01_intent03

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_edit_name.*
import kotlinx.android.synthetic.main.activity_edit_name.okBtn
import kotlinx.android.synthetic.main.activity_edit_nicname.*
import kotlinx.android.synthetic.main.activity_main.*

class EditNicNameActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_nicname)

        val nickName = nickNameEdt.text.toString()
        val resultIntent = Intent()
        resultIntent.putExtra("nickName", nickName)
        setResult(Activity.RESULT_OK, resultIntent)
        finish()
    }

}
