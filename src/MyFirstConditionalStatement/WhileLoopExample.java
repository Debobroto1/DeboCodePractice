package MyFirstConditionalStatement;

import java.util.Scanner;

public class WhileLoopExample {

	public static void main(String[] args) {
		// while loop-executes as long as the block of code remains true
		Scanner sc=new Scanner(System.in);
		String name="";
		
		while(name.isEmpty()) {
			System.out.println("Enter your name: ");
			name=sc.nextLine();
			}		
		System.out.println("Hello " +name);
	}

}
