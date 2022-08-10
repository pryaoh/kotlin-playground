package com.example.assertFailsWith

class AssertFailsWithFunction {
    fun assertFailsWithMessage(){
        val array = intArrayOf(1, 2, 3)
        array[5]
    }

    fun assertFailsWithExceptionClass(){
        val message = "Kotlin Tutorials example".toInt()
    }

    fun assertFailsWithMessageAndExceptionClass(){
        val result = 50 * 12 / 0
    }
}