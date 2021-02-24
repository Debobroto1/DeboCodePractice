package interfaces;

public class Fish implements Prey,Predator{

	@Override
	public void hunt() {
		System.out.println("Big Fish is hunting small fish");
		
	}

	@Override
	public void flee() {
		System.out.println("Small Fish is fleeing from larger fish");
		
	}

}
