package com.example.spaceship

import android.graphics.Point
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import kotlinx.android.synthetic.main.activity_game.*
import java.util.logging.Logger

/**
 * An example full-screen activity that shows and hides the system UI (i.e.
 * status bar and navigation/system bar) with user interaction.
 */
class GameActivity : AppCompatActivity() {
    lateinit var spaceView: SpaceView
    var logger = Logger.getLogger("GameView")

    override fun onCreate(savedInstanceState: Bundle?) {
        logger.info("Game Activity created")
        val display = windowManager.defaultDisplay
        val size = Point()
        display.getSize(size)
        super.onCreate(savedInstanceState)
        spaceView = SpaceView(this, size.x, size.y)
        setContentView(spaceView)

    }

    override fun onPause() {
        super.onPause()
        spaceView.pause()

    }

    override fun onResume() {
        super.onResume()
        spaceView.resume()
    }

}
