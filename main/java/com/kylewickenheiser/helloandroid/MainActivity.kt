package com.kylewickenheiser.helloandroid
//The main activity file is where the logic of the app's functionality lives. I had to look up a few examples of apps that used random numbers before I figured out how to do it best
//The import lines below were generated AS I was dragging and dropping widgets and text views into the design pane, so that part was done for me
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.SeekBar
import android.widget.TextView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//Line 16 may be the most important line in this whole document. It stitches together my logic with my layout
        setContentView(R.layout.activity_main)
//This is the actual logic of the app, the next 7 lines or so
        val rollButton = findViewById<Button>(R.id.rollButton)
        val dieRoll = findViewById<TextView>(R.id.dieRoll)
        val seekBar = findViewById<SeekBar>(R.id.seekBar)

        rollButton.setOnClickListener{
            val result =Random.nextInt(seekBar.progress)+1
//You have to add 1 to the die roll, I'm guessing because arrays start at 0
            dieRoll.text=result.toString()

        }
    }
}
