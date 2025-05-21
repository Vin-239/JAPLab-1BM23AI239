class LessBalanceException extends Exception {
    LessBalanceException(String message) {
        super(message);
    }
}

class Account {
    int accNo;
    String name;
    double balance;
    double MIN_BALANCE = 500;

    Account(int accNo, String name, double balance) {
        this.accNo = accNo;
        this.name = name;
        this.balance = balance;
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println(name + " deposited: Rs " + amount);
    }

    void withdraw(double amount) throws LessBalanceException {
        if (balance - amount < MIN_BALANCE) {
            throw new LessBalanceException("Withdrawal not allowed. Minimum balance Rs 500 must be maintained.");
        }
        balance -= amount;
        System.out.println(name + " withdrew: Rs " + amount);
    }

    void showBalance() {
        System.out.println(name + "'s current balance: Rs " + balance);
    }
}

public class Lab08 {
    public static void main(String[] args) {
        Account a1 = new Account(101, "Alice", 1000);
        Account a2 = new Account(102, "Bob", 1000);

        a1.deposit(500);
        a2.deposit(1000);

        try {
            a1.withdraw(800); // Should succeed
            a2.withdraw(1600); // Should throw exception
        } catch (LessBalanceException e) {
            System.out.println("\nException: " + e.getMessage());
        }

        a1.showBalance();
        a2.showBalance();
    }
}

