package Capitulo3IntroducaoAClasses.fazendoDiferencaCap3.calculadoraDeFrequenciaCardiaca3_16;

import java.util.Scanner;

public class HeartRatesTest {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("-----HEART RATES-----");

        System.out.println("Enter with today:");
        int dayC = scanner.nextInt();
        System.out.println("Enter with current month:");
        int monthC = scanner.nextInt();
        System.out.println("Enter the current year:");
        int yearC = scanner.nextInt();

        scanner.nextLine();
        System.out.println("Enter the name:");
        String name = scanner.nextLine();
        System.out.println("Enter the last name:");
        String lastName = scanner.nextLine();
        System.out.println("Enter the day of birth:");
        int day = scanner.nextInt();
        System.out.println("Enter the month of birth:");
        int month = scanner.nextInt();
        System.out.println("Enter the year of birth:");
        int year = scanner.nextInt();


        HeartRates person = new HeartRates(name, lastName, day, month, year);


        System.out.println("\nPerson's Information:");
        System.out.println("Name: " + person.getName() + " " + person.getLastName());
        System.out.println("Date of Birth: " + person.getDay() + "/" + person.getMonth() + "/" + person.getYear());
        System.out.println("Age: " + person.age(yearC, monthC, dayC) + " years");

        int[] targetHeartRate = person.targetHeartRatePerMinute();
        System.out.println("Maximum Heart Rate Range: " + person.maximumHeartRatePerMinute() + " beats per minute");
        System.out.println("Target Heart Rate: " + targetHeartRate[0] + " - " + targetHeartRate[1] + " beats per minute");


    }
}
