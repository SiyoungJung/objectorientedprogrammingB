package sec04.exam02;

public class ComputerExample {
	public static void main(String[] args) {
		Computer myCom = new Computer();
	
		int[] values1 = {1, 2, 3};
		int reslut1 = myCom.sum1(values1);
		 System.out.println("result1: " + reslut1);
		 
		 int reslut2 = myCom.sum1(new int[] {1, 2, 3, 4, 5});
		 System.out.println("result2: " + reslut2);
		 
		 int reslut3 = myCom.sum2(1, 2, 3);
		 System.out.println("result3: " + reslut3);
		 
		 int reslut4 = myCom.sum2(1, 2, 3, 4, 5);
		 System.out.println("result4: " + reslut4);
	}
}
