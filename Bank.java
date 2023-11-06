abstract class Bank {
    abstract int getBalance();
}

class BankA extends Bank {
    int getBalance() {
        return 100;
    }
}

class BankB extends Bank {
    int getBalance() {
        return 150;
    }
}

class BankC extends Bank {
    int getBalance() {
        return 200;
    }
}

public class Bank {
    public static void main(String[] args) {
        Bank bankA = new BankA();
        System.out.println("Bank A Balance: $" + bankA.getBalance());

        Bank bankB = new BankB();
        System.out.println("Bank B Balance: $" + bankB.getBalance());

        Bank bankC = new BankC();
        System.out.println("Bank C Balance: $" + bankC.getBalance());
    }
}

