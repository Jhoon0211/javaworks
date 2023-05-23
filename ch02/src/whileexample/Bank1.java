package whileexample;

import java.util.Scanner;

public class Bank1 {

	public static void main(String[] args) {
		// 은행 업무 - 예금, 출금, 잔고확인
		Scanner sc = new Scanner(System.in);

		int balance = 0;	// 은행 잔고 
		boolean run = true; // 실행변수
		int money = 0; // 입, 출금액 
		
		while(run) {
				try {
				System.out.println("==================================");
				System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
				System.out.println("==================================");
				System.out.print("선택 > ");
				
				int selNum = Integer.parseInt(sc.nextLine());  // "1"을 숫자로 변환
			
	
				switch(selNum) {
				case 1: 
					System.out.print("예금액 > ");
					// 잔고 = 잔고 + 예금액 
					money = Integer.parseInt(sc.nextLine());
					balance += money;
					System.err.printf("%d원 정상적으로 입금되었습니다.\n", money);
					break;
				case 2: 
					System.out.print("출금액 > ");
					// 잔고 = 잔고 - 출금액 
					money = Integer.parseInt(sc.nextLine());
					balance -= money;
					System.err.printf("%d원이 정상적으로 출금되었습니다.\n", money);
					break;
				case 3: 
					System.out.println("잔고 > " + balance);
					// 잔고 = 잔고 + 예금액 
					break;
				case 4: 
					run = false;	// 종료
					System.out.println("프로그램을 종료합니다. \n이용해주셔서 감사합니다.");

					break;
				default :
					System.out.println("잘못된 입력값입니다. 다시 입력해주세요");
					break;
				}
			}catch(Exception e) {
				System.out.println("잘못된 입력입니다. 다시 입력해주세요");
			}
		}	// while() 
		//System.out.println("프로그램을 종료합니다.");
		System.out.println();
		sc.close();
	}
	

}
