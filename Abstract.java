
public class Abstract {

	public static void main(String[] args) {
	
		// abstract : 초기화 불가. 메소드 내용 선언 불가. 메소드도 abstract 붙여야 함.
		//		      자식 class에 method override하고 자식 class를 인스턴스화해서 사용해야함.			  
		
		// Vehicle2 vehicle = new Vehicle2();
		Car4 car = new Car4();
		
		car.go();
	}

}
