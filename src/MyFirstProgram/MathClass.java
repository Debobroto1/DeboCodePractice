package MyFirstProgram;

public class MathClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a = 3.14;
		double b = -10;
		double c = 10;

		double x = Math.max(a, b);
		System.out.println("max of a and b " + x);
		double y = Math.min(a, b);
		System.out.println("min of a and b " + y);

		int z = (int) Math.abs(b);
		double k = Math.sqrt(c);
		System.out.println("Floor value of a " + Math.floor(a));
		System.out.println("Celieng value of a " + Math.ceil(a));

		System.out.println("Sqrt of c" + k);
		System.out.println("Absolute value of b" + z);

	}

}
