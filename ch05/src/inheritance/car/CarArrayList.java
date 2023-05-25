package inheritance.car;

import java.util.ArrayList;

public class CarArrayList {
	

	public static void main(String[] args) {
		//  자동차를 3대 생성 - ArrayList에 추가
		
		// ArrayList 생성 완료
		ArrayList<Car> carList = new ArrayList<>(); 
		
		Car car1 = new Car("소나타", 2500);
		Car car2 = new Car("모닝", 2500);
		Car car3 = new Car("BMW", 2500);
		
		carList.add(car1);
		carList.add(car2);
		carList.add(car3);
		
		/* carList.add(new Car("페라리", 2500));
		carList.add(new Car("bmw", 1000));
		carList.add(new Car("아우디", 3000)); */
		
		// 특정한 요소 1개 검색
		System.out.println(carList.get(1).carInfo());
		
		// 전체 요소 출력
		for(int i=0; i<carList.size(); i++) {
			Car car = carList.get(i);
			System.out.println(car.carInfo());
		}
	}
}