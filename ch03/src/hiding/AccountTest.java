package hiding;

public class AccountTest {
	
	public static void main(String[] args) {
		// 계좌 객체 생성
		Account a1 = new Account("1000-1234", "이몽룡", 50000);
		Account a2 = new Account("085-060395-01-011", "안재훈", 9600000);
				
		System.out.println("계좌번호 : " + a1.getAno());
		System.out.println("계좌주 : " + a1.getOwner());
		System.out.println("계좌잔액 : " + a1.getBalance());
		
		System.out.println("계좌번호 : " + a2.getAno());
		System.out.println("계좌주 : " + a2.getOwner());
		System.out.println("계좌잔액 : " + a2.getBalance());
	}
}
