package decoratorPattern;

public class GSave implements BankAccountDecorator {

    private BankAccount bankAccount;

    public GSave(BankAccount bankAccount) {
        setBankAccount(bankAccount);
    }

    @Override
    public void setBankAccount(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    @Override
    public String showAccountType() {
        String type = "GSave";
        return type;
    }

    @Override
    public Double getInterestRate() {
        Double rate = 0.025;
        return rate;
    }

    @Override
    public Double getBalance() {
        return this.bankAccount.getBalance();
    }

    @Override
    public String showBenefits() {
        String showBPrint = this.bankAccount.showBenefits() + ", GSave Transfer";
        return showBPrint;
    }

    @Override
    public Double computeBalanceWithInterest() {
        Double tempoBal = getBalance();
        Double balRate = tempoBal + (tempoBal * getInterestRate());
        return balRate;
    }

    @Override
    public String showInfo() {
        return this.bankAccount.showInfo();
    }
}
