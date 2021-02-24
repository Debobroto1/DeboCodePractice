package Methods;

public class MethodExample {

	public static void main(String[] args) {
		// Methods - A block of code which is executed as soon as it is called upon.
		//hello();//invoking method
		String name="Debo";
		int age=33;
		
		hello(name, age);//Passing argument
		//Passing argument-the below method need to follow the argument type and should have similar parameters
	}
		
		static void hello(String n,int a) {
			System.out.println("Hello Method");
			System.out.print("Hey " +n+ " you are " +a+ " years old!" );
			
		}
	}


