package school.cesar.eta.unit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PalindromeTest {
    private final Palindrome palindrome = new Palindrome();

    @Test
    public void palindrome_oneCharWord_true() {
        boolean actual = palindrome.check("a");
        Assertions.assertTrue(actual);
    }

    @Test
    public void palindrome_notPalindromeWord_false() {
        boolean actual = palindrome.check("ab");
        Assertions.assertFalse(actual);
    }

    @Test
    public void palindrome_palindromeWord_true() {
        boolean actual = palindrome.check("aa");
        Assertions.assertTrue(actual);
    }
}
