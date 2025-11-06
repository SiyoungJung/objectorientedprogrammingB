package exam1105.exam03;

public class FulltimeEmployee extends Employee {
    int annualSalary;

    @Override
    int calculatePay() {
        return annualSalary/12;
    }

    public FulltimeEmployee(String name, String employeeId, int annualSalary) {
        super(name, employeeId);
        this.annualSalary = annualSalary;
    }
}
