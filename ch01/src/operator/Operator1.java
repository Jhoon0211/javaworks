package operator;

public class Operator1 {

	public static void main(String[] args) {
		// 비교 연산 : >, <, ==, !=
		int num1 = 7, num2 = 3;
		
		System.out.println(num1 > num2);
		System.out.println(num1 < num2);
		System.out.println(num1 == num2);
		System.out.println(num1 != num2);
		
		// 논리 연산
		/*
		 && - 논리곱(비교대상 모두 true이면 true)
		 || - 논리합(비교대상 하나만 true이면 true)
		 ! - 논리부정(비교조건이 true이면 false)
		 
		*/
		
		System.out.println((num1 > num2) && (num1 != num2));
		System.out.println((num1 < num2) || (num1 != num2));
		System.out.println((num1 != num2));

	}

}
