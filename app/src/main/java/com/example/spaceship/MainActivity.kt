package com.example.spaceship

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import java.util.logging.Logger

class MainActivity : AppCompatActivity(), View.OnClickListener {
    var logger = Logger.getLogger("MainActivity")
    override fun onClick(v: View?) {
        logger.info("Start button was clicked")
        val intent = Intent(this, GameActivity::class.java)
        startActivity(intent)
        finish()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val gameButton: Button = findViewById(R.id.gameButton) as Button
        gameButton.setOnClickListener(this)
    }
}
