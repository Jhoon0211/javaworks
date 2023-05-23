package hello;

public class Hellojava {

	public static void main(String[] args) {
		// println() = 줄바꿈되며 출력
		/*
		 * 여러줄 주석
		 * 작성자 : 그린
		 * 자료형 - 숫자, 문자, 불리언, 배열
		 */
		System.out.println("Hello~ Java!");
		System.out.println(2.54);
		// 불리언(boolean) - true
		System.out.println(10 > -10);
		System.out.println(10+11);
		// 한 문자는 '' 홑따옴표 사용, 여러 문자는 쌍따옴표 사용		
		System.out.println(10 + '1'); // '1' = 49, 아스키코드로 인식 
		System.out.println(10 + "1"); // "1" = 문자열 연결, 큰 자료형쪽으로 형 변환

	} // main() 닫기

} // class() 닫기 - 클래스 이름은 첫글자를 대문자로 씀
