import java.util.Random;

public class random {

	public static void main(String[] args) {
		
		Random random = new Random();
		
		// int x = random.nextInt(6)+1; // limitied size from 1 to 6
		// double y = random.nextDouble(); // 0~1
		boolean z = random.nextBoolean(); // true or false
		System.out.println(z);
		
	} 

}
