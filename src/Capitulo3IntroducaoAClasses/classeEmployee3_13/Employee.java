package Capitulo3IntroducaoAClasses.classeEmployee3_13;

public class Employee {

    private String name;
    private String lastName;
    private double monthlySalary;

    public Employee(String name, String lastName, double monthlySalary) {
        this.name = name;
        this.lastName = lastName;
        if (monthlySalary > 0){
            this.monthlySalary = monthlySalary;
        }else {
            System.out.println("The monthly salary cannot be a negative value");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        if (monthlySalary > 0){
            this.monthlySalary = monthlySalary;
        }else {
            System.out.println("The monthly salary cannot be a negative value");
        }
    }
}
