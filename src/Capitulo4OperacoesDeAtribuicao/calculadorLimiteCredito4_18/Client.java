package Capitulo4OperacoesDeAtribuicao.calculadorLimiteCredito4_18;

public class Client {

    private int accountNumber;
    private int beginningMonthBalance;
    private int totalCharges;
    private int totalCredit;
    private int creditLimit;

    public Client(int accountNumber, int beginningMonthBalance, int totalCharges, int totalCredit,
                  int creditLimit) {
        this.accountNumber = accountNumber;
        this.beginningMonthBalance = beginningMonthBalance;
        this.totalCharges = totalCharges;
        this.totalCredit = totalCredit;
        this.creditLimit = creditLimit;
    }

    public int newBalance(){
        return beginningMonthBalance + totalCharges - totalCredit;
    }


    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getBeginningMonthBalance() {
        return beginningMonthBalance;
    }

    public void setBeginningMonthBalance(int beginningMonthBalance) {
        this.beginningMonthBalance = beginningMonthBalance;
    }

    public int getTotalCharges() {
        return totalCharges;
    }

    public void setTotalCharges(int totalCharges) {
        this.totalCharges = totalCharges;
    }

    public int getTotalCredit() {
        return totalCredit;
    }

    public void setTotalCredit(int totalCredit) {
        this.totalCredit = totalCredit;
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(int creditLimit) {
        this.creditLimit = creditLimit;
    }
}

