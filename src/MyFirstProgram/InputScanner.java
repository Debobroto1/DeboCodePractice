package MyFirstProgram;

import java.util.Scanner;

public class InputScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("What is your name? ");
		String name=sc.nextLine();
		System.out.println("Enter your age: ");
		int age=sc.nextInt();  /*after use nextInt method does not read the \n character 
		*either use next() for next string input or call the 
		*sc.nextLine() method as it reads the \n char
		*/
		sc.nextLine();
		System.out.println("what is your favorite food: ");
		String food=sc.nextLine();
		System.out.println("****************Your Details*******************");
		System.out.println("Your name: " +name);		
		System.out.println("Your are " +age+ " years old");
		System.out.println("Your favorite food " +food);
		
		sc.close();
		
		
		
		
		
	}

}
