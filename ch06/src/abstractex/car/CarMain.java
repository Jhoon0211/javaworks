package abstractex.car;

public class CarMain {

	public static void main(String[] args) {
		// 부모 타입으로 bus 객체 생성(자동 형변환)
		Car car = new Bus();
		Car car1 = new Truck();
		
		car.run();
		car.refuel();

		
		
		// 다운 캐스팅(강제 형변환 - instanceof)
		// 만약 bus가 Bus의 객체라면
		if(car instanceof Bus) {
			Bus bus = (Bus)car;
			bus.takePassenger();
		}
		System.out.println("=====================");
		
		car1.run();
		car1.refuel();
		
		if(car1 instanceof Truck) {
			Truck truck = (Truck)car1;
			truck.load();
		}
	}
}
