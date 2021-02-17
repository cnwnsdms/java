public class wrapper_class {

	public static void main(String[] args) {
	
//	wrapper class = provides a way to use primitive data types as reference data types
//					reference data types contain useful methods
//					can be used ith collections (ex.ArrayList)
//		
//	primitive		wrapper
//	---------		-------
//	boolean			Boolean
//	char			Character
//	int				Integer
//	double			Double
//	
//	autoboxing = the automatic conversion that the Java compiler makes between the primitive types 
//				 and their correspnding object wrapper class
//	unboxing = the reverse of autoboxing. Automatic conversion of wrapper class to primitive
		
		Boolean a = true; // wrapper class. mothods를 사용할수 있으나 unboxing과정을 거쳐야해 느
		Character b = '@';
		Integer c = 123;
		Double d = 3.14;
		String e = "Bro";
		
		if(a==true) {
			// unboxing이 진행되었음. 
			System.out.println("This is true");
		}
	
	}

}
