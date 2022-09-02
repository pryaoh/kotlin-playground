package com.example.introduction

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals


class KotlinJavaInteroperablitityUnitTest {
    @Test
    fun givenLowercaseString_WheExecuteMethodFromJavaStringUtils_shouldResutStringUppercase() {
        // given
        val name = "tom";

        // when
        val res = StringUtils.toUpperCase(name)

        // then
        assertEquals(res, "TOM")

        println(res);
    }
}