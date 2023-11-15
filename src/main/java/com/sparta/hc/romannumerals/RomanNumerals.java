package com.sparta.hc.romannumerals;

import java.util.Scanner;

public class RomanNumerals {

    private static final int[] ARABIC_NUMERAL_VALUES = {5000, 4000, 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
    private static final String[] ROMAN_NUMERAL_SYMBOLS = {"V̅", "MV̅", "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

    public static String arabicToRoman(int arabicNum) {
        StringBuilder romanResult = new StringBuilder();
        int i = 0;
        while (arabicNum > 0) {
            if (arabicNum >= ARABIC_NUMERAL_VALUES[i]) {
                romanResult.append(ROMAN_NUMERAL_SYMBOLS[i]);
                arabicNum -= ARABIC_NUMERAL_VALUES[i];
            } else {
                i++;
            }
        }
        return romanResult.toString();
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int arabicNumber = input.nextInt();
        String romanNumeral = arabicToRoman(arabicNumber);

        System.out.println(arabicNumber + " in Roman numerals is: " + romanNumeral);
    }




}
