package ifexample;

public class IfOperator {

	// 자체적으로 블럭 속성(break;)을 가지고 있음 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 10;
		int num2 = 2;
		char operator = '*';
		int result = 0;
		
		if(operator == '+') {
			result = num1 + num2;
		}else if(operator == '-') {
			result = num1 - num2;
		}else if(operator == '*') {
			result = num1 * num2;
		}else if(operator == '/') {
			result = num1 * num2;
			System.out.println(result);
		}else {
			System.out.println("연산자 오류입니다.");
		}
		System.out.println(result);

	}

}
