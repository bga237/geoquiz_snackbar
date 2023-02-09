package com.williams.msu.geoquiz_snackbar

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.snackbar.Snackbar

private lateinit var truebutton : Button
private lateinit var falsebutton : Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        truebutton = findViewById(R.id.true_Button)
        falsebutton = findViewById(R.id.false_Button)



        truebutton.setOnClickListener{
            val snackBar = Snackbar.make(
                it,
                "Correct",
                Snackbar.LENGTH_LONG
            )
            snackBar.show()
        }
        falsebutton.setOnClickListener {
            val snackBar = Snackbar.make(
                it,
                "Incorrect",
                Snackbar.LENGTH_LONG
            )
            snackBar.setTextColor(Color.BLACK)
            snackBar.setBackgroundTint(Color.RED)
            snackBar.show()
        }
    }
}