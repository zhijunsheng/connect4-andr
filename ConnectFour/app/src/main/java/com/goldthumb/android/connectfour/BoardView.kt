package com.goldthumb.android.connectfour

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.util.AttributeSet
import android.view.View

class BoardView @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0
) : View(context, attrs, defStyleAttr) {

    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)

        val paint: Paint = Paint()
        paint.setColor(Color.BLACK)
        paint.strokeWidth = 3f
        paint.style = Paint.Style.STROKE
        canvas?.drawCircle(200f, 300f, 70f, paint)
    }
}