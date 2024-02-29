import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Chip
import androidx.compose.material.ChipDefaults
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.thiagoperea.jafta.R
import com.thiagoperea.jafta.internal.ui.theme.Dark50
import com.thiagoperea.jafta.internal.ui.theme.JAFTATheme
import com.thiagoperea.jafta.internal.ui.theme.Light60
import com.thiagoperea.jafta.internal.ui.theme.Light80
import com.thiagoperea.jafta.internal.ui.theme.Violet100

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun HomeTopBar() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(
                horizontal = 16.dp,
                vertical = 12.dp
            ),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Image(
            modifier = Modifier
                .size(40.dp)
                .border(
                    width = 1.dp,
                    shape = RoundedCornerShape(32.dp),
                    color = Violet100
                )
                .border(
                    width = 3.dp,
                    shape = RoundedCornerShape(32.dp),
                    color = Light80
                ),
            painter = painterResource(R.drawable.ic_user),
            contentDescription = null,
        )

        Chip(
            onClick = { /*TODO*/ },
            leadingIcon = {
                Icon(
                    painter = painterResource(R.drawable.ic_arrow_down),
                    contentDescription = null,
                )
            },
            colors = ChipDefaults.chipColors(
                backgroundColor = Color.Transparent,
                contentColor = Dark50
            ),
            border = BorderStroke(
                width = 1.dp,
                color = Light60
            ),
        ) {
            Text("October")
        }

        IconButton(
            onClick = { /*TODO*/ }
        ) {
            Icon(
                painter = painterResource(R.drawable.ic_notification),
                contentDescription = null,
                tint = Violet100
            )
        }
    }
}

@Preview
@Composable
fun PreviewHomeTopBar() {
    JAFTATheme {
        Surface {
            HomeTopBar()
        }
    }
}