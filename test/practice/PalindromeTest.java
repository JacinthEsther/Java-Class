package practice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PalindromeTest {
    @Test
    public void palindromeClassExist(){
        Palindrome1 palindrome = new Palindrome1();
        assertNotNull(palindrome);
    }

    @Test
    public void digitCanBeSeperatedTest(){
        Palindrome1 palindrome = new Palindrome1();
        palindrome.setDigit(12345);
        int expected = Integer.parseInt((1+ ""+2+ ""+3+ ""+4+ ""+5));
        assertEquals(expected, palindrome.getDigit());
    }

    @Test
    public void palindromeCanBeCheckedTest(){
        Palindrome1 palindrome = new Palindrome1();
        assertFalse(palindrome.checkPalindrome(12345));
    }
     @Test
    public void palindromeCanBeChecked_1Test(){
        Palindrome1 palindrome = new Palindrome1();
        assertTrue(palindrome.checkPalindrome(12321));
    }

  @Test
    public void palindromeCanBeCheckedUsingString_NumbersTest(){
        Palindrome1 palindrome = new Palindrome1();
        assertTrue(palindrome.checkStringNumbers("12321"));
    }


}
