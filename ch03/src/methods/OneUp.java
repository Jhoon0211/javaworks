package methods;

public class OneUp {
	
	// 숫자 1이 증가하는 함수
	public static int oneUp() {
		// 지역변수 x는 값을 반환한 후 소멸한 것 
		int x = 0;
		x = x + 1;
		return x;
	}
	
	public static void main(String[] args) {
		System.out.println(oneUp());
		System.out.println(oneUp());
		
		// x값 확인
		//System.out.println(x); // x는 변수 할당하지 않아서 컴파일 오류
		
	}

}
