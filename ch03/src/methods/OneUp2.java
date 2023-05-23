package methods;

public class OneUp2 {
	// 프로그램이 종료될때 소멸
	static int x = 0;	// static이 붙은 x는 정적 변수
						// 파이썬에서 global과 동일
	
	public static int oneUp() {
		x = x + 1;
		return x;
	}
	
	public static void main(String[] args) {
		System.out.println(oneUp());
		System.out.println(oneUp());
		System.out.println(oneUp());

		// x값 확인
		System.out.println("x = " +  x);
	}

}
