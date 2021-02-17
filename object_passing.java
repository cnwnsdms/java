
public class object_passing {
	public static void main(String[] args) {
		Garage garage = new Garage();
		
		Car2 car = new Car2("BMW");
		Car2 car1 = new Car2("Tesla");
		
		garage.park(car);
		garage.park(car1);
		// Car2 타입을 argument로 넘기려면 해당 method에 parameter(Garage내)가 정의되어야함(parameter정의시 class type 명시) 
	}
	
}
