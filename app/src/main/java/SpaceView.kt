package com.example.spaceship

import android.content.Context
import android.graphics.Canvas
import android.graphics.Paint
import android.view.SurfaceHolder
import android.view.SurfaceView

class SpaceView(context: Context?) : SurfaceView(context), Runnable{

    private var playing = false
    private lateinit var gameThread: Thread
    private lateinit var paint: Paint
    private lateinit var canvas: Canvas
    private lateinit var surfaceHolder: SurfaceHolder

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
        ourHolder = getHolder()

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