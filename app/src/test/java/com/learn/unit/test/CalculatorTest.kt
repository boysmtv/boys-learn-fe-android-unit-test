package com.learn.unit.test

import com.learn.unit.Calculator
import org.junit.jupiter.api.Assertions.*

import org.junit.jupiter.api.Test

class CalculatorTest {

    @Test
    fun add() {
        val calculator = Calculator()
        val expected = 10
        assertEquals(expected, calculator.add(5, 5))
    }

    @Test
    fun `Test calculator can subtract two numbers`() {
        val calculator = Calculator()
        assertEquals(5, calculator.sub(15, 10))
    }
}