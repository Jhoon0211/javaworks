package abstractex.phone;

public class PhoneTest {

	public static void main(String[] args) {
		// 추상 클래스는 객체 생성 불가
		// Phone phone = new Phone();
		
		// 스마트 폰 객체 생성
		SmartPhone smartPhone = new SmartPhone("이지능");
		
		smartPhone.powerOn();
		smartPhone.internetSearch();
		smartPhone.powerOff();
		
		
	}

}
