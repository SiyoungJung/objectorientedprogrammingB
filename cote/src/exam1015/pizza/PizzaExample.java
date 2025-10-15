package exam1015.pizza;

import java.util.Scanner;

public class PizzaExample {
	public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int menuIndex = sc.nextInt();
       String size = sc.next();


       Pizza p;
       if (menuIndex == 1) {
           p = new CheesePizza(size);
       } else if (menuIndex == 2) {
           p = new PepperoniPizza(size);
       }  else if (menuIndex == 3) {
    	   String topping1 = sc.next();
    	   String topping2 = sc.next();
           p = new Banban(size, topping1, topping2);
       } else{
           p = new HawaiianPizza(size);
        }
       p.cook();
       p.serve();
    }
}
