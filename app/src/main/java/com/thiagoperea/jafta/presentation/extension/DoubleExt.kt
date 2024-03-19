package com.thiagoperea.jafta.presentation.extension

import java.text.NumberFormat
import java.util.Locale

fun Double.formatAsMoney(): String {
    val formatter = NumberFormat.getCurrencyInstance(Locale("pt", "BR"))

    return formatter.format(this)
}