package Capitulo2IntroducaoAplicativosJava;

import java.util.Scanner;

public class ValoresNegativosPositivosEZerp2_32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int negative = 0;
        int positive = 0;
        int zeros = 0;

        System.out.println("Enter 5 numbers:");

        int numberOne = scanner.nextInt();
        int numberTwo = scanner.nextInt();
        int numberThree = scanner.nextInt();
        int numberFour = scanner.nextInt();
        int numberFive = scanner.nextInt();

        if (numberOne < 0) {
            negative++;
        } else if (numberOne > 0) {
            positive++;
        } else {
            zeros++;
        }

        if (numberTwo < 0) {
            negative++;
        } else if (numberTwo > 0) {
            positive++;
        } else {
            zeros++;
        }

        if (numberThree < 0) {
            negative++;
        } else if (numberThree > 0) {
            positive++;
        } else {
            zeros++;
        }

        if (numberFour < 0) {
            negative++;
        } else if (numberFour > 0) {
            positive++;
        } else {
            zeros++;
        }

        if (numberFive < 0) {
            negative++;
        } else if (numberFive > 0) {
            positive++;
        } else {
            zeros++;
        }

        System.out.println("Negative numbers: " + negative);
        System.out.println("Positive numbers: " + positive);
        System.out.println("Zeros: " + zeros);

        scanner.close();
    }
}
