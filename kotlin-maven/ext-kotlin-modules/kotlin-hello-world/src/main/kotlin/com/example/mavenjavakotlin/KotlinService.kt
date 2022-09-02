package com.example.mavenjavakotlin

import org.slf4j.Logger
import org.slf4j.LoggerFactory

class KotlinService {

    private val LOG = LoggerFactory.getLogger(KotlinService::class.java)

    fun sayHello() {
        System.out.println("Kotlin says 'Hello World!'")

        LOG.info("Kotlin says 'Hello World!'")
    }

}