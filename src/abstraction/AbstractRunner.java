package abstraction;

public class AbstractRunner {

	public static void main(String[] args) {
		// abstract =  	abstract classes cannot be instantiated, but they can have a subclass
		//				abstract methods are declared without an implementation,Basically abstract adds a layer of security
		// and prevents from creation of object
		Car car=new Car();
		
		car.go();

	}

}
