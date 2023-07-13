package collections.map;

import java.util.HashMap;

public class CarFactory {
	// 싱글톤 패턴
	private static CarFactory instance;
	// Map 자료구조 생성
	private HashMap<String, Car> carMap = new HashMap<>();
	
	private CarFactory() {}
	
	// 회사 인스턴스 생성됨
	public static CarFactory getInstance() {
		if(instance == null) 
			instance = new CarFactory();
		return instance;
	}
		
	// 자동차 회사가 자동차를 만드는 메서드
	public Car createCar(String type) {
		if(carMap.containsKey(type)) {
			return carMap.get(type);
		}
	
		Car car = new Car(); // 차 객체 생성
		carMap.put(type, car);
		return car;
	}
}
