package Capitulo2IntroducaoAplicativosJava.fazendoDiferencaCap2;

import java.util.Locale;
import java.util.Scanner;

//Calculadora de índice de massa corporal)
//Crie um aplicativo de calculadora IMC que leia o peso do usuário em libras e a altura em polegadas
// (ou, se preferir, o peso em quilogramas e a altura em metros) e,
// então, calcule e exiba o índice de massa corporal dele. Além disso, que exiba as seguintes informações do
// Department of Health and Human Services/National Institutes of Health, assim o usuário pode avaliar o seu IMC:

public class IMC2_33 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Body Mass Index (BMI) Calculator");
        System.out.println("Please choose the measurement system:");
        System.out.println("1- Pounds and Inches");
        System.out.println("2- Kilograms and Meters");
        System.out.print("Choose: ");
        int choice = scanner.nextInt();

        double bmi = 0;

        if (choice == 1) {
            System.out.print("Enter weight in pounds: ");
            int weightInPounds = scanner.nextInt();
            System.out.print("Enter height in inches: ");
            int heightInInches = scanner.nextInt();

            bmi = calculateBMIOne(weightInPounds, heightInInches);
        } else if (choice == 2) {
            System.out.print("Enter weight in kilograms: ");
            int weightInKilograms = scanner.nextInt();
            System.out.print("Enter height in meters: ");
            double heightInMeters = scanner.nextDouble();

            bmi = calculateBMITwo(weightInKilograms, heightInMeters); // Converting meters to centimeters
        } else {
            System.out.println("Invalid option.");
            return;
        }

        System.out.printf("Your BMI is: %.2f\n", bmi);
        displayBMIStatus(bmi);

        scanner.close();
    }


    public static double calculateBMIOne(int weight, double height) {
        return (double) weight * 703 / (height * height);
    }
    public static double calculateBMITwo(int weight, double height) {
        return (double) weight / (height * height);
    }

    public static void displayBMIStatus(double bmi) {
        System.out.println("BMI VALUES");
        System.out.println("Underweight: less than 18.5");
        System.out.println("Normal: between 18.5 and 24.9");
        System.out.println("Overweight: between 25 and 29.9");
        System.out.println("Obese: 30 or greater");
        System.out.println("---your status is:---");
        if (bmi < 18.5) {
            System.out.println("Status: Underweight");
        } else if (bmi >= 18.5 && bmi <= 24.9) {
            System.out.println("Status: Normal");
        } else if (bmi >= 25 && bmi <= 29.9) {
            System.out.println("Status: Overweight");
        } else {
            System.out.println("Status: Obese");
        }
    }
}
