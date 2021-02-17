import java.util.Scanner;

public class loop {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String name = "";
		
		do {
			System.out.println("Enter your name");
			name = scanner.nextLine();
		}while(name.isBlank());
		//while과 차이: 최소 1번은 실행
		System.out.println("Hello"+name);
		
		for(int i=10; i>=0; i-=2) {
			System.out.println(i);
		}
		System.out.println("Happy new year");
	} 

}
