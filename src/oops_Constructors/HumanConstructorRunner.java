package oops_Constructors;

public class HumanConstructorRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Human human1=new Human("Gublu",1,7.9);
		Human human2=new Human("Babi",33,85);
		
		System.out.println(human1.name);
		
		human1.eat();
		human2.drink();
		

	}

}
