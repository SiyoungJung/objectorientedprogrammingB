package exam1022.emplo;

public class ExampleMain {
    public static void main(String[] args) {
        Employee[] emps = new Employee[2];
        emps[0] = new FullTimeEmployee("김민식", "2025-001", 57000000);
        emps[1] = new PartTimeEmployee("김민수", "2020-872", 35000, 100);

        for (int i = 0; i < emps.length; i++) {
            emps[i].calculatePay();
        }
    }
}
