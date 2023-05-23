package input;

import java.util.Scanner;

public class Input1 {

	public static void main(String[] args) {
		// 입력 처리 - Scanner
		// java.util.Scanner 클래스를 import 하여 사용함
		Scanner scan = new Scanner(System.in);
		
		System.out.println("당신의 이름은 무엇입니까? ");
		String name = scan.nextLine(); // 콘솔창에 이름 입력
		System.out.println("당신의 이름은 " + name + "이군요! 반갑습니다");
		
		System.out.println("당신의 나이는 몇살입니까? ");
		int age = scan.nextInt();
		System.out.println(age + "살 " + name + "씨! 반갑습니다. 그럼 이만  기");
		
		
		scan.close();  // 닫기
		
	}

}
