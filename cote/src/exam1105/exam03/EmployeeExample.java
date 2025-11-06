package exam1105.exam03;

public class EmployeeExample {
    public static void main(String[] args) {
        Employee e1 = new ParttimeEmployee("김다트", "2024-04-213", 15000, 5);
        Employee e2 = new FulltimeEmployee("박자바", "2022-01-413", 150000000);

        System.out.println(e1.calculatePay());
        System.out.println(e2.calculatePay());
    }
}
