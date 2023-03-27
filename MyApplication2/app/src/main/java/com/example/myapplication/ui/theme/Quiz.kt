package com.example.myapplication.ui.theme

const val MAX_NO_OF_WORDS = 10
const val SCORE_INCREASE = 1

data class quiz (
    val question: String,
    var choices: List<String>,
    val ans: String
)
val Quizs = listOf(
    quiz( "What is the first alphabet of 'APPLE'",
        listOf("A", "B", "C", "D", "E", "F", "G", "H", "I", "J"),
        "A"
    ),
    quiz( "What is the first alphabet of 'Box'",
        listOf("A", "B", "C", "D", "E", "F", "G", "H", "I", "J"),
        "B"
    ),
    quiz( "What is the first alphabet of 'Carbon'",
        listOf("A", "B", "C", "D", "E", "F", "G", "H", "I", "J"),
        "C"
    ),
    quiz( "What is the first alphabet of 'Drawer'",
        listOf("A", "B", "C", "D", "E", "F", "G", "H", "I", "J"),
        "D"
    ),
    quiz( "What is the first alphabet of 'Elp'",
        listOf("A", "B", "C", "D", "E", "F", "G", "H", "I", "J"),
        "E"
    ),
    quiz( "What is the first alphabet of 'First'",
        listOf("A", "B", "C", "D", "E", "F", "G", "H", "I", "J"),
        "F"
    ),
    quiz( "What is the first alphabet of 'Grid'",
        listOf("A", "B", "C", "D", "E", "F", "G", "H", "I", "J"),
        "G"
    ),
    quiz( "What is the first alphabet of 'Hail'",
        listOf("A", "B", "C", "D", "E", "F", "G", "H", "I", "J"),
        "H"
    ),
    quiz( "What is the first alphabet of 'Illus'",
        listOf("A", "B", "C", "D", "E", "F", "G", "H", "I", "J"),
        "I"
    ),
    quiz( "What is the first alphabet of 'John'",
        listOf("A", "B", "C", "D", "E", "F", "G", "H", "I", "J"),
        "J"
    ),
)