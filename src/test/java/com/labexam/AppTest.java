package com.labexam;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {

    @Test
    public void testValidPalindrome() {
        App app = new App();
        // Test 1: Standard lowercase palindrome
        assertTrue(app.isPalindrome("apple"));
    }

    @Test
    public void testInvalidPalindrome() {
        App app = new App();
        // Test 2: Standard non-palindrome
        assertFalse(app.isPalindrome("jenkins"));
    }

    @Test
    public void testPalindromeWithSpacesAndMixedCase() {
        App app = new App();
        // Test 3: Complex palindrome (App.java handles spaces and lowercase conversion)
        assertTrue(app.isPalindrome("Race car"));
    }

    @Test
    public void testNullInput() {
        App app = new App();
        // Test 4: Edge case checking if the code handles null without crashing
        assertFalse(app.isPalindrome(null));
    }
}