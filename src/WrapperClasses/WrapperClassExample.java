package WrapperClasses;

public class WrapperClassExample {

	public static void main(String[] args) {
		/*Wrapper class=provides a way to use primitive data types as reference data types
		 * 				reference data types contain useful methods
		 * can be used with collection(ex: ArrayList)
		 * primitive	wrapper
		 * ---------	--------
		 * boolean		Boolean
		 * char			Character
		 * int			Integer
		 * double		Double
		 * -----------------------
		 * autoboxing =  the automatic conversion that the Java compiler makes between the primitive types and their corresponding object wrapper classes 
		 * unboxing = the reverse of autoboxing.Automatic conversion of wrapper class to primitive  (behaves like a raw primitive value)
		 */
		Boolean a=true; //autoboxing
		Character b ='@';
		Integer c=123;
		Double d=3.14;
		String e ="Bro";
		
		if(a==true) {
			System.out.println("This is unboxing");
		}
		
	}

}
