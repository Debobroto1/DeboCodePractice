package DynamicPolymorphism;

import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Polymorphism - many shapes //runtime
		// Dynamic = after compilation during runtime

		Scanner sc = new Scanner(System.in);
		Animal animal;
		System.out.println("What animal do you want");
		System.out.print("1=dog" + " / " + "2=cat" + "\n");
		int choice = sc.nextInt();
		System.out.println("Since you pressed " + choice + " now,");
		if (choice == 1) {
			animal = new Dog();
			animal.speak();
		} else if (choice == 2) {
			animal = new Cat();
			animal.speak();
		} else {
			animal = new Animal();
			animal.speak();
		}
	}

}
