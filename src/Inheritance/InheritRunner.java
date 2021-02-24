package Inheritance;

public class InheritRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cars car=new Cars();
		Bike bike=new Bike();
		
		car.go();
		bike.stop();
		
		System.out.println(car.speed);
		
		System.out.println(car.wheels);
		System.out.println(bike.wheels);
		

	}

}
