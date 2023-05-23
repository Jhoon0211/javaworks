package methods;

public class Math1 {
	public static void main(String[] args) {
		// Math 클래스 사용 - 자바lang  패키지에 기본 내장되어있어서 
		// 따로 import 안해도 됨
		
		// abs() 절대값 함수 - int 
		int v1 = Math.abs(-7);
		System.out.println(v1);
		
		// round() 반올림 함수 - long형 사용
		long v2 = Math.round(5.7);
		System.out.println(v2);
		
		// floor() 버림 함수 - double형 사용
		double v3 = Math.floor(2.12);
		System.out.println(v3);
		
		// random() 무작위 수 함수 - double형 사용
		double v4 = Math.random();
		System.out.println(v4);
		
		// 가위바위보 (0,1,2) - int로 강제 형변환
		int 가위바위보 = (int) (Math.random()*3) + 1; 
		// + 1 하면 (1, 2, 3) 증가
		System.out.println(가위바위보);
	}
}
