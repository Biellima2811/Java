package entities;

public class ContaBanco {
    private int number;
    private String name;
    private double balance;
    public static final double TAXA_SAQUE = 5.0;

    public ContaBanco(int number, String name) {
        this.number = number;
        this.name = name;
    }

    public ContaBanco(int number, String name, double balance) {
        this.number = number;
        this.name = name;
        this.balance = balance;
    }

    public int getNumAccont() {
        return number;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }
    public void deposit(double value){
        this.balance += value;
    }
    public void withdraw(double value){
        this.balance -= (value + TAXA_SAQUE);
    }

    @Override
    public String toString() {
        return "ContaBanco{" +
                "numAccont=" + number +
                ", name='" + name + '\'' +
                ", balance=" + String.format("%.2f", balance) +
                '}';
    }
}
