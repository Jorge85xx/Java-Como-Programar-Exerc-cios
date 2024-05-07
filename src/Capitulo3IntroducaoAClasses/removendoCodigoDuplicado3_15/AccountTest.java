package Capitulo3IntroducaoAClasses.removendoCodigoDuplicado3_15;

import java.util.Scanner;

public class AccountTest {

    public static void main(String[] args) {
        Account account1 = new Account("Jane Green", 50.00);
        Account account2 = new Account("John Blue", -7.53);

        Account.displayAccount(account1);
        Account.displayAccount(account2);

        Scanner input = new Scanner(System.in);

        System.out.print("Enter deposit amount for account1: ");
        double depositAmount = input.nextDouble();
        System.out.printf("%nadding %.2f to account1 balance%n%n",depositAmount);
        account1.deposit(depositAmount);

        Account.displayAccount(account1);
        Account.displayAccount(account2);

        System.out.print("Enter deposit amount for account2: ");
        depositAmount = input.nextDouble();
        System.out.printf("%nadding %.2f to account2 balance%n%n",depositAmount);
        account2.deposit(depositAmount);

        Account.displayAccount(account1);
        Account.displayAccount(account2);


    }

}
