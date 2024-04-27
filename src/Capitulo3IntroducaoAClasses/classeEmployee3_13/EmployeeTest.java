package Capitulo3IntroducaoAClasses.classeEmployee3_13;

public class EmployeeTest {

    public static void main(String[] args) {

        Employee woody = new Employee("Woody", "Cowboy", 2000);

        Employee buzz = new Employee("Buzz", "lightyear", 2000);

        System.out.println("-*-*-*-*-* OLD SALARY -*-*-*-*-*");
        System.out.println(woody.getMonthlySalary());
        System.out.println(buzz.getMonthlySalary());

        woody.setMonthlySalary(-89); //testando salario com número negativo
        System.out.println(woody.getMonthlySalary());

        System.out.println("-*-*-*-*-* NEW SALARY -*-*-*-*-*"); //salarios com aumento de 10%
        woody.setMonthlySalary(2200);
        buzz.setMonthlySalary(2200);
        System.out.println(woody.getMonthlySalary());
        System.out.println(buzz.getMonthlySalary());
    }


}
