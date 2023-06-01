package objects;

public class MemberTest {

	public static void main(String[] args) {
		
		Member obj1 = new Member("blue");
		Member obj2 = new Member("blue");
		Member obj3 = new Member("red");

		// 문자열 비교
		// hashCode()와 equals() 재정의 해야 함
		if(obj1.equals(obj2)) {
			System.out.println("obj1과 obj2는 일치합니다.");
		}else {
			System.out.println("obj1과 obj2는 일치하지 않습니다.");
		}
		if(obj1.equals(obj3)) {
			System.out.println("obj1과 obj3는 일치합니다.");
		}else {
			System.out.println("obj1과 obj3는 일치하지 않습니다.");
		}
		
	}

}
