package com.thiagoperea.jafta.presentation.features.home.widgets

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.BottomAppBar
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.thiagoperea.jafta.R
import com.thiagoperea.jafta.internal.ui.theme.GrayUnselectedMenu
import com.thiagoperea.jafta.internal.ui.theme.JAFTATheme
import com.thiagoperea.jafta.internal.ui.theme.JAFTATypography
import com.thiagoperea.jafta.internal.ui.theme.Light80
import com.thiagoperea.jafta.internal.ui.theme.Violet100

@Composable
fun HomeBottomBar() {
    val selectedMenuIndex = remember { mutableIntStateOf(0) }

    val menuItems = listOf(
        "Home" to R.drawable.ic_home,
        "Entries" to R.drawable.ic_transaction,
        "" to 0,
        "Budget" to R.drawable.ic_pie_chart,
        "Profile" to R.drawable.ic_user
    )

    BottomAppBar(
        modifier = Modifier
            .height(70.dp)
            .clip(RoundedCornerShape(16.dp, 16.dp, 0.dp, 0.dp)),
        cutoutShape = CircleShape,
        backgroundColor = Light80
    ) {
        menuItems.forEachIndexed { index, (description, iconRes) ->

            // creates an empty space where the fab is
            if (index == 2) {
                Spacer(modifier = Modifier.weight(0.8f))
                return@forEachIndexed
            }

            BottomNavigationItem(
                icon = { Icon(painterResource(iconRes), contentDescription = description) },
                label = { Text(description, style = JAFTATypography.medium10) },
                alwaysShowLabel = true,
                selected = index == selectedMenuIndex.intValue,
                onClick = { selectedMenuIndex.intValue = index },
                selectedContentColor = Violet100,
                unselectedContentColor = GrayUnselectedMenu
            )
        }
    }
}

@Preview
@Composable
fun PreviewHomeBottomBar() {
    JAFTATheme {
        Surface {
            HomeBottomBar()
        }
    }
}