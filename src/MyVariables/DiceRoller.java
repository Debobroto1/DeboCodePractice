package MyVariables;

import java.util.Random;

import javax.swing.JOptionPane;

public class DiceRoller {
	Random random;
	int number;
		
//	Local variable
//	DiceRoller(){
//		Random random=new Random();
//		int number=0;
//		roll(random, number);
//	}
//	void roll(Random random,int number) {
//		
//		number=random.nextInt(6) + 1;
//		System.out.println(number);
		
	DiceRoller(){
		roll();
		
	}
	void roll() {
		random=new Random();
		number=random.nextInt(6)+1;
		JOptionPane.showMessageDialog(null, number);		
	}
}
