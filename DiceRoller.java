import java.util.Random;

public class DiceRoller {
//	DiceRoller(){
//		Random random = new Random();
//		int number = 0;
//		roll(random, number);
//	}
//	// random과 int는 DiceRoller scope안에서만 보이는 local variable이기 때문에 다른 methods에서 쓰기위해서 aruments로 넘겨줘야함.
//	
//	void roll(Random random, int number){
//		number = random.nextInt(6)+1;
//		System.out.println(number);
//	}
	
	Random random = new Random();
	int number = 0;
	
	DiceRoller(){
		roll();
	}
	
	void roll(){
		number = random.nextInt(6)+1;
		System.out.println(number);
	}
}
