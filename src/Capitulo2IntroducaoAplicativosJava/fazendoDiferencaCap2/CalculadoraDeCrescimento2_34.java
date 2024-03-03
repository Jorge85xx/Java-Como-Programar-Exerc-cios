package Capitulo2IntroducaoAplicativosJava.fazendoDiferencaCap2;

/*Utilize a internet para descobrir a população mundial atual e a taxa de crescimento demográfico mundial anual.
Escreva um aplicativo que introduza esses valores e, então, que exiba a população mundial estimada
depois de um, dois, três, quatro e cinco anos
população mundial atual (01/2024): 8.019.876.189
taxa de 1,1% ao ano
*/

public class CalculadoraDeCrescimento2_34 {
    public static void main(String[] args) {

        System.out.println("Global population in 2024: 8.019.876.189");
        System.out.println("With one tax of cresciment in 1.1% for year");
        long globalPopulation = 8019876189L;
        double growthRate = 1.011;
        long projectedPopulation2025 = (long) (globalPopulation * growthRate);
        long projectedPopulation2026 = (long) (projectedPopulation2025 * growthRate);
        long projectedPopulation2027 = (long) (projectedPopulation2026 * growthRate);
        long projectedPopulation2028 = (long) (projectedPopulation2027 * growthRate);
        long projectedPopulation2029 = (long) (projectedPopulation2028 * growthRate);

        System.out.printf("Global population in 2025: %d%n", projectedPopulation2025);
        System.out.printf("Global population in 2026: %d%n", projectedPopulation2026);
        System.out.printf("Global population in 2027: %d%n", projectedPopulation2027);
        System.out.printf("Global population in 2028: %d%n", projectedPopulation2028);
        System.out.printf("Global population in 2029: %d%n", projectedPopulation2029);



    }

}
