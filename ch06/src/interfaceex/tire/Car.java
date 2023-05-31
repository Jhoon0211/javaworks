package interfaceex.tire;

public class Car {
	// 필드(객체) - 부모형으로 형 변환
	Tire frontLeftTire = new HanTire();
	Tire frontRightTire = new HanTire();
	Tire topLeftTire = new KumTire();
	Tire topRightTire = new KumTire();
	
	// 메서드
	public void run() {
		frontLeftTire.roll();
		frontRightTire.roll();
		topLeftTire.roll();
		topRightTire.roll();
	}
}
