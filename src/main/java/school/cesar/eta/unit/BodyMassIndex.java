package school.cesar.eta.unit;

public class BodyMassIndex {

    public String calculate(float bmi) {

        if (bmi < 16) {
            return "Severely Underweight";
        } else if (bmi < 25) {
            return "Underweight";
        } else if (bmi < 25) {
            return "Normal";
        } else if (bmi < 30) {
            return "Overweight";
        } else if (bmi < 35) {
            return "Obese Class 1";
        } else if (bmi < 40) {
            return "Obese Class 2";
        } else {
            return "Obese Class 3";
        }
    }
}
