package methods;

// 서브 클래스 - 함수가 아니라 () 넣으면 안됨
// MethodEx인 클래스를 만들기
class MethodEX{
	
	public void sayHello() {
		System.out.println("Hello~");
	}
	
	public void sayHello2(String name) {
		System.out.println("Hello~" + name);
	}
	
	// 두수를 더하는 함수
	public int add(int x, int y) {
		return x + y;
	}
}

// 메인 클래스
public class MethodTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MethodEX method = new MethodEX();
		
		// add() 함수 호출
		int value = method.add(10, 20);
		System.out.println(value);
		
		// sayHello2() 함수 호출
		method.sayHello2("안재훈");
		method.sayHello2("안재훈2");

	}
}
