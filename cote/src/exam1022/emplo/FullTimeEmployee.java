package exam1022.emplo;

public class FullTimeEmployee extends Employee{
    int annualSalary;
    @Override
    int calculatePay() {
        if (annualSalary == 0) {
            System.out.println("연봉 정보 없음");
            return 0;
        } else {
            int pay = annualSalary / 12;
            System.out.println(name + "=" + pay);
            return pay;
        }
    }
    public FullTimeEmployee(String name, String employeeId, int annualSalary) {
        this.name = name;
        this.employeeId = employeeId;
        this.annualSalary = annualSalary;
    }

    public FullTimeEmployee(String name, String employeeId) {
        this.name = name;
        this.employeeId = employeeId;
        annualSalary = 0;
    }

    String getName() {
        return name;
    }
}
