package org.csuf.cpsc411.simplehttpclient

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.loopj.android.http.AsyncHttpClient

class CustomActivity : AppCompatActivity() {
    lateinit var pList : MutableList<Person>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // create the class object for ObjDetailSectionGenerator
        val fldRowGenerator = ObjDetailSectionGenerator(this)
        // run the class object method generate which automatically hard codes the 3 forms (firstname, lastname, SSN)
        val fNameView = fldRowGenerator.generate()
        // display onto page
        setContentView(fNameView)
        //setContentView(R.layout.activity_main)
    }
}