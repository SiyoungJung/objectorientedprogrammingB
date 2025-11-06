package exam1105.exam03;

public class ParttimeEmployee extends Employee {
    int hourlyRate;
    int workHours;

    public ParttimeEmployee(String name, String employeeId, int hourlyRate, int workHours) {
        super(name, employeeId);
        this.hourlyRate = hourlyRate;
        this.workHours = workHours;
    }

    @Override
    int calculatePay() {
        return hourlyRate * workHours;
    }
}
