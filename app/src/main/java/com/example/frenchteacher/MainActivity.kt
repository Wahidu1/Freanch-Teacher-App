package com.example.frenchteacher

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {
    private lateinit var yellowButton: Button
    private lateinit var redButton: Button
    private lateinit var greenButton: Button
    private lateinit var purpleButton: Button
    private lateinit var blackButton: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        yellowButton = findViewById(R.id.yellow)
        redButton = findViewById(R.id.red)
        greenButton = findViewById(R.id.green)
        purpleButton = findViewById(R.id.purple)
        blackButton = findViewById(R.id.black)
    }

    fun SayTheColor(view:View){
        val clickedButton: Button = view as Button
        var mediaPlayer: MediaPlayer = MediaPlayer.create(
            this,
            resources.getIdentifier(
                clickedButton.tag.toString(),
                "raw",
                packageName
            )
        )
        mediaPlayer.start()
    }
}