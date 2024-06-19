package Capitulo4OperacoesDeAtribuicao.calculadorSalarios4_20;

import java.util.Scanner;
/*Desenvolva um aplicativo Java que determina o salário bruto de cada um de três empregados. A empresa paga
as horas normais pelas primeiras 40 horas trabalhadas por cada funcionário e 50% a mais por todas as horas trabalhadas além das 40
horas. Você recebe uma lista de empregados, o número de horas trabalhadas por eles na semana passada e o salário-hora de cada um. Seu
programa deve aceitar a entrada dessas informações para cada empregado e, então, determinar e exibir o salário bruto do empregado.
Utilize a classe Scanner para inserir os dados.*/
public class SalaryCalculator {

    public static void main(String[] args) {
        boolean continuee = true;
        while(continuee) {
            System.out.println("-*-*-*-*-*SALARY CALCULATOR-*-*-*-*-*");
            Scanner input = new Scanner(System.in);
            System.out.print("How many hours did you work? ");
            int hours = input.nextInt();
            System.out.print("How much is your hourly salary? ");
            float salary = input.nextFloat();
            if (hours > 40) {
                hours -= 40;
                salary = ((40 * salary) + (hours * (salary * 1.5f)));
            } else {
                salary = hours * salary;
            }
            System.out.println("The employee's gross salary is: " + salary);
            System.out.println("Do you want to continue? [1-Y/2-N]");
            if (input.nextInt() == 2) {
                continuee = false;
            }
        }


    }
}
