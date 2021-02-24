package Polymorphism;

public class Runner {

	public static void main(String[] args) {
		// Polymorphism - greek word for poly i.e. many morph means many
		// The ability of an object to identify as more than one type
		//Overriding and overloading
		Car car = new Car();
		Bicycle bicycle = new Bicycle();
		Boat boat = new Boat();

		Vehicle[] racers = { car, bicycle, boat };
		//Object is a class which can be used here Object[] racers= { car, bicycle, boat };
		for (Vehicle x : racers) {
			x.go();
		}
	}
}
