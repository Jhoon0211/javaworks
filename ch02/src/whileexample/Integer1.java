package whileexample;


public class Integer1 {

	public static void main(String[] args) {
		// 문자형을 숫자로 변환
		System.out.println("10" + "11");
		System.out.println(10 + 11);
		
		int value1 = Integer.parseInt("10");
		System.out.println(value1);
		
		int value2 = Integer.parseInt("11");
		System.out.println(value2);
		
		System.out.println(value1 + value2);
		System.out.println(value1 > value2);
		
		// 문자형을 숫자로 변환 (실수형 반환)
		double dVal = Double.parseDouble("2.54");
		System.out.println(dVal);
				
	}

}
