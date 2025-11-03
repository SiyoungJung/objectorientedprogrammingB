package exam1022.emplo;

public class PartTimeEmployee extends Employee {
    int hourlyRate;
    int workHours;

    @Override
    int calculatePay() {
        if (hourlyRate == 0) {
            if (workHours == 0) {
                System.out.println("시급, 근무 시간 정보 없음");
                return 0;
            } else {
                System.out.println("근무 시간 정보 없음");
                return 0;
            }
        } else {
            int pay = hourlyRate * workHours;
            System.out.println(name + "-" + pay );
            return pay;
        }
    }

    public PartTimeEmployee(String name, String employeeId) {
        this.name = name;
        this.employeeId = employeeId;
    }
    public PartTimeEmployee(String name, String employeeId, int hourlyRate) {
        this.name = name;
        this.employeeId = employeeId;
        this.hourlyRate = hourlyRate;
    }
    public PartTimeEmployee(String name, String employeeId, int hourlyRate, int workHours) {
        this.name = name;
        this.employeeId = employeeId;
        this.hourlyRate = hourlyRate;
        this.workHours = workHours;
    }
}
