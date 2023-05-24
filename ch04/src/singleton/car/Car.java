package singleton.car;

public class Car {
	private static int serialNum = 10000;
	private int carNum; // instance 변수
	
	// 생성자
	public Car() {
		serialNum++;
		carNum = serialNum;
	}
	// 차 번호 가져올 메서드
	public int getCarNum() {
		return carNum;
	}
}
