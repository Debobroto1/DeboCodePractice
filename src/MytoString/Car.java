package MytoString;

public class Car {

	String make = "Ford";
	String model = "Mustang";
	String color = "red";
	int year = 2021;

	public String toString() { //overriding the toString method

		return make + "\n" + model + "\n" + color + "\n" + year;

	}
}
