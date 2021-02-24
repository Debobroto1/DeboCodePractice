package CopyObjects;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car1=new Car("Swift","Maruti",2020);
//		Car car2=new Car("Venue","Hyundai",2021);
		
		//method1
//		car2.copy(car1);
//		method 2
		Car car2=new Car(car1);
		
		
		System.out.println(car1);
		System.out.println(car2);
		System.out.println();
		System.out.println(car1.getMake());
		System.out.println(car1.getModel());
		System.out.println(car1.getYear());
		System.out.println();
		System.out.println(car2.getMake());
		System.out.println(car2.getModel());
		System.out.println(car2.getYear());

	}

}
