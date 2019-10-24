package com.demo.widget.test

import android.util.Log
import java.util.*
import java.util.Timer

object Timer {
    private val timer = Timer()
    private val msgList = arrayListOf<String>("1","2","3","4","5")

    fun schedlueTimeTask(timerTask: TimerTask,timePerod: Long){
        timer.schedule(timerTask,0,timePerod)
    }


    class MyTimerTask: TimerTask(){
        override fun run() {
            if(msgList.size>0){
                msgList.removeAt(0)
                Log.i("TAG","msgList.toString="+ msgList.toString())
            }else{
                timer.cancel()
                Log.i("TAG","timer cancel")
            }
        }

    }


}