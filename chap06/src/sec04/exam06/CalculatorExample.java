package sec04.exam06;

public class CalculatorExample {
    public static void main(String[] args) {
        Calculator Calc = new Calculator();

        double result1 = Calc.areaRectangle(10);

        double result2 = Calc.areaRectangle(10, 20);

        System.out.println("정시각형 넚이 = " + result1);
        System.out.println("직사각형 넓이 = " + result2);
    }
}
