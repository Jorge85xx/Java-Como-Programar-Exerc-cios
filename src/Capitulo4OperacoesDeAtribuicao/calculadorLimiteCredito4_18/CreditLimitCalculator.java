package Capitulo4OperacoesDeAtribuicao.calculadorLimiteCredito4_18;

import java.util.Scanner;

/*(Calculador de limite de crédito) Desenvolva um aplicativo Java que determina se um cliente de uma loja de
departamentos excedeu o limite de crédito em uma conta-corrente.
Para cada cliente, os seguintes dados estão disponíveis:
a) Número de conta.
b) Saldo no início do mês.
c) Total de todos os itens cobrados desse cliente no mês.
d) Total de créditos aplicados ao cliente no mês.
e) Limite de crédito autorizado.
O programa deve inserir todos esses dados como inteiros, calcular o novo saldo (= saldo inicial + despesas – créditos),
exibir o novo saldo e determinar se o novo saldo excede ao limite de crédito do cliente. Para aqueles clientes cujo
limite de crédito foi excedido, o programa deve
exibir a mensagem "Limite de crédito excedido"*/

public class CreditLimitCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter account number: ");
        int accountNumber = scanner.nextInt();

        System.out.print("Enter beginning month balance: ");
        int beginningMonthBalance = scanner.nextInt();

        System.out.print("Enter total charges this month: ");
        int totalCharges = scanner.nextInt();

        System.out.print("Enter total credits this month: ");
        int totalCredit = scanner.nextInt();

        System.out.print("Enter credit limit: ");
        int creditLimit = scanner.nextInt();


        Client client = new Client(accountNumber, beginningMonthBalance, totalCharges, totalCredit, creditLimit);


        int newBalance = client.newBalance();
        System.out.println("New balance is: " + newBalance);


        if (newBalance > client.getCreditLimit()) {
            System.out.println("Credit limit exceeded.");
        } else {
            System.out.println("Credit limit not exceeded.");
        }

        scanner.close();

    }
}
