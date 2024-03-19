package com.thiagoperea.jafta.presentation.designsystem

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.thiagoperea.jafta.data.model.TransactionCategory
import com.thiagoperea.jafta.data.model.TransactionEntry
import com.thiagoperea.jafta.data.model.TransactionType
import com.thiagoperea.jafta.internal.ui.theme.Dark100
import com.thiagoperea.jafta.internal.ui.theme.Dark25
import com.thiagoperea.jafta.internal.ui.theme.JAFTATheme
import com.thiagoperea.jafta.internal.ui.theme.JAFTATypography
import com.thiagoperea.jafta.internal.ui.theme.Light20
import com.thiagoperea.jafta.internal.ui.theme.Light80
import com.thiagoperea.jafta.presentation.extension.DD_MM_YYYY
import com.thiagoperea.jafta.presentation.extension.YYYY_MM_DD
import com.thiagoperea.jafta.presentation.extension.formatAsMoney
import com.thiagoperea.jafta.presentation.extension.formatDate
import com.thiagoperea.jafta.presentation.extension.getIconBackgroundTint
import com.thiagoperea.jafta.presentation.extension.getIconResource
import com.thiagoperea.jafta.presentation.extension.getIconTint
import com.thiagoperea.jafta.presentation.extension.getName

@Composable
fun TransactionItem(
    modifier: Modifier = Modifier,
    transaction: TransactionEntry
) {

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 20.dp, vertical = 4.dp)
            .background(
                color = Light80,
                shape = RoundedCornerShape(24.dp)
            ),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Icon(
            modifier = Modifier
                .padding(start = 16.dp, top = 16.dp, bottom = 16.dp)
                .background(
                    color = transaction.category.getIconBackgroundTint(),
                    shape = RoundedCornerShape(16.dp)
                )
                .padding(10.dp)
                .size(40.dp),
            painter = painterResource(transaction.category.getIconResource()),
            contentDescription = null,
            tint = transaction.category.getIconTint()
        )

        Column(
            modifier = Modifier
                .weight(1f)
                .padding(horizontal = 8.dp)
        ) {
            Text(
                text = stringResource(transaction.category.getName()),
                style = JAFTATypography.medium16,
                color = Dark25
            )

            Text(
                modifier = Modifier.padding(top = 8.dp),
                text = transaction.description,
                style = JAFTATypography.medium13,
                color = Light20
            )
        }


        Column(
            modifier = Modifier.padding(end = 16.dp),
            horizontalAlignment = Alignment.End
        ) {
            Text(
                text = transaction.value.formatAsMoney(),
                style = JAFTATypography.semibold16,
                color = Dark100
            )

            Text(
                modifier = Modifier.padding(top = 8.dp),
                text = transaction.date.formatDate(YYYY_MM_DD, DD_MM_YYYY),
                style = JAFTATypography.medium14,
                color = Light20
            )
        }
    }
}

@Preview
@Composable
fun previewTransactionItem() {
    JAFTATheme {
        Surface {
            TransactionItem(
                transaction = TransactionEntry(
                    id = 1,
                    description = "Test",
                    value = 100.0,
                    date = "2021-10-10",
                    category = TransactionCategory.FOOD,
                    type = TransactionType.EXPENSE
                )
            )
        }
    }
}