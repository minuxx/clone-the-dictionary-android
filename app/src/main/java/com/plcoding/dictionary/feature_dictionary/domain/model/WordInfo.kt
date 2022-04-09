package com.plcoding.dictionary.feature_dictionary.domain.model

data class WordInfo(
    val license: String,
    val meanings: List<Meaning>,
    val phonetic: String,
    val word: String
)