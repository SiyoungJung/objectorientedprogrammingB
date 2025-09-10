package cote.exam14681;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, y;
        x = sc.nextInt();
        y = sc.nextInt();

        if (x > 0 && y > 0)
            System.out.printf("1");

        else if (x < 0 && y > 0)
            System.out.printf("2");

        else if (x < 0 && y < 0)
            System.out.printf("3");

        else {
            System.out.printf("4");
        }
    }
}