
public class encapsulation_and_copy {

	public static void main(String[] args) {
		// Encapsulation = attributes of a class will be hidden or private,
		//				   can be accessed only through methods (getters & setters)
		//				   You should make attributes private if you don't have a reason to make them public/protected\\\\\\\\\\\\\\\\\\\

		// private에 접근,수정 하기위해선 get_, set_ mothods를 추가적으로 만들어서 사용해야
		Car5 car = new Car5("Chevrolet","Camaro", 2021);
		Car5 car2 = new Car5("Ford","Mustang", 2022);
		
		// 객체를 카피하고싶을때
		// car2 = car;
		// 라고하면 car2의 주소 car과 같아짐..
		car2.copy(car);
		// 이렇게 하면 다른 주소값에 같은 값이 저장됨.
		
		Car5 car3 = new Car5(car);
		System.out.println(car3.getMake());
		System.out.println(car3.getModel());
		System.out.println(car3.getYear());
		System.out.println();
		
//		Car5(Car5 x){
//			this.copy(x);
//		}
//		를 정의 하여 사용 가
		
		// car.setYear(2022);
		
		System.out.println(car);
		System.out.println(car2);
		System.out.println();
		System.out.println(car.getMake());
		System.out.println(car.getModel());
		System.out.println(car.getYear());
		System.out.println();
		System.out.println(car2.getMake());
		System.out.println(car2.getModel());
		System.out.println(car2.getYear());
	}

}
