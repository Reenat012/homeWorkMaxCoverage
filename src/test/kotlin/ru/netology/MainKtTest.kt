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
    fun isExceedLimitDayMasterCardNorm() {
        val typeCard = "MasterCard"
        val sumRemittanceNew = 120_000

        val result = isExceedLimitDay(typeCard, sumRemittanceNew) //записываем в переменную результат вызова функции

        assertEquals(true, result)
    }

    @Test
    fun isExceedLimitDayVisa() {
        val typeCard = "Мир"
        val sumRemittanceNew = 180_000

        val result = isExceedLimitDay(typeCard, sumRemittanceNew) //записываем в переменную результат вызова функции

        assertEquals(false, result)
    }

    @Test
    fun isExceedLimitDayMasterCardBad() {
        val typeCard = "MasterCard"
        val sumRemittanceNew = 900_000

        val result = isExceedLimitDay(typeCard, sumRemittanceNew) //записываем в переменную результат вызова функции

        assertEquals(false, result)
    }

    @Test
    fun isExceedLimitDayVKPay() {
        val typeCard = "VK Pay"
        val sumRemittanceNew = 110_000

        val result = isExceedLimitDay(typeCard, sumRemittanceNew) //записываем в переменную результат вызова функции

        assertEquals(true, result)
    }

    @Test
    fun isExceedLimitDayVKPayFalse() {
        val typeCard = "VK Pay"
        val sumRemittanceNew = 10_000

        val result = isExceedLimitDay(typeCard, sumRemittanceNew) //записываем в переменную результат вызова функции

        assertEquals(false, result)
    }

    @Test
    fun isExceedLimitDayElse() {
        val typeCard = "VK"
        val sumRemittanceNew = 100_000

        val result = isExceedLimitDay(typeCard, sumRemittanceNew) //записываем в переменную результат вызова функции

        assertEquals(false, result)
    }

    @Test
    fun isExceedLimitMonthMasterCard() {
        val typeCard = "MasterCard"
        val sumRemittanceMonthAgo = 1_000_00
        val sumRemittanceNew = 130_000

        val result = isExceedLimitMonth(typeCard, sumRemittanceMonthAgo, sumRemittanceNew)

        assertEquals(true, result)
    }

    @Test
    fun isExceedLimitMonthVisa() {
        val typeCard = "Visa"
        val sumRemittanceMonthAgo = 2_000_00
        val sumRemittanceNew = 110_000

        val result = isExceedLimitMonth(typeCard, sumRemittanceMonthAgo, sumRemittanceNew)

        assertEquals(true, result)
    }

    @Test
    fun isExceedLimitMonthVKPay() {
        val typeCard = "VK Pay"
        val sumRemittanceMonthAgo = 3_000_00
        val sumRemittanceNew = 120_000

        val result = isExceedLimitMonth(typeCard, sumRemittanceMonthAgo, sumRemittanceNew)

        assertEquals(false, result)
    }

    @Test
    fun isExceedLimitMonthVKPay2() {
        val typeCard = "VK Pay"
        val sumRemittanceMonthAgo = 300
        val sumRemittanceNew = 120

        val result = isExceedLimitMonth(typeCard, sumRemittanceMonthAgo, sumRemittanceNew)

        assertEquals(true, result)
    }

    @Test
    fun isExceedLimitMonthElse() {
        val typeCard = "VK"
        val sumRemittanceMonthAgo = 2_000_00
        val sumRemittanceNew = 110_000

        val result = isExceedLimitMonth(typeCard, sumRemittanceMonthAgo, sumRemittanceNew)

        assertEquals(false, result)
    }

    @Test
    fun calcCommissionMasterCard() {
        val typeCard = "MasterCard"
        val sumRemittanceMonthAgo = 3_000_00
        val sumRemittanceNew = 120_000

        val result = calcCommission(typeCard, sumRemittanceMonthAgo, sumRemittanceNew)

        assertEquals(740, result)
    }

    @Test
    fun calcCommissionMasterCardWithoutCommission() {
        val typeCard = "MasterCard"
        val sumRemittanceMonthAgo = 300
        val sumRemittanceNew = 1_000

        val result = calcCommission(typeCard, sumRemittanceMonthAgo, sumRemittanceNew)

        assertEquals(0, result)
    }

    @Test
    fun calcCommissionMaestro() {
        val typeCard = "Maestro"
        val sumRemittanceMonthAgo = 3_000_00
        val sumRemittanceNew = 120_000

        val result = calcCommission(typeCard, sumRemittanceMonthAgo, sumRemittanceNew)

        assertEquals(740, result)
    }

    @Test
    fun calcCommissionVisa() {
        val typeCard = "Visa"
        val sumRemittanceMonthAgo = 2_000_00
        val sumRemittanceNew = 110_000

        val result = calcCommission(typeCard, sumRemittanceMonthAgo, sumRemittanceNew)

        assertEquals(825, result)
    }

    @Test
    fun calcCommissionMir() {
        val typeCard = "Мир"
        val sumRemittanceMonthAgo = 20
        val sumRemittanceNew = 1

        val result = calcCommission(typeCard, sumRemittanceMonthAgo, sumRemittanceNew)

        assertEquals(35, result)
    }

    @Test
    fun calcCommissionVisaIs() {
        val typeCard = "Visa"
        val sumRemittanceMonthAgo = 6_000_00
        val sumRemittanceNew = 110_000

        val result = calcCommission(typeCard, sumRemittanceMonthAgo, sumRemittanceNew)

        assertEquals(-1, result)
    }

    @Test
    fun calcCommissionVKPay() {
        val typeCard = "VK Pay"
        val sumRemittanceMonthAgo = 0
        val sumRemittanceNew = 0

        val result = calcCommission(typeCard, sumRemittanceMonthAgo, sumRemittanceNew)

        assertEquals(-2, result)
    }

    @Test
    fun calcCommissionElse1() {
        val typeCard = "VK Pay"
        val sumRemittanceMonthAgo = 700_000
        val sumRemittanceNew = 160_000

        val result = calcCommission(typeCard, sumRemittanceMonthAgo, sumRemittanceNew)

        assertEquals(-1, result)
    }

    @Test
    fun calcCommissionElse2() {
        val typeCard = "VK"
        val sumRemittanceMonthAgo = 700_000
        val sumRemittanceNew = 160_000

        val result = calcCommission(typeCard, sumRemittanceMonthAgo, sumRemittanceNew)

        assertEquals(-2, result)
    }

    @Test
    fun calcCommissionVisaLimitMany() {
        val typeCard = "Visa"
        val sumRemittanceMonthAgo = 2_000_00
        val sumRemittanceNew = 110_000

        val result = calcCommission(typeCard, sumRemittanceMonthAgo, sumRemittanceNew)

        assertEquals(825, result)
    }

    @Test
    fun sumRemittanceWithCommision() {
        val typeCard = "MasterCard"
        val sumRemittanceMonthAgo = 3_000_00
        val sumRemittanceNew = 120_000

        val result = sumRemittanceWithCommision(typeCard, sumRemittanceMonthAgo, sumRemittanceNew)

        assertEquals(120740, result)
    }

    @Test
    fun sumRemittanceWithCommision2() {
        val typeCard = "MasterCard"
        val sumRemittanceMonthAgo = 3_000_00
        val sumRemittanceNew = 920_000

        val result = sumRemittanceWithCommision(typeCard, sumRemittanceMonthAgo, sumRemittanceNew)

        assertEquals(-2, result)
    }

    @Test
    fun sumRemittanceWithCommision1() {
        val typeCard = "MasterCard"
        val sumRemittanceMonthAgo = 6_000_00
        val sumRemittanceNew = 20_000

        val result = sumRemittanceWithCommision(typeCard, sumRemittanceMonthAgo, sumRemittanceNew)

        assertEquals(-1, result)
    }

    @Test
    fun printSumRemmittance() {
        val typeCard = "MasterCard"
        val sumRemittanceMonthAgo = 0
        val sumRemittanceNew = 20_000

        val result = printSumRemmittance(typeCard, sumRemittanceMonthAgo, sumRemittanceNew)

        assertEquals(kotlin.Unit, result)
    }


}