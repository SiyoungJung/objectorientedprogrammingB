package exam1020.back;

public class BankAccount {
    private static int count = 0;
    private String name;
    private String accountNumber;
    private int balance;

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public static int getCount() {
        return count;
    }

    public BankAccount(String name, String accountNumber) {
        this(name, accountNumber, 0);
        count++;
    }

    public BankAccount(String name, String accountNumber, int balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
        count++;
    }

    public int withdraw(int amount) {
        if (amount <= balance) {
            this .balance -= amount;
        }
        return amount;
    }

    public int deposit(int amount) {
        this.balance += amount;
        return balance;
    }

    public int transfer(String to, int amount) {
        if (amount <= balance) {
            this .balance -= amount;
        }
        return balance;
    }
}
