package interfejsy_Comparable.zad21;

public class Client implements Comparable<Client>{
    private String lastName;
    private double balance;

    public Client(String lastName, double balance) {
        this.lastName = lastName;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() +
                "lastName: " + lastName  +
                ", balance: " + balance;
    }

    @Override
    public int compareTo(Client obj) {
        int balanceComparable = Double.compare(this.balance, obj.balance);
        if(balanceComparable != 0){
            return balanceComparable;
        }
        return this.lastName.compareTo(obj.lastName);
    }
}
