package interfaceex.calculator;

public interface Calculator {
	// 정수형 계산기
	// 인터페이스는 컴파일 과정에서 상수로 변환함
	int ERROR = -9999;
	
	int add(int n1, int n2);
	
	int subtract(int n1, int n2);
	
	int times(int n1, int n2);
	
	int divide(int n1, int n2);
}
