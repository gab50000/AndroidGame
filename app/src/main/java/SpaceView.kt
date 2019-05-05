package com.example.spaceship

import android.content.Context
import android.view.SurfaceView

class SpaceView(context: Context?) : SurfaceView(context), Runnable{

    private var playing = false

    override fun run() {
        while (playing){
            update()
            draw()
            control()
        }
    }

    fun update(){

    }

    fun draw(){

    }

    fun control(){

    }

}