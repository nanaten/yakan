package com.okuzawats.yakan

import org.junit.Test

class IntExtensionsTest {
    @Test
    fun testSucc_returnsSuccessor() {
        val target = 42

        val actual = target.succ()
        val expected = 43

        assert(actual == expected)
    }

    @Test
    fun testSucc_overflowsIfMaxValue() {
        val target = Int.MAX_VALUE

        val actual = target.succ()
        val expected = Int.MIN_VALUE

        assert(actual == expected)
    }

    @Test
    fun testSafeSucc_returnsSuccessor() {
        val target = 42

        val actual = target.safeSucc()
        val expected = 43

        assert(actual == expected)
    }

    @Test(expected = IllegalStateException::class)
    fun testSafeSucc_throwExceptionIfMaxValue() {
        val target = Int.MAX_VALUE

        val actual = target.safeSucc()
    }

    @Test
    fun testPred_returnsPredecessor() {
        val target = 42

        val actual = target.pred()
        val expected = 41

        assert(actual == expected)
    }

    @Test
    fun testPred_overflowsIfMinValue() {
        val target = Int.MIN_VALUE

        val actual = target.pred()
        val expected = Int.MAX_VALUE

        assert(actual == expected)
    }

    @Test
    fun testSafePred_returnsPredecessor() {
        val target = 42

        val actual = target.safePred()
        val expected = 41

        assert(actual == expected)
    }

    @Test(expected = IllegalStateException::class)
    fun testSafePred_throwExceptionIfMinValue() {
        val target = Int.MIN_VALUE

        val actual = target.safePred()
    }
}