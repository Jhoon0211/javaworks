package banking.bankarray;

import java.util.Scanner;


public class BankMain {
	// 통장 계좌를 만들 객체 배열 100개 생성
	// 전역 배열
	static Account[] accountArray = new Account[100];
	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		boolean run = true;
		
		while(run) {
			System.out.println("----------------------------------------");
			System.out.println("1. 계좌생성 | 2. 계좌목록 | 3. 예금 | 4. 출금 | 5. 종료");
			System.out.println("----------------------------------------");
			System.out.print("선택 > ");
			
			// 메뉴 선택 변수
			int selectNo = Integer.parseInt(scanner.nextLine());
			
			if(selectNo == 1) {
				createAccount(); // 계좌생성
			}else if(selectNo == 2) {
				getAccountList();	// 계좌목록
			}else if(selectNo == 3) {
				deposit();	// 예금
			}else if(selectNo == 4) {
				withdraw();	// 출금
			}else if(selectNo == 5) {
				run = false;
				System.out.println("프로그램을 종료합니다.");
			}
			else {
				System.out.println("지원되지 않는 기능입니다.");
			}
		} // while() 끝
	} // main() 끝
	
	// 계좌를 생성하는 함수
	private static void createAccount() {
		System.out.println("----------------------------------------");
		System.out.println("계좌생성");
		System.out.println("----------------------------------------");

		System.out.print("계좌번호: ");
		String ano = scanner.nextLine();
		
		System.out.print("계좌주: ");
		String owner = scanner.nextLine();
		
		System.out.print("초기입금액: ");
		int balance = Integer.parseInt(scanner.nextLine());
		
		// 첫번째 계좌 생성
		if(findAccount(ano) != null) {
			System.out.println("중복 계좌입니다. 다시 입력해 주세요.");
		}else {
			for(int i=0; i<accountArray.length; i++) { // 전체 배열 반복
			// 0번 인덱스가 새로 수정되는 문제발생
			Account account = findAccount(ano);
				if(accountArray[i] == null) {	// 계좌가 저장되지 않는 인덱스에
					accountArray[i] = new Account(ano, owner, balance); // 계좌를 생성
					System.out.println("결과 : 계좌가 생성되었습니다.");
					break;
				
				}
			}			
		}
	}
	
	// 계좌 목록을 출력하는 메서드
	private static void getAccountList() {
		for(int i=0; i<accountArray.length; i++) { 
			if(accountArray[i] != null) {	// 배열의 요소가 null이 아닌 경우출력(계좌가 있으면출력)
											// 출력할 계좌 저장
				System.out.print("계좌번호 : " + accountArray[i].getAno() + "\t |");
				System.out.print("계좌주 : " + accountArray[i].getOwner() + "\t |");
				System.out.println("잔액 : " +accountArray[i].getBalance());
			}
		}
	}

	// 계좌를 검색하는 메서드
	private static Account findAccount(String ano) {
		Account account = null;	// 빈 계좌 계정을 할당
		for(int i=0; i<accountArray.length; i++) { 
			if(accountArray[i] != null) {	// 찾는 계좌가 없으면 null
				String dbAno = accountArray[i].getAno(); // 이미 저장된 계정
				if(dbAno.equals(ano)) {	// 문자열 비교 - equals() 사용
					account = accountArray[i]; // 계좌를 가져와 저장
					break;	// 반복을 끝냄 (빠져나옴)
				}
			}	
		}
		return account;
	}
	
	// 계좌 입금하는 메서드
	private static void deposit() {
		System.out.println("----------------------------------------");
		System.out.println("예금");
		System.out.println("----------------------------------------");

		System.out.print("계좌번호: ");
		String ano = scanner.nextLine();
		
		System.out.print("입금액: ");
		int money = Integer.parseInt(scanner.nextLine());
		
		if(findAccount(ano) != null) {	// 계좌를 찾았다면
			// 예금 = 잔고 + 예금액
			// 매개변수 (지역변수)
			Account account = findAccount(ano);
			account.setBalance(account.getBalance()+money);
			System.out.println("결과: 정상 처리 되었습니다.");
		}else {	// 계좌가 없다면
			System.out.println("결과: 계좌가 존재하지 않습니다.");
		}
	}
	
	
	// 계좌를 출금하는 메서드
	private static void withdraw() {
		System.out.println("----------------------------------------");
		System.out.println("출금");
		System.out.println("----------------------------------------");

		System.out.print("계좌번호: ");
		String ano = scanner.nextLine();
		
		System.out.print("출금액: ");
		int money = Integer.parseInt(scanner.nextLine());

		if(findAccount(ano) != null) {	// 계좌를 찾았다면
			// 출금 = 잔고 - 출금액
			// 매개변수 (지역변수)
			Account account = findAccount(ano);
			if(money > account.getBalance()) {
				System.out.println("결과: 정상 처리 되었습니다.");
			}else  {
				account.setBalance(account.getBalance()-money);
				System.out.println("결과: 잔액이 부족합니다. 다시 입력해주세요.");
			}
		}else {	// 계좌가 없다면
			System.out.println("결과: 계좌가 존재하지 않습니다.");
		}
	}

	
	
	
} // Main 클래스 끝
