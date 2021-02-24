package MyFirstProgram;

import java.util.Scanner;

public class Hypotenuse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double sideOne;
		double sideTwo;
		double sideThree;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter sideOne");
		sideOne=sc.nextDouble();
		System.out.println("Enter sideTwo");
		sideTwo=sc.nextDouble();
		
		sideThree=Math.sqrt((sideOne*sideOne)+(sideTwo*sideTwo));
		System.out.println("The length of sideThree: " +sideThree);
		sc.close();
		
	}

}
