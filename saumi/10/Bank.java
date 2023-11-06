abstract class Bank {
    abstract float getBalance();
}

class BankA extends Bank {
    private float balance = 100;

    float getBalance() {
        return balance;
    }
}

class BankB extends Bank {
    private float balance = 150;

    float getBalance() {
        return balance;
    }
}

class BankC extends Bank {
    private float balance = 200;

    float getBalance() {
        return balance;
    }
}

class Main {
    public static void main(String[] args) {
        BankA bankA = new BankA();
        BankB bankB = new BankB();
        BankC bankC = new BankC();

        System.out.println("Balance in Bank A: Rs. " + bankA.getBalance());
        System.out.println("Balance in Bank B: Rs. " + bankB.getBalance());
        System.out.println("Balance in Bank C: Rs. " + bankC.getBalance());
    }
}
