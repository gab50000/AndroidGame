package com.example.spaceship

import android.content.Context
import android.view.SurfaceView

class SpaceView(context: Context?) : SurfaceView(context), Runnable{

    private var playing = false
    private lateinit var gameThread: Thread

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

    fun pause(){
        playing = false
        try{
            gameThread.join()
        } catch (e: InterruptedException){}
    }

    fun resume(){
        playing = true
        gameThread = Thread(this)
        gameThread.start()
    }

}