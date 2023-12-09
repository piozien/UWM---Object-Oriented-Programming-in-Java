package rekord.zad10;

public record BankAccount(int accountNumber, double balance){
    public BankAccount(int accountNumber){
        this(accountNumber, 0.0);
    }
}
