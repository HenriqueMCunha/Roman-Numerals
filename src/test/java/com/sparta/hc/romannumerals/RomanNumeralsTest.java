package com.sparta.hc.romannumerals;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;

public class RomanNumeralsTest {

    @Test
    public void check1EqualsI() {
        Assertions.assertEquals("I", RomanNumerals.arabicToRoman(1));
    }

    @Test
    public void check3EqualsIII() {
        Assertions.assertEquals("III", RomanNumerals.arabicToRoman(3));
    }

    @Test
    public void check4EqualsIV() {
        Assertions.assertEquals("IV", RomanNumerals.arabicToRoman(4));
    }

    @Test
    public void check5EqualsV() {
        Assertions.assertEquals("V", RomanNumerals.arabicToRoman(5));
    }

    @Test
    public void check9EqualsIX() {
        Assertions.assertEquals("IX", RomanNumerals.arabicToRoman(9));
    }

    @Test
    public void check10EqualsX() {
        Assertions.assertEquals("X", RomanNumerals.arabicToRoman(10));
    }

    @Test
    public void check19EqualsIXX() {
        Assertions.assertEquals("XIX", RomanNumerals.arabicToRoman(19));
    }

    @Test
    public void check49EqualsIL() {
        Assertions.assertEquals("XLIX", RomanNumerals.arabicToRoman(49));
    }

    @Test
    public void check84EqualsLXXXIV() {
        Assertions.assertEquals("LXXXIV", RomanNumerals.arabicToRoman(84));
    }
}
