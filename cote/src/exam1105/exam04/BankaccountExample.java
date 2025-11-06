package exam1105.exam04;

public class BankaccountExample {
    public static void main(String[] args) {
        BankAccount hana = new BankAccount("김자바", "111-910123-45607", 156000);
        hana.withdraw(500);
        hana.deposit(500);
        hana.withdraw(178000);
    }
}
