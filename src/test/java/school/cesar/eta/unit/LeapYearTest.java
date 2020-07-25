package school.cesar.eta.unit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LeapYearTest {
    LeapYear leapYear = new LeapYear();

    @Test
    public void isLeapYear_notDivisibleBy4_false() {

        Assertions.assertFalse(leapYear.isLeapYear(1));
    }

    @Test
    public void isLeapYear_divisibleBy4_true() {

        Assertions.assertTrue(leapYear.isLeapYear(4));
    }

    @Test
    public void isLeapYear_divisibleBy100_false() {

        Assertions.assertFalse(leapYear.isLeapYear(100));
    }

    @Test
    public void isLeapYear_divisibleBy400_true() {

        Assertions.assertTrue(leapYear.isLeapYear(400));
    }
}
