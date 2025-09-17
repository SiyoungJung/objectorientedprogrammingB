package sec04.exam05;

public class CarExample {
	public static void main(String args) {
		Car myCar = new Car();
		myCar.KeyTurnOn();
		myCar.run();
		int speed = myCar.getSpeed();
		System.out.println("달립니다.(시속: " + speed + "km/h)");
	}
}
