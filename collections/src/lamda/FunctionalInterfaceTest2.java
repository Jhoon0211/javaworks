package lamda;

public class FunctionalInterfaceTest2 {

	public static void main(String[] args) {
		
		MyFunctionalInterface2 fi;

		// 람다식 블럭 뒤에 세미콜론 반드시 찍어야 함
		/* fi = (x) -> {
			x = x + 10;
			System.out.println(x);
		}; */

		fi = (x) -> System.out.println(x + 10);
		fi.method(10);
		
		fi = (x) -> System.out.println(x * x);
		fi.method(10);
	}

}
