package org.csuf.cpsc411.simplehttpclient

import android.content.Context
import android.view.ViewGroup
import android.widget.LinearLayout

class ObjDetailSectionGenerator(val ctx: Context) {
    //standard procedure to intialize LinearLayout object
    lateinit var layoutObj : LinearLayout
    fun generate() : LinearLayout {
        // adding the "paper" sizes for LinearLayout Object properties (parent of paper is screen)
        layoutObj = LinearLayout(ctx)
        val lParams = ViewGroup.LayoutParams(
            ViewGroup.LayoutParams.MATCH_PARENT,    // width
            ViewGroup.LayoutParams.WRAP_CONTENT)    // height
        layoutObj.layoutParams = lParams
        // vertical because we want First name on one line, Last name next line, SSN next line
        layoutObj.orientation = LinearLayout.VERTICAL

        // from here on out everything goes onto the parent "paper" main LinearLayout
        // 1. Initialize a field generator class  object, adding properties to constructor
        // 2. Pass that object's into our "paper" layoutObj as a property to be displayed, when we
        // pass the object we are calling the generate function from FieldValueViewGenerator Class
        // which makes possible the form styling for first name, last name, SSN
        // 3. REPEAT STEPS 1 AND 2 for all three informations
        // 1. GENERATING THE FORM FOR FIRST NAME
        var fldRowGenerator = FieldValueViewGenerator(ctx, "First Name")
        layoutObj.addView(fldRowGenerator.generate())

        // 2. GENERATING THE FORM FOR LAST NAME
        fldRowGenerator = FieldValueViewGenerator(ctx, "Last Name")
        layoutObj.addView(fldRowGenerator.generate())

        // 3. GENERATING THE FORM FOR SSN
        fldRowGenerator = FieldValueViewGenerator(ctx, "SSN")
        layoutObj.addView(fldRowGenerator.generate())

        return layoutObj  // allows CustomActivity class to actually display the object in final step
                            // and all the properties we've added
    }


}