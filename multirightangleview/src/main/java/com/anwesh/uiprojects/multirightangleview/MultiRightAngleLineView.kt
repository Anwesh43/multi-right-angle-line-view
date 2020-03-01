package com.anwesh.uiprojects.multirightangleview

/**
 * Created by anweshmishra on 01/03/20.
 */

import android.view.View
import android.view.MotionEvent
import android.graphics.Canvas
import android.graphics.Paint
import android.graphics.Color
import android.content.Context
import android.app.Activity

val nodes : Int = 5
val lines : Int = 5
val parts : Int = 2
val scGap : Float = 0.02f / (lines * parts)
val strokeFactor : Int = 90
val foreColor : Int = Color.parseColor("#1A237E")
val backColor : Int = Color.parseColor("#BDBDBD")
val delay : Long = 20
