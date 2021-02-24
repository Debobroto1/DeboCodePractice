package ConstructorOverloading;

public class OverloadRunner {

	public static void main(String[] args) {

//		Overload constructor= multiple constructors within a class with same name, 
//		but have different parameters 
//		name + parameters = signature
		
		Pizza pizza=new Pizza("thick crust", "tomato", "mozarella", "chicken");
		System.out.println("Here is ");
		
		System.out.println("Here are the ingredients of your pizza: ");
		System.out.println(pizza.bread);
		System.out.println(pizza.sauce);
		System.out.println(pizza.cheese);
		System.out.println(pizza.topping);
			
	}

}
