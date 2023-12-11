package decoratorPattern;

public class UpSave implements BankAccountDecorator {

    private BankAccount bankAccount;

    public UpSave(BankAccount bankAccount) {
        setBankAccount(bankAccount);
    }

    @Override
    public void setBankAccount(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    @Override
    public String showAccountType() {
        String type = "UpSave";
        return type;
    }

    @Override
    public Double getInterestRate() {
        Double rate = .04;
        return rate;
    }

    @Override
    public Double getBalance() {
        return this.bankAccount.getBalance();
    }

    @Override
    public String showBenefits() {
        String showBPrint = this.bankAccount.showBenefits() + ", With Insurance";
        return showBPrint;
    }

    @Override
    public Double computeBalanceWithInterest() {
        Double tempoBal = getBalance();
        Double balRate = (tempoBal * getInterestRate())+tempoBal;
        return balRate;
    }

    @Override
    public String showInfo() {
        return this.bankAccount.showInfo();
    }
}
