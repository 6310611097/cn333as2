package com.example.myapplication.ui.theme

import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.res.stringResource
import kotlin.random.Random

@Composable
fun ran_choice(choices: List<String>,ans: String): MutableList<String>{
    var quizChioce: MutableList<String> = mutableListOf("","","","")
    var ans_no = Random.nextInt(0,4)
    var index: Int
    var ans_num: MutableList<Int> = mutableListOf(choices.indexOf(ans),0,0,0)
    quizChioce.set(ans_no,ans)
    for (i in 1..3) {
        while (true) {
            index = Random.nextInt(0, 10)
            if (index !in ans_num) {
                break
            }
        }
        ans_num.set(i, index)
        while (true) {
            ans_no = Random.nextInt(0, 4)
            if (quizChioce[ans_no] == "") {
                break
            }
        }
        quizChioce.set(ans_no,choices[index])
    }

    return quizChioce
}


@Composable
fun Screen(){
    var quiz_no : Int = Random.nextInt(0,10)
    var current : quiz = Quizs[quiz_no]
    Column (
        verticalArrangement = Arrangement.spacedBy(24.dp)
    ) {
        Text(
            text = "Quiz",
            style = MaterialTheme.typography.h3,
            modifier = Modifier.padding(bottom = 16.dp)
        )
        Text(
            text = current.question,
            style = MaterialTheme.typography.h5,
            modifier = Modifier.padding(bottom = 16.dp)
        )
        ran_choice(current.choices,current.ans).forEach { choice ->
            Button(
                onClick = {  }
            ) {
                Text(
                    text = choice,
                    style = MaterialTheme.typography.body2
                )
            }
        }
    }
}