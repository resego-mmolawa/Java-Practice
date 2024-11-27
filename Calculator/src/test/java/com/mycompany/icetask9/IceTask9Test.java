/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.icetask9;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author RC_Student_lab
 */
public class IceTask9Test {
    

    /**
     * Test of addition method, of class IceTask9.
     */
    @org.junit.jupiter.api.Test
    public void testAddition() {
        System.out.println("addition");
        int x = 7;
        int y = 5;
        IceTask9 instance = new IceTask9();
        int expResult = 12;
        int result = instance.addition(x, y);
        assertEquals(expResult, result);
    }

    /**
     * Test of subtraction method, of class IceTask9.
     */
    @org.junit.jupiter.api.Test
    public void testSubtraction() {
        System.out.println("subtraction");
        int x = 20;
        int y = 10;
        IceTask9 instance = new IceTask9();
        int expResult = 10;
        int result = instance.subtraction(x, y);
        assertEquals(expResult, result);
    }

    /**
     * Test of multiplication method, of class IceTask9.
     */
    @org.junit.jupiter.api.Test
    public void testMultiplication() {
        System.out.println("multiplication");
        int x = 6;
        int y = 3;
        IceTask9 instance = new IceTask9();
        int expResult = 18;
        int result = instance.multiplication(x, y);
        assertEquals(expResult, result);
    }

    /**
     * Test of division method, of class IceTask9.
     */
    @org.junit.jupiter.api.Test
    public void testDivision() {
        System.out.println("division");
        int x = 50;
        int y = 10;
        IceTask9 instance = new IceTask9();
        int expResult = 5;
        int result = instance.division(x, y);
        assertEquals(expResult, result);
    }

    /**
     * Test of main method, of class IceTask9.
     */
    @org.junit.jupiter.api.Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        IceTask9.main(args);
    }
    
}
