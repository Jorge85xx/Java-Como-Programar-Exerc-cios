package Capitulo3IntroducaoAClasses.fazendoDiferencaCap3.computadorizacaoRegistrosSaude;

import Capitulo3IntroducaoAClasses.fazendoDiferencaCap3.calculadoraDeFrequenciaCardiaca3_16.HeartRates;

import java.util.Scanner;

//Escreva um aplicativo Java que solicite as informações da pessoa, instancie um objeto da classe HealthProfile para
//ela e imprima as informações a partir desse objeto — incluindo nome, sobrenome, sexo, data de nascimento, altura e
// peso da pessoa ––, e
//então calcule e imprima a idade em anos, IMC, intervalo de frequência cardíaca máxima e frequência cardíaca alvo.
// Ele também deve exibir o gráfico de valores IMC do Exercício 2.33.
public class HealthProfileTest {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the name:");
        String name = input.nextLine();

        System.out.println("Enter the last name:");
        String lastName = input.nextLine();

        System.out.println("Enter the gender:");
        String sex = input.nextLine();

        System.out.println("Enter the birth month:");
        int month = input.nextInt();

        System.out.println("Enter the birth day:");
        int day = input.nextInt();

        System.out.println("Enter the birth year:");
        int year = input.nextInt();

        System.out.println("Enter the height (in meters):");
        float height = input.nextFloat();

        System.out.println("Enter the weight (in kilograms):");
        float weight = input.nextFloat();


        HealthProfile person = new HealthProfile(name, lastName, sex, month, day, year, height, weight);

        // Calculate age in years
        int currentYear = 2024; // Current year
        int currentMonth = 5; // Current month
        int currentDay = 12; // Current day
        int age = person.age(currentYear, currentMonth, currentDay);

        // Calculate BMI
        double bmi = HealthProfile.calculateBMI((int) weight, height);


        int[] targetHeartRate = person.targetHeartRatePerMinute();

        System.out.println("\nPerson's Information:");
        System.out.println("Name: " + person.getName() + " " + person.getLastName());
        System.out.println("Gender: " + person.getSexo());
        System.out.println("Date of Birth: " + person.getMes() + "/" + person.getDia() + "/" + person.getAno());
        System.out.println("Height: " + person.getHeight() + " meters");
        System.out.println("Weight: " + person.getWeight() + " kilograms");
        System.out.println("Age: " + age + " years");
        System.out.printf("BMI: %.2f\n", bmi);
        HealthProfile.displayBMIStatus(bmi);
        System.out.println("Maximum Heart Rate Range: " + person.maximumHeartRatePerMinute() + " beats per minute");
        System.out.println("Target Heart Rate: " + targetHeartRate[0] + " - " + targetHeartRate[1] + " beats per minute");

        input.close();
    }
}
