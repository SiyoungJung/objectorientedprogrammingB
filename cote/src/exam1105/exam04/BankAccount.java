package exam1105.exam04;

public class BankAccount {
    private String name;
    private String accountNumber;
    private int balance;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public BankAccount() {
    }

    public BankAccount(String name, String accountNumber) {
        this.name = name;
        this.accountNumber = accountNumber;
    }

    public BankAccount(String name, String accountNumber, int balance) {
        this.name = name;
        this.balance = balance;
        this.accountNumber = accountNumber;
    }

    void withdraw(int amount) {
        if (amount <= balance) {
            balance = balance - amount;
            System.out.println(amount + "원 출금됨 남은 잔고: " + balance);
        } else  {
            amount = balance;
            balance = balance - amount;
            System.out.println(amount + "원 출금됨 남은 잔고: " + balance);
        }
    }

    void deposit(int amount) {
        balance = balance + amount;
        System.out.println(amount + "원 입금됨 남은 잔고: " + balance);
    }
}
