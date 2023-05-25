package fruits;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("1. 포도 | 2. 바나나 | 3. 복숭아");
		System.out.print("선택> ");
		
		// 묵시적 형변환
		int menu = Integer.parseInt(scan.nextLine());

		// 전역 변수 설정
		Fruit fruit = null;
			if(menu == 1) {
				fruit = new Grape();  // 부모타입으로 객체 생성 (Grape가 아닌)
			}else if(menu == 2) {
				fruit= new Banana();
			}else if(menu == 3) {
				fruit = new Peach();
			}
			fruit.showInfo();	// 각 객체의 정보 출력
			scan.close();
		}

}
