package com.thiagoperea.jafta.domain

import com.thiagoperea.jafta.data.model.TransactionCategory
import com.thiagoperea.jafta.data.model.TransactionEntry
import com.thiagoperea.jafta.data.model.TransactionType

object Mocks {

    fun mockTransactionEntries() = listOf(
        TransactionEntry(
            id = 1,
            description = "Salário do mês",
            value = 3000.0,
            type = TransactionType.INCOME,
            category = TransactionCategory.SALARY,
            date = "2021-09-01"
        ),
        TransactionEntry(
            id = 2,
            description = "Ifood de sempre!",
            value = 200.0,
            type = TransactionType.EXPENSE,
            category = TransactionCategory.FOOD,
            date = "2021-09-02"
        ),
        TransactionEntry(
            id = 3,
            description = "Uber para o trabalho",
            value = 100.0,
            type = TransactionType.EXPENSE,
            category = TransactionCategory.TRANSPORT,
            date = "2021-09-03"
        ),
    )
}