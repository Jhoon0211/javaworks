package classpart;

public class Number {

	int x;	// 멤버변수 - 클래스 안에선 멤버변수라고 함
	
	public Number() {	// 생성자
		x = 4;
	}
	
//	public Number(int y) {	// 매개변수가 있는 생성자 
//		x = y;
//	
//	}
	
	public Number(int x) {	// 매개변수가 있는 생성자 
		// 외부에서 입력한↑ 변수와 멤버 변수 이름이 같은 이름으로 설정하고 싶을때
		// this 사용
		this.x = x;
	}
	
	
	public static void main(String[] args) {

		// 기본 생성자로 생성
		Number myObj = new Number();
		System.out.println(myObj.x);
		
		// 매개변수가 있는 생성자로 생성하기
		Number myObj2 = new Number(7);
		System.out.println(myObj2.x);
	}

}
