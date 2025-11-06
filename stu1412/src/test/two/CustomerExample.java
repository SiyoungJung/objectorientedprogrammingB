package test.two;

public class CustomerExample {

	public static void main(String[] args) {
		Customer cust1 = new Customer("홍길동", "010-9102-0001");
		Customer cust2 = new Customer("홍길서", "010-9102-0002", 100);
		
		System.out.println(cust1.updatePoint(50));
		System.out.println(cust2.updatePoint(-50));
		System.out.println(cust2.setPoint(200));
	}
}
