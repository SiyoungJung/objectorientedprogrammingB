package exam1015;

import  java.util.Scanner;

public class PizzaExample {
	public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int menuIndex = sc.nextInt();
       String size = sc.next();

       Pizza p;
       if (menuIndex == 1) {
           p = new CheesePizza(size);
       } else {
           p = new PepperoniPizza(size);
       }
       p.cook();
       p.serve();
    }
}
