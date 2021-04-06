package MyFirstProgram;

import java.util.Random;

import javax.swing.JOptionPane;

public class RandomExample {

	public static void main(String[] args) {
		Random random = new Random();
		int x = random.nextInt(6) + 1;// Dice //+1 means the number will start from 1 and not 0
		double y = random.nextDouble(); //shows number between 01 and 1
		boolean z=random.nextBoolean();
		JOptionPane.showMessageDialog(null, x);
		System.out.println(y);
		System.out.println(z);
}
}
