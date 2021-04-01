package com.controller;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCircularReference {

    @Test
    public void test1() {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring/applicationContext.xml");
    }

    @Test
    public void testSetBean() {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("classpath:spring/applicationContext2.xml");
    }
}
