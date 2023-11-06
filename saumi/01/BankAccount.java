class BankAccount {
    protected double balance;

    public BankAccount(double initialBalance) {
        balance = initialBalance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds");
        }
    }

    public double getBalance() {
        return balance;
    }
}

class CheckingAccount extends BankAccount {
    private double monthlyFee;
    private double transactionFee;

    public CheckingAccount(double initialBalance, double monthlyFee, double transactionFee) {
        super(initialBalance);
        this.monthlyFee = monthlyFee;
        this.transactionFee = transactionFee;
    }

    public void chargeMonthlyFee() {
        balance -= monthlyFee;
    }

    public void chargeTransactionFee() {
        balance -= transactionFee;
    }
}

class SavingsAccount extends BankAccount {
    private double interestRate;
    private double balanceLimit;

    public SavingsAccount(double initialBalance, double interestRate, double balanceLimit) {
        super(initialBalance);
        this.interestRate = interestRate;
        this.balanceLimit = balanceLimit;
    }

    public void depositInterest() {
        balance += balance * interestRate;
    }

    public boolean checkBalanceLimit() {
        return balance >= balanceLimit;
    }
}

class Main {
    public static void main(String[] args) {
        CheckingAccount checkingAccount = new CheckingAccount(1000.0, 10.0, 1.0);
        SavingsAccount savingsAccount = new SavingsAccount(5000.0, 0.05, 1000.0);

        System.out.println("Checking Account Balance: Rs. " + checkingAccount.getBalance());
        System.out.println("Savings Account Balance: Rs. " + savingsAccount.getBalance());

        checkingAccount.chargeMonthlyFee();
        savingsAccount.depositInterest();
        checkingAccount.chargeTransactionFee();

        System.out.println("Checking Account Balance after charges: Rs. " + checkingAccount.getBalance());
        System.out.println("Savings Account Balance after interest deposit: Rs. " + savingsAccount.getBalance());

        if (savingsAccount.checkBalanceLimit()) {
            System.out.println("Savings Account balance is above the minimum limit.");
        } else {
            System.out.println("Savings Account balance is below the minimum limit.");
        }
    }
}
