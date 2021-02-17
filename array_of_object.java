
public class array_of_object {

	public static void main(String[] args) {
//		int[] numbers = new int[3];
//		char[] characters = new char[4];
//		String[] strings = new String[5];
		
		
		//Food[] refrigerator = new Food[3];
		
		
		Food food1 = new Food("pizza");
		Food food2 = new Food("hamburger");
		Food food3 = new Food("hotdog");
		Food[] refrigerator = {food1, food2, food3};
		
		// Food 가 하나의 type이라 생각하자. food1,2,3는 Food형이기 때문에 Food[]안에 담
		// -> 자료형 맞춰줘야함.
		
//		refrigerator[0] = food1;
//		refrigerator[1] = food2;
//		refrigerator[2] = food3;
		
		System.out.println(refrigerator[0].name);
		System.out.println(refrigerator[1].name);
		System.out.println(refrigerator[2].name);


	}

}
