package school.cesar.eta.unit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BodyMassIndexTest {
    BodyMassIndex bodyMassIndex = new BodyMassIndex();

    @Test
    public void calculate_bmiUnder16_severelyUnderweight() {

        String expected = "Severely Underweight";
        String actual = bodyMassIndex.calculate(15.9f);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void calculate_bmiOver16AndUnder18Dot5_underweight() {

        String expected = "Underweight";
        String actual = bodyMassIndex.calculate(18.4f);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void calculate_bmiOver18Dot5Under25_normal() {

        String expected = "Normal";
        String actual = bodyMassIndex.calculate(24.9f);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void calculate_bmiOver25Under30_overweight() {

        String expected = "Overweight";
        String actual = bodyMassIndex.calculate(29);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void calculate_bmiOver30Under35_obeseClass1() {

        String expected = "Obese Class 1";
        String actual = bodyMassIndex.calculate(33);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void calculate_bmiOver35Under40_obeseClass2() {

        String expected = "Obese Class 2";
        String actual = bodyMassIndex.calculate(39);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void calculate_bmiOver40_obeseClass3() {

        String expected = "Obese Class 3";
        String actual = bodyMassIndex.calculate(60);
        Assertions.assertEquals(expected, actual);
    }
}
