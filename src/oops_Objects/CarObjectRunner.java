package oops_Objects;

public class CarObjectRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car myCar1 = new Car();
		Car myCar2 = new Car();

		System.out.println(myCar1.make);
		System.out.println(myCar1.model);

		myCar1.drive();
		myCar1.brake();
		
		myCar2.drive();
	}
}
