package body;

import java.util.Scanner;

public class BodyMassIndex {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double weight, height, bmi;

        System.out.print("Your weight (in kilogram):");
        weight = scanner.nextDouble();

        System.out.print("Your height (in meter):");
        height = scanner.nextDouble();

        bmi = weight / Math.pow(height, 2);

        String interpretation;
        if (bmi < 18.5) {
            interpretation = "Underweight";
        } else if (bmi < 25.0) {
            interpretation = "Normal";
        } else if (bmi < 30.0) {
            interpretation = "Overweight";
        } else {
            interpretation = "Obese";
        }

        System.out.printf("%-20s%s%n", "BMI", "Interpretation");
        System.out.printf("%-20.2f%s%n", bmi, interpretation);

        scanner.close();
    }
}
