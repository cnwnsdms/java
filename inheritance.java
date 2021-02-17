
public class inheritance {

	public static void main(String[] args) {
		
		Car3 car = new Car3();
		
		car.go();
		System.out.println(car.speed);
		System.out.println(car.doors);

		
		Bicycle bike = new Bicycle();
		
		bike.stop();
		System.out.println(bike.speed);
		System.out.println(bike.pedals);


	}

}
