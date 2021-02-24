package StaticKeywordModifier;

public class StaticRunner {

	public static void main(String[] args) {
		// static = modifier. A single copy of a variable/method is created and shared.
				//			The class "owns" the static member
				
				Friend friend1 = new Friend("Gubs");
				Friend friend2 = new Friend("Bujs");
				Friend friend3 = new Friend("Rits");
				
				System.out.println(Friend.numberOfFriends);
				System.out.println(friend1.name);
 
	}

}
