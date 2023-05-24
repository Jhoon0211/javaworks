package singleton.car;

// main이 없는 것은 자료형
public class CarFactory {
	// 싱글톤 패턴
	private static CarFactory instance;
	
	// 생성자
	private CarFactory() {}
	
	// getInstance() 메서드
	// static = new안쓰기 위해 적는 것
	public static CarFactory getInstance() {
		if(instance == null) {
			instance = new CarFactory();
		}
		return instance;
	}
	
	// 자동차 생산
	public Car createCar() {
		Car car = new Car();
		return car;
	}
}