package whileexample;

public class while2 {
	
	public static void main(String[] args) {
		// while문 - 반복 조건문
		int i = 0;
		int sumVal = 0;
		
		while(true) {
			i++;
			if(i > 10)	// i = 11일때 break 실행 됨
				break;
			sumVal += i;
			System.out.println(i);
		}
		System.out.println("합계 : " + sumVal);
	}

}
