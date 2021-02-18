package package1;
import package2.*;

public class A {

	protected String protectedMessage = "This is protected";

	public static void main(String[] args) {
		
		C c = new C();
//		System.out.println(c.defaultMessage);
		// c.defaultMessage 는 같은 package에서만 사용 가능.
		System.out.println(c.publicMessage);
		
		// public을 붙이면 다른 package에서도 사용 가능
		// class도 public이 없다면 다른 package에서 사용 불가		
	}

}
