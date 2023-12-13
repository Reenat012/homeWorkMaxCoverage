package ru.netology

import calcCommission
import isExceedLimitDay
import isExceedLimitMonth
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import printSumRemmittance
import sumRemittanceWithCommision

class MainKtTest {

    @Test
    fun isExceedLimitDay() {
        val typeCard = "MasterCard"
        val sumRemittanceNew = 120_000

        val result = isExceedLimitDay(typeCard, sumRemittanceNew) //записываем в переменную результат вызова функции

        assertEquals(true, result)
    }

    @Test
    fun isExceedLimitMonth() {
        val typeCard = "MasterCard"
        val sumRemittanceMonthAgo = 3_000_00
        val sumRemittanceNew = 120_000

        val result = isExceedLimitMonth(typeCard, sumRemittanceMonthAgo, sumRemittanceNew)

        assertEquals(true, result)
    }

    @Test
    fun calcCommission() {
        val typeCard = "MasterCard"
        val sumRemittanceMonthAgo = 3_000_00
        val sumRemittanceNew = 120_000

        val result = calcCommission(typeCard, sumRemittanceMonthAgo, sumRemittanceNew)

        assertEquals(740, result)
    }

    @Test
    fun sumRemittanceWithCommision() {
        val typeCard = "MasterCard"
        val sumRemittanceMonthAgo = 3_000_00
        val sumRemittanceNew = 120_000

        val result = sumRemittanceWithCommision(typeCard, sumRemittanceMonthAgo, sumRemittanceNew)

        assertEquals(120740, result)
    }
}