package com.example.quizapp.utils

import com.example.quizapp.R
import com.example.quizapp.model.Question

object Constants{
    const val USER_NAME="user_name"
    const val TOTAL_QUESTIONS="total_questions"
    const val SCORE="correct_answers"
    fun getQuestions():MutableList<Question>{
        val questions= mutableListOf<Question>()

        val ques1=Question(
            1,"What country does this this Flag belong?",
            R.drawable.italy_flag,"Italy","India","Iran","Ireland",
            1
        )
        questions.add(ques1)
        val ques2=Question(
            2,"What country does this this Flag belong?",
            R.drawable.argentina_flag,"Italy","India","Argentina","Ireland",
            3
        )
        questions.add(ques2)
        val ques3=Question(
            3,"What country does this this Flag belong?",
            R.drawable.brazil_flag,"Brazil","India","Iran","Brazil",
            4
        )
        questions.add(ques3)
        val ques4=Question(
            4,"What country does this this Flag belong?",
            R.drawable.finland_flag,"India","Finland","Brazil","Spain",
            2
        )
        questions.add(ques4)
        val ques5=Question(
            5,"What country does this this Flag belong?",
            R.drawable.france_flag,"Italy","Finland","France","None of the above",
            3
        )
        questions.add(ques5)
        val ques6=Question(
            6,"What country does this this Flag belong?",
            R.drawable.germany_flag,"India","Spain","France","Germany",
            4
        )
        questions.add(ques6)
        val ques7=Question(
            7,"What country does this this Flag belong?",
            R.drawable.india_flag,"Saudi Arabia","India","Honduras","Finland",
            2
        )
        questions.add(ques7)
        val ques8=Question(
            8,"What country does this this Flag belong?",
            R.drawable.nijeria_flag,"Nijeria","Argentina","Brazil","Slovenia",
            1
        )
        questions.add(ques8)
        val ques9=Question(
            9,"What country does this this Flag belong?",
            R.drawable.romania_flag,"Nijeria","Hungary","Iran","Romania",
            1
        )
        questions.add(ques1)
        val ques10=Question(
            10,"What country does this this Flag belong?",
            R.drawable.spain_flag,"Serbia","Germany","Haiti","Spain",
            1
        )
        questions.add(ques1)
        return questions
    }
}