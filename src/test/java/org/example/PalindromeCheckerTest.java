package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PalindromeCheckerTest {
    @Test
    public void testConPuntosYEspacios() {
        PalindromeChecker checker = new PalindromeChecker(); //  instancia de PalindromeChecker
        assertTrue(checker.isPalindrome("A man, a plan, a canal: Panama")); // llama metodo
    }

    @Test
    public void testMayusculaMinusculaPuntuacion(){
        PalindromeChecker checker = new PalindromeChecker();
        assertTrue(checker.isPalindrome("No ´X´ in Nixon"));
    }

    @Test
    public void testSimpleWord(){
        PalindromeChecker checker = new PalindromeChecker();
        assertTrue(checker.isPalindrome("racecar"));
    }

    @Test
    public void testNumericPalindrome(){
        PalindromeChecker checker = new PalindromeChecker();
        assertTrue(checker.isPalindrome("12321"));
    }

    @Test
    public void testNonPalindromeSentence(){
        PalindromeChecker checker = new PalindromeChecker();
        assertFalse(checker.isPalindrome("Hello, world!"));
    }

    @Test
    public void testEmptyString(){
        PalindromeChecker checker = new PalindromeChecker();
        assertTrue(checker.isPalindrome(""));
    }

    @Test
    public void testOnlyNonAlphanumericCharacters(){
        PalindromeChecker checker = new PalindromeChecker();
        assertTrue(checker.isPalindrome("!!!... ---"));
    }


    @Test
    public void testSingleCharacter(){
        PalindromeChecker checker = new PalindromeChecker();
        assertTrue(checker.isPalindrome("x"));
    }

    @Test
    public void testNullInputThrowsException() {
        PalindromeChecker checker = new PalindromeChecker();
        assertThrows(IllegalArgumentException.class, () -> checker.isPalindrome(null));
    }

    @Test
    public void testUnnSoloCaraNoLetra(){
        PalindromeChecker checker = new PalindromeChecker();
        assertTrue(checker.isPalindrome("@"));
    }

}