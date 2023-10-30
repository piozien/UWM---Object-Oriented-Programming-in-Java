public class TestBankAccount {
    public static void main(String[] args) {
        BankAccount ba1 = new BankAccount();
        ba1.setBalance(1250.50);
        System.out.println("Current balance: " + ba1.getBalance());
        ba1.deposit(67.20);
        System.out.println("Balance after deposit: " + ba1.getBalance());
        ba1.withdraw(100);
        System.out.println("Balance after withdraw: " + ba1.getBalance());
    }
}

class BankAccount {
    private double balance;

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }
}
