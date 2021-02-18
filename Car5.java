
public class Car5 {
	private String make;
	private String model;
	private int year;
	
	Car5(String make, String model, int year){
//		this.make = make;
//		this.model = model;
//		this.year = year;
		// setSth 때문에 더이상 필요 없음
		this.setMake(make);
		this.setModel(model);
		this.setYear(year);
	}
	
	Car5(Car5 x){
		this.copy(x);
	}
	// constructor의 argument로 class가 들어왔을때 사용 
	
	public String getMake() {
		return make;
	}
	// private인 make로 직접적인 접근이 불가능해 함수로 간접적으로 접근
	public String getModel() {
		return model;
	}
	public int getYear() {
		return year;
	}
	
	public void setMake(String make) {
		this.make = make;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	public void copy(Car5 x) {
		this.setMake(x.getMake());
		this.setModel(x.getModel());
		this.setYear(x.getYear());
	}

}
