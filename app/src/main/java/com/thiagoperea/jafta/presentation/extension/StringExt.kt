package com.thiagoperea.jafta.presentation.extension

import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

const val DD_MM_YYYY = "dd/MM/yyyy"
const val YYYY_MM_DD = "yyyy-MM-dd"

fun String.formatDate(from: String, to: String): String {
    val date = SimpleDateFormat(from, Locale.getDefault()).parse(this)

    return SimpleDateFormat(to, Locale.getDefault()).format(date ?: Date())
}