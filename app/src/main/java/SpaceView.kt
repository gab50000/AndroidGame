package com.example.spaceship

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.view.SurfaceHolder
import android.view.SurfaceView

class SpaceView(context: Context?) : SurfaceView(context), Runnable{

    private var playing = false
    private lateinit var gameThread: Thread
    private lateinit var canvas: Canvas
    private var paint: Paint = Paint()
    private var surfaceHolder: SurfaceHolder = holder

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
        if (surfaceHolder.surface.isValid){
            canvas = surfaceHolder.lockCanvas()
            canvas.drawColor(Color.argb(255, 255, 0, 0))
            surfaceHolder.unlockCanvasAndPost(canvas)
        }
        else{
            print("error")
        }


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