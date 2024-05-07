package Capitulo3IntroducaoAClasses.fazendoDiferencaCap3.calculadoraDeFrequenciaCardiaca3_16;

public class HeartRates {
    private String name;
    private String lastName;
    private int day;
    private int month;
    private int year;

    private int age;

    public HeartRates() {
    }

    public HeartRates(String name, String sobrenome, int dia, int mes, int ano) {
        this.name = name;
        this.lastName = sobrenome;
        this.day = dia;
        this.month = mes;
        this.year = ano;
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


    //a fórmula para calcular a frequência cardíaca
    //máxima por minuto é 220 menos a idade em anos
    public int maximumHeartRatePerMinute(){
        return 220 - this.age;
    }

    //Sua frequência cardíaca alvo é um intervalo entre 50-85% da sua frequência cardíaca
    //máxima.
    public int[] targetHeartRatePerMinute(){
        int maxRate = this.maximumHeartRatePerMinute();
        int lowerBound = (int) (maxRate * 0.50);
        int upperBound = (int) (maxRate * 0.85);
        return new int[]{lowerBound, upperBound};
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

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
