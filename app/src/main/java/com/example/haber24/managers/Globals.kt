package com.ddtech.ddverifier.managers

import android.graphics.Bitmap
import android.view.SurfaceControl
import com.example.haber24.model.NewsModelDetail
import java.util.*

public class Globals {

    companion object {
        private var instance: Globals? = null

        val shared: Globals
            get() {
                if (instance == null) {
                    instance = Globals()
                }

                return instance!!
            }
    }



    val BaseWebservice = "http://turkmedya.com.tr/"
    var selectedNews : NewsModelDetail? = null
    var videostatus : Boolean = false
    var sound : Int = 1

}