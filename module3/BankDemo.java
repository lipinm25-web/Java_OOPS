package module3;

class BankAccount {
    private String accountNumber;
    private double balance;

    
    BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    
    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        }
    }

    
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance!");
        }
    }
}

public class BankDemo {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount("12345", 1000);

        acc.deposit(500);
        acc.withdraw(300);

        System.out.println("Final Balance: " + acc.getBalance());
    }
}
