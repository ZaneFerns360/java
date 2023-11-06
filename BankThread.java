import java.util.Scanner;

class BankAccount {
    private int balance = 0;

    public synchronized void deposit(int amount) {
        balance += amount;
        System.out.println("Deposited: " + amount + ", Balance: " + balance);
    }

    public synchronized void withdraw(int amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrew: " + amount + ", Balance: " + balance);
        } else {
            System.out.println("Insufficient balance");
        }
    }
}

class DepositThread extends Thread {
    private BankAccount account;
    private int amount;

    public DepositThread(BankAccount account, int amount) {
        this.account = account;
        this.amount = amount;
    }

    public void run() {
        account.deposit(amount);
    }
}

class WithdrawThread extends Thread {
    private BankAccount account;
    private int amount;

    public WithdrawThread(BankAccount account, int amount) {
        this.account = account;
        this.amount = amount;
    }

    public void run() {
        account.withdraw(amount);
    }
}

public class BankThread {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter deposit amount:");
        int depositAmount = sc.nextInt();
        DepositThread depositThread = new DepositThread(account, depositAmount);

        System.out.println("Enter withdraw amount:");
        int withdrawAmount = sc.nextInt();
        WithdrawThread withdrawThread = new WithdrawThread(account, withdrawAmount);

        depositThread.start();
        withdrawThread.start();
    }
}

