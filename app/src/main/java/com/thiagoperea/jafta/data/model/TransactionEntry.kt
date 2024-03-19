package com.thiagoperea.jafta.data.model

data class TransactionEntry(
    val id: Int,
    val description: String,
    val value: Double,
    val type: TransactionType,
    val category: TransactionCategory,
    val date: String
)

enum class TransactionType {
    INCOME, EXPENSE, INVESTMENT
}

enum class TransactionCategory {
    SALARY, FOOD, TRANSPORT, HEALTH, INVESTMENT, OTHER;
}