package review5;

public class Test {
	
	public static void main(String[] args) {
		
		Car car=new Tesla("Tesla", "X", "Yellow");
		car.drive();
		car.start();
		car.stop();
		//car.charge(); cannot use
		
		Tesla tesla=new Tesla("Tesla", "X", "Green");
		tesla.drive();
		tesla.start();
		tesla.stop();
		tesla.charge();
	
		
		// new Car(); not possible because Car is abstract class
	}
}
