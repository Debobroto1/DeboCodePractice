package interfaces;

public class Runner {
	public static void main(String[] args) {
		//Interfaces - 	a template that cab be applied to a class.
		//				similar to interfaces, but specifies what a class has/must do
		//				classes can apply more than one interfaces but they are limited to one 1 super class
		Rabbit rabbit=new Rabbit();
		rabbit.flee();
		Hawk hawk=new Hawk();
		hawk.hunt();
		Fish fish=new Fish();
		fish.hunt();
		fish.flee();
	}
}
