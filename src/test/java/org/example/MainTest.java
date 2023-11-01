package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    //ADD METHOD TESTS
    @Test
    void return20_whenAIs10AndBIs10() {
        //GIVEN
        int a = 10;
        int b = 10;
        int expected = 20;
        //WHEN
        int actual = Main.add(a,b);
        //THEN
        assertEquals(expected, actual);
    }

    @Test
    void return45_whenAIs40AndBIs5() {
        //GIVEN
        int a = 40;
        int b = 5;
        int expected = 45;
        //WHEN
        int actual = Main.add(a,b);
        //THEN
        assertEquals(expected, actual);
    }

    //EVEN METHOD TESTS

    @Test
    void returnFalse_whenAIs11() {
        //GIVEN
        int a = 11;
        //WHEN
        boolean actual = Main.isEven(a);
        //THEN
        assertFalse(actual);
    }

    //MULTIPLY METHOD TEST
    @Test
    void return45_whenAIs9AndBIs5() {
        //GIVEN
        int a = 9;
        int b = 5;
        int expected = 45;
        //WHEN
        int actual = Main.multply(a, b);
        //THEN
        assertEquals(expected, actual);
    }


    @Test
    void return33_whenAIs11AndBIs3() {
        //GIVEN
        int a = 11;
        int b = 3;
        int expected = 33;
        //WHEN
        int actual = Main.multply(a,b);
        //THEN
        assertEquals(expected, actual);
    }

    //TEST TO UPPERCASE METHOD
    @Test
    void returnHALLO_whenWordInputIshallo() {
        //GIVEN
        String a = "hallo";
        String expected = "HALLO";
        //WHEN
        String actual = a.toUpperCase();
        //THEN
        assertEquals(expected, actual);
    }

    //TEST IS POSITIVE METHOD
    @Test
    void returnTrue_whenAIs3() {
        //GIVEN
        int a = 3;
        //WHEN
        boolean actual = Main.isPositive(a);
        //THEN
        assertTrue(actual);
    }
    @Test
    void returnFalse_whenAIs0() {
        //GIVEN
        int a = 0;
        //WHEN
        boolean actual = Main.isPositive(a);
        //THEN
        assertFalse(actual);
    }
    @Test
    void returnTrue_whenAIsMinus50() {
        //GIVEN
        int a = -50;
        //WHEN
        boolean actual = Main.isPositive(a);
        //THEN
        assertFalse(actual);
    }
}