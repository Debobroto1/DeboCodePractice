package oops_Constructors;

public class Human {
	String name;
	int age;
	double weight;
	
	Human(String name,int age,double weight){
		this.name=name;
		this.age=age;
		this.weight=weight;
		
	}
	void eat() {
		System.out.println(this.name +" Eating");
	}
	void drink() {
		System.out.println(this.name+" Drinking");
	}
}
