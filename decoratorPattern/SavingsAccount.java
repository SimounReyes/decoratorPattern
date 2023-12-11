package decoratorPattern;

public class SavingsAccount implements BankAccount {

    private String accountNumber;
    private String accountName;
    private Double balance;

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = ""+accountNumber;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    @Override
    public String showAccountType() {
        String type = "Savings Account";
        return type;
    }

    @Override
    public Double getInterestRate() {
        Double rate = 0.01;
        return rate;
    }

    @Override
    public Double getBalance() {
        return balance;
    }

    @Override
    public String showBenefits() {
        String benefit = "Standard Savings Account";
        return benefit;
    }

    @Override
    public Double computeBalanceWithInterest() {
        Double balRate = (balance * getInterestRate())+balance;
        return balRate;
    }

    @Override
    public String showInfo() {

        String print="Account number: " + this.accountNumber + "\nAccount name: " + this.accountName + "\nBalance: " + this.balance;
        return print;
    }
}
