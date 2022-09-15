package com.demoqa;

import org.junit.jupiter.api.*;

public class JUniteDemoTest {

    @BeforeAll
    static void setUp(){
        System.out.println("### @BeforeAll");
    }

    @AfterAll
    static void tearUp(){
        System.out.println("### @AfterAll");
    }

    @BeforeEach
    void beforeEachTest(){
        // open("ya.test");
        System.out.println("###     @beforeEachTest");
    }

    @AfterEach
    void afterEachTest(){
        System.out.println("###     @afterEachTest");
    }


    @Test
    void simpleTestFirst(){
        System.out.println("###         @Test simpeTestFirst");
        Assertions.assertTrue(3>2);
    }

    @Test
    void simpleTestSecond(){
        System.out.println("###         @Test simpeTestSecond");
        Assertions.assertTrue(3>2);
    }

}
