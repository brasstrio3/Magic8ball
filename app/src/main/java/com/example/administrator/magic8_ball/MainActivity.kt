package com.example.administrator.magic8_ball

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.Random

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        displayResponse()
    }

    fun generateRandomNumber(): Int {
            var number = Random()
            var min = 1
            var max = 20
            val dice = number.nextInt(max + 1 - min) + min
            return dice
    }

    fun response() {
        var resp = ""
        when (generateRandomNumber()) {
            1 -> resp = "It is certain"
            2 -> resp = "It is decidedly so"
            3 -> resp = "Without a doubt"
            4 -> resp = "Yes definitely"
            5 -> resp = "You may rely on it"
            6 -> resp = "As I see it, yes"
            7 -> resp = "Most likely"
            8 -> resp = "Outlook good"
            9 -> resp = "Yes"
            10 -> resp = "Signs point to yes"
            11 -> resp = "Reply hazy try again"
            12 -> resp = "Ask again later"
            13 -> resp = "Better not tell you now"
            14 -> resp = "Cannot predict now"
            15 -> resp = "Concentrate and ask again"
            16 -> resp = "Dont count on it"
            17 -> resp = "My reply is no"
            18 -> resp = "My sources say no"
            19 -> resp = "Outlook not so good"
            20 -> resp = "Very doubtful"
        }
        return resp
    }

    fun displayResponse() {
        btnAskQuestion.setOnClickListener() {
            lblAnswer.text = response()
        }
    }
}

