package com.luv2code.junitdemo;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class DemoUtilsTest {

    private DemoUtils demoUtils;

    @BeforeAll
    public static void setUpClass() {
        System.out.println("@BeforeAll executes only once before all test methods");
    }

    @AfterAll
    public static void tearDownClass() {
        System.out.println("@AfterAll executes only once after all test methods");
    }

    @BeforeEach
    void setUpBeforeEach() {
        demoUtils = new DemoUtils();
        System.out.println("@BeforeEach executes before the execution of each test");
    }

    @AfterEach
    void tearDownAfterEach() {
        System.out.println("@AfterEach executes after the execution of each test");
        System.out.println();
    }

    @Test
    void testEqualsAndNotEquals() {
        System.out.println("Running test: testEqualsAndNotEquals");

        assertEquals(6, demoUtils.add(2, 4), "2+4 must be 6");
        assertNotEquals(6, demoUtils.add(1, 9), "1+9 must be 6");
    }

    @Test
    void testNullAndNotNull() {
        System.out.println("Running test: testNullAndNotNull");

        String str1 = null;
        String str2 = "luv2code";

        assertNull(demoUtils.checkNull(str1), "object should be null");
        assertNotNull(demoUtils.checkNull(str2), "object should not be null");
    }
}
