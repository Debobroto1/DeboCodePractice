package MyFirstConditionalStatement;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String name="";
		
		do {
			System.out.println("Enter your name: ");
			name=sc.nextLine();
			}while(name.isEmpty());
		
		System.out.println("Hello " +name);
	}
	}


