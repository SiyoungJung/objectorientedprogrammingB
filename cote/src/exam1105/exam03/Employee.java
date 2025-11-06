package exam1105.exam03;

public abstract class Employee {
    String name;
    String employeeId;

    abstract int calculatePay();

    public Employee(String name, String employeeId) {
        this.name = name;
        this.employeeId = employeeId;
    }
}
