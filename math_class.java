import java.util.Scanner;

public class math_class {

	public static void main(String[] args) {
//		double x = 3.14;
//		double y = -10;
		
		// double z = Math.max(x, y); // 3.14
		// double z = Math.abs(y); // 10
		// double z = Math.sqrt(x); // 1.772004515
		// double z = Math.round(x); // 3.0
		// double z = Math.ceil(x); // always round up // 4.0
		// double z = Math.floor(x); // always round down // 3.0

		// System.out.println(z);
		
		double x;
		double y;
		double z;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter side x: ");
		x = scanner.nextDouble();
		System.out.println("Enter side y: ");
		y = scanner.nextDouble();
		
		z = Math.sqrt((x*x)+(y*y));
		
		System.out.println("The hypoitenuse is : "+z);
		
		scanner.close();
		
		
	} 

}