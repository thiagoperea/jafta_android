package com.thiagoperea.jafta.presentation.features.home

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.FabPosition
import androidx.compose.material.FloatingActionButton
import androidx.compose.material.Icon
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.thiagoperea.jafta.R
import com.thiagoperea.jafta.internal.ui.theme.JAFTATheme
import com.thiagoperea.jafta.internal.ui.theme.Light80
import com.thiagoperea.jafta.internal.ui.theme.Violet100
import com.thiagoperea.jafta.presentation.features.home.widgets.HomeAddTransactionMenu
import com.thiagoperea.jafta.presentation.features.home.widgets.HomeBottomBar

@Composable
fun HomeScreen() {
    val isFabClicked = remember { mutableStateOf(false) }

    Scaffold(
        floatingActionButtonPosition = FabPosition.Center,
        isFloatingActionButtonDocked = true,
        floatingActionButton = {
            FloatingActionButton(
                onClick = { isFabClicked.value = !isFabClicked.value },
                backgroundColor = Violet100,
                contentColor = Light80
            ) {
                Icon(
                    modifier = Modifier
                        .size(56.dp)
                        .rotate(if (isFabClicked.value) 45f else 0f),
                    painter = painterResource(R.drawable.ic_close),
                    contentDescription = "Add"
                )
            }
        },
        bottomBar = { HomeBottomBar() }
    ) { paddingValues ->

        Box(
            modifier = Modifier.fillMaxSize()
        ) {

            HomeScreenContent(
                modifier = Modifier.padding(paddingValues)
            )

            if (isFabClicked.value) {
                HomeAddTransactionMenu(
                    paddingValues = paddingValues
                )
            }
        }
    }
}


@Preview
@Composable
fun HomePreview() {
    JAFTATheme {
        HomeScreen()
    }
}