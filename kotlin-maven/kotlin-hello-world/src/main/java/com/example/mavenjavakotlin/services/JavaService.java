package com.example.mavenjavakotlin.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
public class JavaService {

    private static final Logger LOGGER = LoggerFactory.getLogger("JavaService");

    public void sayHello() {
        System.out.println("Java asys 'Hello World!'");
        LOGGER.info("Java asys 'Hello World!'");

    }
}
