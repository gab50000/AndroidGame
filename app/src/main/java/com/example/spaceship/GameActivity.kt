package com.example.spaceship

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import kotlinx.android.synthetic.main.activity_game.*

/**
 * An example full-screen activity that shows and hides the system UI (i.e.
 * status bar and navigation/system bar) with user interaction.
 */
class GameActivity : AppCompatActivity() {
    lateinit var spaceView: SpaceView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        spaceView = SpaceView(this)
        setContentView(spaceView)
    }

    override fun onPause() {
        super.onPause()
        spaceView.pause()

    }

}
