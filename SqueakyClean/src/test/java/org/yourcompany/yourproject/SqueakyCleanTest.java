/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package org.yourcompany.yourproject;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/**
 *
 * @author reseg
 */
public class SqueakyCleanTest {

    public SqueakyCleanTest() {
    }

    @Test
    public void clean() {
        String input = "ST OP";
        String expected = "ST_OP";
        String actual = SqueakyClean.clean(input);

        assertEquals(expected, actual);
    }



}
