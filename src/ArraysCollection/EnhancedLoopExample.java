package ArraysCollection;

import java.util.ArrayList;

public class EnhancedLoopExample {

	public static void main(String[] args) {
		ArrayList<String> animals=new ArrayList<String>();
		animals.add("Elephant");
		animals.add("Cat");
		animals.add("Dog");
		animals.add("Rat");
		
		for(String i: animals) {
			System.out.println(i);
			}		
	}
}
