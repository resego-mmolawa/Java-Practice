/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package org.yourcompany.yourproject;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author reseg
 */
public class LasagnaTest {
    
    public LasagnaTest() {
    }

    @org.junit.jupiter.api.BeforeAll
    public static void setUpClass() throws Exception {
    }

    @org.junit.jupiter.api.AfterAll
    public static void tearDownClass() throws Exception {
    }

    @org.junit.jupiter.api.BeforeEach
    public void setUp() throws Exception {
    }

    @org.junit.jupiter.api.AfterEach
    public void tearDown() throws Exception {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of expectedMinutesInOven method, of class Lasagna.
     */
    @org.junit.jupiter.api.Test
    public void testExpectedMinutesInOven() {
        System.out.println("expectedMinutesInOven");
        Lasagna instance = new Lasagna();
        int expResult = 0;
        int result = instance.expectedMinutesInOven();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of remainingMinutesInOven method, of class Lasagna.
     */
    @org.junit.jupiter.api.Test
    public void testRemainingMinutesInOven() {
        System.out.println("remainingMinutesInOven");
        int actualMin = 0;
        Lasagna instance = new Lasagna();
        int expResult = 0;
        int result = instance.remainingMinutesInOven(actualMin);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of preparationTimeInMinutes method, of class Lasagna.
     */
    @org.junit.jupiter.api.Test
    public void testPreparationTimeInMinutes() {
        System.out.println("preparationTimeInMinutes");
        int layers = 0;
        Lasagna instance = new Lasagna();
        int expResult = 0;
        int result = instance.preparationTimeInMinutes(layers);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of totalTimeInMinutes method, of class Lasagna.
     */
    @org.junit.jupiter.api.Test
    public void testTotalTimeInMinutes() {
        System.out.println("totalTimeInMinutes");
        int layers = 0;
        int actualMin = 0;
        Lasagna instance = new Lasagna();
        int expResult = 0;
        int result = instance.totalTimeInMinutes(layers, actualMin);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class Lasagna.
     */
    @org.junit.jupiter.api.Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Lasagna.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
