package Capitulo3IntroducaoAClasses.removendoCodigoDuplicado3_15;

public class Account {

    private String name;
    private double balance;
    public Account(String name, double balance){
        this.name = name;
        if(balance > 0.0){
            this.balance = balance;
        }
    }

    public void deposit(double depositAmount){
        if(depositAmount > 0.0){
            balance += depositAmount;
        }
    }

    public static void displayAccount(Account account){
        System.out.printf("%s balance: $%.2f\n", account.name, account.balance);
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public void setName(String name) {
        this.name = name;
    }
}
