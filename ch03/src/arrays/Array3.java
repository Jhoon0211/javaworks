package arrays;

public class Array3 {

	public static void main(String[] args) {
		// 문자열형 배열 선언 및 사용
		String[] cars = {"Morning", "Sonata", "Sportage", "K7"};
		
		//"Sonata"를 검색
		System.out.println(cars[1]);
		
		// System.out.println(cars[3] = 'BMW');		
		
		// K7을 BMW로 변경
		cars[3] = "BMW";
		
		// 전체 출력
		for(int i = 0; i < cars.length; i++) {
			System.out.print(cars[i] + " ");
		}	
		System.out.println();
		// 향상된 for 문
		// for(자료형 변수 : 배열 이름){}
		for(String car : cars) {
			System.out.print(car + " ");
		
		}
	}
}
