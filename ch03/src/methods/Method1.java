package methods;

public class Method1 {

	public static void main(String[] args) {
		// 객체 (클래스에서 만드는 인스턴스) - 메모리에 로딩
		Method1 method = new Method1();
		
		System.out.println(method);
		// methods.Method1@58ceff1
		// 패키지   클래스     메모리주소(16진수)
		
		// 클래스 이름 - 패키지 이름, 클래스 이름
		
		sayHello();
		
		System.out.println(square(3));
	}

	// sayHello() 함수 생성 (return이 없는 함수 - void)
	// static을 붙인 이유 - 호출하는 쪽에서 new 객체 생성을 하지 않을때 사용
	public static void sayHello() {
		System.out.println("Hello~");
	}
	
	// 제곱수를 계산하는 함수 (return이 있는 함수 - void)
	public static int square(int x) {
		return x * x;
	}
}
