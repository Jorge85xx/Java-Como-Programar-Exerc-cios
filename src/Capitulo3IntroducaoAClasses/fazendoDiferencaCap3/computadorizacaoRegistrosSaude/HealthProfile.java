package Capitulo3IntroducaoAClasses.fazendoDiferencaCap3.computadorizacaoRegistrosSaude;

public class HealthProfile {

    private String name;
    private String lastName;
    private String sex;
    private int month;
    private int day;
    private int year;
    private float height;
    private float weight;
    private int age;

    public HealthProfile(String name, String lastName, String sexo, int mes, int dia, int ano, float height, float weight) {
        this.name = name;
        this.lastName = lastName;
        this.sex = sexo;
        this.month = mes;
        this.day = dia;
        this.year = ano;
        this.height = height;
        this.weight = weight;
    }

    public int maximumHeartRatePerMinute(){
        return 220 - this.age;
    }
    public int[] targetHeartRatePerMinute(){
        int maxRate = this.maximumHeartRatePerMinute();
        int lowerBound = (int) (maxRate * 0.50);
        int upperBound = (int) (maxRate * 0.85);
        return new int[]{lowerBound, upperBound};
    }
    public int age(int currentYear, int currentMonth, int currentDay){
        int age;

        if (this.month > currentMonth || (this.month == currentMonth && this.day < currentDay)) {
            age = currentYear - year - 1;
        }else {
            age = currentYear - this.year;
        }
        this.age = age;

        return age;
    }

    public static double calculateBMI(int weight, double height) {
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

    public String getSexo() {
        return sex;
    }

    public void setSexo(String sexo) {
        this.sex = sexo;
    }

    public int getMes() {
        return month;
    }

    public void setMes(int mes) {
        this.month = mes;
    }

    public int getDia() {
        return day;
    }

    public void setDia(int dia) {
        this.day = dia;
    }

    public int getAno() {
        return year;
    }

    public void setAno(int ano) {
        this.year = ano;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }
}
