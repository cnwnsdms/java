
public class Constructors {

	public static void main(String[] args) {
		
		Human human = new Human("Rick", 65, 70);
		Human human1 = new Human("Morty", 55, 60);

		System.out.println(human.name);
		System.out.println(human1.name);

		human1.eat();
		human1.drink();
		
		
	}

}
