public class overloaded_methods {

	public static void main(String[] args) {
	
		// overloaded methods = methods that share the same name but have different parameters
		// 						method name + parameter = method signature
		// 동일한 이름 메소드를 둘이상 동시에 정의하는 
		// 메소드 선언부의 반횐형과 메소드 이름이 반드시 같아야한다.
		// 매개변수의 갯수나 데이터형은 반드시 달라야한다.
		// 오버로딩된 메소드는 호출시 전달하는 인자를 통하여 구분됨
		
		double x = add(1.2, 2.3);
		System.out.println(x);
	}
	
	static int add(int a, int b) {
		System.out.println("This is overloaded method #1");
		return a+b;
	}
	
	static int add(int a, int b, int c) {
		System.out.println("This is overloaded method #2");
		return a+b+c;
	}
	
	static int add(int a, int b, int c, int d) {
		System.out.println("This is overloaded method #3");
		return a+b+c+d;
	}
	
	static double add(double a, double b) {
		System.out.println("This is overloaded method #4");
		return a+b;
	}
	
	static double add(double a, double b, double c) {
		System.out.println("This is overloaded method #5");
		return a+b+c;
	}
	
	static double add(double a, double b, double c, double d) {
		System.out.println("This is overloaded method #6");
		return a+b+c+d;
	}
}
