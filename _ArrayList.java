import java.util.ArrayList;

public class _ArrayList {

	public static void main(String[] args) {
		
	// ArrayList = a resizable array.
	// 				Elements can be added and removed after compilation phase
	//				store reference data types	
		ArrayList<String> food = new ArrayList<String>();
		// <> 안에는 wrapper class만 허용
		food.add("pizza");
		food.add("hamburger");
		food.add("hotdog");
		
		// usefull Array methods
		
		food.set(0, "sushi");
		food.remove(2);
		// food.clear();
	
		for(int i=0; i<food.size();i++) {
			// ArrayList는 .length가 아니라 .size()
			System.out.println(food.get(i));
		}
	}

}
