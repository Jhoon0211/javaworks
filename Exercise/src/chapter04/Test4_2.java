package chapter04;

public class Test4_2 {

	// 확인 2
	public static void main(String[] args) {
		int sum = 0;
		for (int i=0; i<=100; i++) {
			if (i % 3 == 0) {
				sum += i;
			}
		}
		System.out.println("3의 배수의 총 합 : " + sum);
	
	// 확인 3
	while (true) {
		int dice1 = (int)(Math.random()*6) + 1; 
		int dice2 = (int)(Math.random()*6) + 1;
			System.out.println(dice1 + "," + dice2);
		if(dice1 + dice2 == 5) {break;}
		}

	// 확인 5
	
	
	// 확인 6
	for(int i=0; i<4; i++) {
		for (int j=3; j>=0; j--) {
			if(i < j) {
				System.out.print(" ");
			}
			else { // j > i
				System.out.print("*");
			}
		}
		System.out.println();
	}
	
	}
}

