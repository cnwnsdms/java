import java.util.Scanner;

public class scanner {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("what is your name? ");
		String name = scanner.nextLine();
		System.out.println("How old are you? ");
		int age = scanner.nextInt();
		scanner.nextLine(); 
		// int scanner 에서 입력한 \n을 int에서는 못받아드려 
		// 다음 스캐너에 \n이 자동으로 넘어가 \n을 받아줄 scanner가 하나 더 필
		System.out.println("What is your favorite food");
		String food = scanner.nextLine();
		System.out.println("Hello "+name);
		System.out.println("You are "+age+" Years old");
		System.out.println("You like "+food);
	}
}
