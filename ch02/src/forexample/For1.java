package forexample;

import java.util.Scanner;

public class For1 {

	public static void main(String[] args) {
		// 1부터 10까지 출력, 합계
		int sumV = 0; // 합계 변수
		
		for(int i=1; i<=10; i++) {
			sumV += i;
			System.out.println("i=" + i + ", sum=" + sumV);
		}
		System.out.println("합계: " + sumV);
		
		// 문자 세트 - 알파벳 출력 (대문자, 소문자)
		char ch = 65;
		for(ch = 65; ch < 123; ch++) {
			System.out.print(ch + " ");
		}
		
		// 유니코드 - 한글
		for(ch = 12593; ch < 12686; ch++) {
			System.out.print(ch + " ");
		}
		
		// 구구단
		//int dan = 4;
		//for(int i=1; i<=10; i++) {
		//	System.out.println(dan + "x" + i + "=" + (dan*i));
		//		}
		
		// 구구단 스캐너로 출력
		Scanner sc = new Scanner(System.in);
		
		System.out.print("단을 입력하세요 : ");
		int dan = sc.nextInt();
		
		for(int i=1; i<=10; i++) {
			System.out.println(dan + "x" + i + "=" + (dan*i));
		}
		sc.close();
	}

}
