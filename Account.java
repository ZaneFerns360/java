class BankAccount {
    int balance;
    int deposit;

    public BankAccount(int bal, int dep) {
        this.balance = bal;
        this.deposit = dep;
    }

    void getBalance() {
        System.out.println("Your Balance is " + balance);
    }
}

class CheckingAccount extends BankAccount {
    public CheckingAccount(int bal, int dep) {
        super(bal, dep);
    }

    public void chargeMonthlyFee() {

    }

    public void chargeTransferFee() {
    
    }
}

class SavingsAccount extends BankAccount {
    int interestRate;

    public SavingsAccount(int rate, int bal, int dep) {
        super(bal, dep);
        this.interestRate = rate;
    }

    public void depositInterest() {

    }

    public void checkBalanceLimit() {
    
    }
}

public class Account {
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount(2, 1000, 500);
        savingsAccount.getBalance();
    }
}

