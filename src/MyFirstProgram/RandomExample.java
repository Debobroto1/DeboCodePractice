package MyFirstProgram;

import java.util.Random;

import javax.swing.JOptionPane;

public class RandomExample {

	public static void main(String[] args) {
		Random random = new Random();
		int x = random.nextInt(6) + 1;// Dice
		// double y = random.nextDouble();
		// boolean z = random.nextBoolean();
		JOptionPane.showMessageDialog(null, x);
		//System.out.println(x);
	}
}
