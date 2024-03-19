package com.thiagoperea.jafta.presentation.extension

import com.thiagoperea.jafta.R
import com.thiagoperea.jafta.data.model.TransactionCategory
import com.thiagoperea.jafta.internal.ui.theme.Blue100
import com.thiagoperea.jafta.internal.ui.theme.Blue20
import com.thiagoperea.jafta.internal.ui.theme.Green100
import com.thiagoperea.jafta.internal.ui.theme.Green20
import com.thiagoperea.jafta.internal.ui.theme.Red100
import com.thiagoperea.jafta.internal.ui.theme.Red20
import com.thiagoperea.jafta.internal.ui.theme.Violet100
import com.thiagoperea.jafta.internal.ui.theme.Violet20

fun TransactionCategory.getIconResource() = when (this) {
    TransactionCategory.SALARY -> R.drawable.ic_salary
    TransactionCategory.FOOD -> R.drawable.ic_food
    TransactionCategory.TRANSPORT -> R.drawable.ic_transport
    TransactionCategory.HEALTH -> R.drawable.ic_health
    TransactionCategory.INVESTMENT -> R.drawable.ic_investments
    TransactionCategory.OTHER -> R.drawable.ic_other
}

fun TransactionCategory.getIconTint() = when (this) {
    TransactionCategory.SALARY -> Green100
    TransactionCategory.FOOD -> Red100
    TransactionCategory.TRANSPORT -> Blue100
    TransactionCategory.HEALTH -> Red100
    TransactionCategory.INVESTMENT -> Green100
    TransactionCategory.OTHER -> Violet100
}

fun TransactionCategory.getIconBackgroundTint() = when (this) {
    TransactionCategory.SALARY -> Green20
    TransactionCategory.FOOD -> Red20
    TransactionCategory.TRANSPORT -> Blue20
    TransactionCategory.HEALTH -> Red20
    TransactionCategory.INVESTMENT -> Green20
    TransactionCategory.OTHER -> Violet20
}

fun TransactionCategory.getName() = when (this) {
    TransactionCategory.SALARY -> R.string.salary
    TransactionCategory.FOOD -> R.string.food
    TransactionCategory.TRANSPORT -> R.string.transport
    TransactionCategory.HEALTH -> R.string.health
    TransactionCategory.INVESTMENT -> R.string.investment
    TransactionCategory.OTHER -> R.string.other
}