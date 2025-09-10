package cote.exam2753;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
	a = sc.nextInt();
    if (a % 400 == 0) b = 1;
	else if (a % 100 == 0) b = 0;
	else if (a % 4 == 0) b = 1;
	else b = 0;
    System.out.printf("%d", b);
    }
}
