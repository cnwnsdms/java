
public class printf {
	public static void main(String[] args) {
				
		//printf() = % [flags] [precision] [width] [conversion-character]
		
		boolean myBoolean = true;
		char myChar = '@';
		String myString ="Bro";
		int myInt = 50;
		double myDouble = 1000;
		
		// [conversion-character]
		System.out.printf("%b\n", myBoolean);
		System.out.printf("%c\n", myChar);
		System.out.printf("%s\n", myString);
		System.out.printf("%d\n", myInt);
		System.out.printf("%f\n", myDouble);

		// [width]
		// minimum number of characters to be written as output
		System.out.printf("Hello %10s\n", myString);
		System.out.printf("Hello %-10s\n", myString); // 빈칸이 뒤로옴
		
		// [precision]
		// sets number of digits of precision when outputting floating-point values
		System.out.printf("%.2f\n", myDouble);
		
		// [flags]
		System.out.printf("%+f\n", myDouble);
	//	System.out.printf("%-f\n", myDouble);
		System.out.printf("%20f\n", myDouble); // 나머지 다 0으로 채
		System.out.printf("%020f\n", myDouble);
		System.out.printf("%,.2f\n", myDouble);
		System.out.printf("%,10.2f\n", myDouble);


	}
}
