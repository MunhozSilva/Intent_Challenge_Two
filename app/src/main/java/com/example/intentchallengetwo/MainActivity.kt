package com.example.intentchallengetwo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.Settings.Global.putString
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //verify if Action is SEND
        if (intent?.action == Intent.ACTION_SEND && intent?.type == "text/plain") {
            //get the shared value
            val newText = intent?.getStringExtra(Intent.EXTRA_TEXT)

            //listen to the text_received TextView and change it's text attribute to newText
            val textView = findViewById<TextView>(R.id.text_received)
            textView.text = newText
        }

    }
}

