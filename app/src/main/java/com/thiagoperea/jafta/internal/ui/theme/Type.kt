package com.thiagoperea.jafta.internal.ui.theme

import androidx.compose.material.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.thiagoperea.jafta.R

// Set of Material typography styles to start with
val Typography = Typography(
    /* Other default text styles to override

    body1 = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.5.sp
    )
    */
)

val interFontFamily = FontFamily(
    Font(R.font.inter_bold, FontWeight.Bold),
    Font(R.font.inter_medium, FontWeight.Medium),
    Font(R.font.inter_semibold, FontWeight.SemiBold),
)

object JAFTATypography {

    val bold64 = TextStyle(
        fontFamily = interFontFamily,
        fontSize = 64.sp,
        fontWeight = FontWeight.Bold
    )

    val bold30 = TextStyle(
        fontFamily = interFontFamily,
        fontSize = 32.sp,
        fontWeight = FontWeight.Bold
    )

    val semibold40 = TextStyle(
        fontFamily = interFontFamily,
        fontSize = 40.sp,
        fontWeight = FontWeight.SemiBold
    )

    val semibold24 = TextStyle(
        fontFamily = interFontFamily,
        fontSize = 24.sp,
        fontWeight = FontWeight.SemiBold
    )

    val semibold20 = TextStyle(
        fontFamily = interFontFamily,
        fontSize = 20.sp,
        fontWeight = FontWeight.SemiBold
    )

    val semibold18 = TextStyle(
        fontFamily = interFontFamily,
        fontSize = 18.sp,
        fontWeight = FontWeight.SemiBold
    )

    val semibold16 = TextStyle(
        fontFamily = interFontFamily,
        fontSize = 16.sp,
        fontWeight = FontWeight.SemiBold
    )

    val medium16 = TextStyle(
        fontFamily = interFontFamily,
        fontSize = 16.sp,
        fontWeight = FontWeight.Medium
    )

    val medium14 = TextStyle(
        fontFamily = interFontFamily,
        fontSize = 14.sp,
        fontWeight = FontWeight.Medium
    )

    val medium13 = TextStyle(
        fontFamily = interFontFamily,
        fontSize = 13.sp,
        fontWeight = FontWeight.Medium
    )

    val medium12 = TextStyle(
        fontFamily = interFontFamily,
        fontSize = 12.sp,
        fontWeight = FontWeight.Medium
    )

    val medium10 = TextStyle(
        fontFamily = interFontFamily,
        fontSize = 10.sp,
        fontWeight = FontWeight.Medium
    )
}