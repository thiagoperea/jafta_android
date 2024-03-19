package com.thiagoperea.jafta.presentation.features.home.widgets

import androidx.annotation.DrawableRes
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.thiagoperea.jafta.R
import com.thiagoperea.jafta.internal.ui.theme.Green100
import com.thiagoperea.jafta.internal.ui.theme.JAFTATheme
import com.thiagoperea.jafta.internal.ui.theme.JAFTATypography
import com.thiagoperea.jafta.internal.ui.theme.Light20
import com.thiagoperea.jafta.internal.ui.theme.Light80
import com.thiagoperea.jafta.internal.ui.theme.Red100

@Composable
fun HomeHeader() {
    Column(
        modifier = Modifier.background(
            brush = Brush.verticalGradient(
                colors = listOf(Color(0xFFFFF6E5), Color.Transparent)
            ),
            shape = RoundedCornerShape(bottomStart = 24.dp, bottomEnd = 24.dp)
        ),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {

        HomeTopBar()

        Text("Account Balance", style = JAFTATypography.medium14, color = Light20)

        Text(
            modifier = Modifier.padding(top = 8.dp),
            text = "R$ 9400",
            style = JAFTATypography.semibold40,
        )

        Row(
            modifier = Modifier.padding(
                vertical = 24.dp,
                horizontal = 16.dp
            ),
            horizontalArrangement = Arrangement.spacedBy(16.dp),
        ) {

            HomeHeaderValueBlock(
                color = Green100,
                title = "Income",
                value = "R$ 9400",
                icon = R.drawable.ic_income
            )

            HomeHeaderValueBlock(
                color = Red100,
                title = "Expenses",
                value = "R$ 1200",
                icon = R.drawable.ic_expense
            )
        }
    }
}

@Composable
fun HomeHeaderValueBlock(
    color: Color,
    title: String,
    value: String,
    @DrawableRes icon: Int,
) {
    Row(
        modifier = Modifier
            .background(
                color = color,
                shape = RoundedCornerShape(24.dp)
            )
            .padding(16.dp),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Icon(
            modifier = Modifier
                .background(
                    color = Light80,
                    shape = RoundedCornerShape(12.dp)
                )
                .padding(8.dp),
            painter = painterResource(icon),
            contentDescription = null,
            tint = color,
        )

        Column(
            modifier = Modifier.padding(start = 8.dp)
        ) {
            Text(
                text = title,
                style = JAFTATypography.medium14,
                color = Light80,
            )

            Text(
                text = value,
                style = JAFTATypography.semibold20,
                color = Light80,
            )
        }
    }
}

@Preview
@Composable
private fun previewHomeHeader() {
    JAFTATheme {
        Surface {
            HomeHeader()
        }
    }
}