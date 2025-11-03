package exam1020.back;

import java.util.Scanner;

public class BankAccountExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount ba = new BankAccount("gildong hong", "123-45-6789-00", 153000);
        BankAccount ba1 = new BankAccount("gilseo hong", "123-45-6789-09", 1293854768);
        ba.deposit(120000);
        System.out.println(ba.getBalance());
        ba.withdraw(120000);
        System.out.println(ba.getBalance());

        System.out.println(BankAccount.getCount());
    }
}
