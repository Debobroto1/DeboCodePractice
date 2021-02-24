package variableScope;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Garage garage=new Garage();
		
		Car car1=new Car("BMW");
		Car car2=new Car("Tesla");		
		
		garage.park(car2);
		
		

	}

}
