package com.thiagoperea.jafta.presentation.features.home

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Chip
import androidx.compose.material.ChipDefaults
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.thiagoperea.jafta.domain.Mocks
import com.thiagoperea.jafta.internal.ui.theme.Dark100
import com.thiagoperea.jafta.internal.ui.theme.JAFTATypography
import com.thiagoperea.jafta.internal.ui.theme.Violet100
import com.thiagoperea.jafta.internal.ui.theme.Violet20
import com.thiagoperea.jafta.presentation.designsystem.TransactionItem
import com.thiagoperea.jafta.presentation.features.home.widgets.HomeChart
import com.thiagoperea.jafta.presentation.features.home.widgets.HomeHeader

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun HomeScreenContent(
    modifier: Modifier = Modifier
) {
    LazyColumn(modifier = modifier) {
        item {
            HomeHeader()
        }

        item {
            Text(
                modifier = Modifier.padding(start = 16.dp, top = 12.dp),
                text = "Spend Frequency",
                style = JAFTATypography.semibold18,
                color = Dark100
            )
        }

        item {
            HomeChart(
                modifier = Modifier
                    .height(190.dp)
                    .fillMaxWidth()
            )
        }

        item {

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 8.dp, horizontal = 16.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = "Recent transactions",
                    style = JAFTATypography.semibold18,
                    color = Dark100
                )

                Chip(
                    onClick = { /*TODO*/ },
                    colors = ChipDefaults.chipColors(
                        backgroundColor = Violet20,
                        contentColor = Violet100
                    )
                ) {
                    Text(
                        text = "See All",
                        style = JAFTATypography.medium14,
                    )
                }
            }
        }

        val mockData = Mocks.mockTransactionEntries()

        items(
            items = mockData,
            key = { transaction -> transaction.id }
        ) { transaction ->
            TransactionItem(transaction = transaction)
        }
    }
}
