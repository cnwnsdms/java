
public class static_keyword {
	
	public static void main(String[] args) {
		
		// static = 해당 변수는 프로그램 실행시 메모리 영역에 독립적으로 존재함.
		// -> 그 변수가 선언되지 않은 클래스에서도 접근 가능하며 동시에 여러 클래스에 접근 가능.
		// -> 그 중 하나의 클래스에서 값을 변경하면 다른 클래스에서도 변경된 값으로 사용하게됨.
		
		
		Friend friend1 = new Friend("Sponegbob");
		Friend friend2 = new Friend("Patrick");
		Friend friend3 = new Friend("Squidward");

		System.out.println(Friend.numberOfFriends);
		// System.out.println(friend1.numberOfFriends);
		
		// static key를 빼주고 friend1.numberOfFriends로 접근하거나
		// static 유지하고 Friend.numberOfFriends로 접

		Friend.displayFriends();
		
		
	}
	
}
