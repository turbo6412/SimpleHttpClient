package org.csuf.cpsc411.simplehttpclient

import android.content.Context
import android.graphics.Color
import android.view.ViewGroup
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.TextView

class FieldValueViewGenerator(val ctx : Context, val labelName: String) {
    lateinit var layoutObj : LinearLayout // companion object for LinearLayout initializing

    // standard procedure to make a paper LinearLayout object properties for Linear Layout Object
    fun generate() : LinearLayout {
        layoutObj = LinearLayout(ctx)
        // params for layout will always be (width, height)
        val lParams = ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,
                    ViewGroup.LayoutParams.WRAP_CONTENT)
        layoutObj.layoutParams = lParams
        layoutObj.orientation = LinearLayout.HORIZONTAL

        // standard procedure to make a text properties for TextView object
        val lblView = TextView(ctx)
        lblView.text = labelName
        lblView.setBackgroundColor(Color.YELLOW)
        val lbParams = LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,
            ViewGroup.LayoutParams.WRAP_CONTENT)
        lbParams.weight = 1.0F
        layoutObj.addView(lblView, lbParams)

        // standard procedure to make a text properties for EditText object
        val valView = EditText(ctx)
        valView.setBackgroundColor(Color.GREEN)
        val vParams = LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,
            ViewGroup.LayoutParams.WRAP_CONTENT)
        vParams.weight = 1.0F
        layoutObj.addView(valView, vParams)

        return layoutObj
    }
}

