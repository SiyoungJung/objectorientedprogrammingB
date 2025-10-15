package exam1015;

import java.util.Scanner;

public class OrderExample { 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Menu[] menus = new Menu[3];
		menus[0] = new Menu("사과", 2500);
		menus[1] = new Menu("자두", 2000);
		menus[2] = new Menu("맬론",  15000);
		
		int menuIndex = sc.nextInt();
		int quantity = sc.nextInt();
		
		OrderItem o1 = new OrderItem(menus[menuIndex - 1], quantity);
		System.out.println(o1.getPrice());
	}
}
