package com.thiagoperea.jafta.presentation.features.home.widgets

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.thiagoperea.jafta.R
import com.thiagoperea.jafta.internal.ui.theme.Blue100
import com.thiagoperea.jafta.internal.ui.theme.Green100
import com.thiagoperea.jafta.internal.ui.theme.JAFTATheme
import com.thiagoperea.jafta.internal.ui.theme.Red100

@Composable
fun HomeAddTransactionMenu(
    paddingValues: PaddingValues
) {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(
                brush = Brush.verticalGradient(
                    colors = listOf(
                        Color.Transparent,
                        Color(0xFF8B50FF).copy(alpha = 0.24f),
                    )
                )
            )
            .padding(paddingValues),
        verticalArrangement = Arrangement.Bottom,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {

        IconButton(
            onClick = { /*TODO*/ }
        ) {

            Icon(
                modifier = Modifier
                    .padding(bottom = 12.dp)
                    .size(56.dp)
                    .background(
                        color = Blue100,
                        shape = CircleShape
                    )
                    .padding(12.dp),
                painter = painterResource(R.drawable.ic_investments),
                contentDescription = null,
                tint = Color.White,
            )
        }

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 32.dp),
            horizontalArrangement = Arrangement.Center
        ) {

            IconButton(
                onClick = { /*TODO*/ }
            ) {
                Icon(
                    modifier = Modifier
                        .size(56.dp)
                        .background(
                            color = Green100,
                            shape = CircleShape
                        )
                        .padding(12.dp),
                    painter = painterResource(R.drawable.ic_income),
                    contentDescription = null,
                    tint = Color.White,
                )
            }

            Box(modifier = Modifier.width(80.dp))

            IconButton(
                onClick = { /*TODO*/ }
            ) {
                Icon(
                    modifier = Modifier
                        .size(56.dp)
                        .background(
                            color = Red100,
                            shape = CircleShape
                        )
                        .padding(12.dp),
                    painter = painterResource(R.drawable.ic_expense),
                    contentDescription = null,
                    tint = Color.White,
                )
            }
        }
    }
}

@Preview
@Composable
private fun previewHomeAddTransactionMenu() {
    JAFTATheme {
        Surface {
            HomeAddTransactionMenu(paddingValues = PaddingValues(0.dp))
        }
    }
}