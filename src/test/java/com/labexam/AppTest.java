package com.labexam;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {
    
    @Test
    public void testIsPalindrome() {
        App app = new App();
        
        // Should return true for valid palindromes
        assertTrue(app.isPalindrome("radar"));
        assertTrue(app.isPalindrome("madam"));
        
        // Should return false for non-palindromes
        assertFalse(app.isPalindrome("hello"));
        assertFalse(app.isPalindrome("jenkins"));
    }
}
