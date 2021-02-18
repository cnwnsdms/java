
public class _interface {
	public static void main(String[]args) {
		
		// interface = a template that can be applied to a class.
		//			   similar to inheritance, but specifies what a lass has/must do.
		//				classes can apply more than one interface, inheritance is limited to 1 super class
		
		Rabbit rabbit = new Rabbit();
		Hawk hawk = new Hawk();

		rabbit.flee();
		hawk.hunt();
		
		Fish fish = new Fish();
		fish.hunt();
		fish.flee();
	}
}
