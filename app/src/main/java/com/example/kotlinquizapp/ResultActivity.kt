package com.example.kotlinquizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class ResultActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val totalQuestions = intent.getIntExtra(Constants.TOTAL_QUESTIONS, 0)
        val numOfPoints = intent.getIntExtra(Constants.CORRECT_ANSWERS, 0)

        val usernameFinal : TextView = findViewById(R.id.usernameFinal)
        val textPoints : TextView = findViewById(R.id.scoreTextFinal)
        val finishButton :Button = findViewById(R.id.finishButton)


        usernameFinal.text = intent.getStringExtra(Constants.USER_NAME)

        textPoints.text = "Your Score is $numOfPoints out of $totalQuestions"

        finishButton.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }
    }
}