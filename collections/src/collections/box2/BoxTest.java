package collections.box2;

public class BoxTest {

	public static void main(String[] args) {
		// 문자 자료형 사용
		Box<String> box1 = new Box<>();
		box1.set("행운을 빌어요!");
		String msg = box1.get();
		System.out.println(msg);
		
		// 정수 자료 사용
		Box<Integer> box2 = new Box<>();
		box2.set(100);
		Integer value = box2.get();
		System.out.println(value);
	}
}
