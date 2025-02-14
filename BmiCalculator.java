import java.util.Scanner;
public class BmiCalculator {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your weight in kilograms: ");
        double weight = sc.nextDouble();
        System.out.print("Enter your height in meters: ");
        double height = sc.nextDouble();
        double bmi = weight / (height * height);
        System.out.printf("Your BMI is: %.2f%n", bmi);
        System.out.println("BMI Classification: " + classifyBMI(bmi));
        sc.close();
    }
    public static String classifyBMI(double bmi) {
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi >= 18.5 && bmi < 24.9) {
            return "Normal weight";
        } else if (bmi >= 25 && bmi < 29.9) {
            return "Overweight";
        } else {
            return "Obesity";
        }
    }
}