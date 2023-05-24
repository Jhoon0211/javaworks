package sales_statement;

public class Main {

	public static void main(String[] args) {
		// Drink 객체 생성
		Drink coffee = new Drink("커피", 2500, 10);
		Drink tea = new Drink("녹차", 3000, 4);
		// Alcohol 객체 생성
		Alcohol soju = new Alcohol("소주", 4000, 5, 15.5f);
				
		// Drink 출력
		Drink.printTitle();  // 클래스 이름으로 접근
		coffee.printData();  
		tea.printData();
		
		System.out.println();
		
		// Drink 출력
		Alcohol.printTitle();  // 클래스 이름으로 접근
		soju.printData();
		
		// 총 판매 금액
		int total = coffee.getTotalPrice() + tea.getTotalPrice()
					+ soju.getTotalPrice();
		
		System.out.printf("\n\n*** 합계 금액 : %d원 ***\n", total);
		

	}

}
