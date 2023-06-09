package interfaceex.inheritance;

public class MyClassTest {

	public static void main(String[] args) {
		// 구현 클래스인 MyClass의 객체 생성
		MyClass myClass = new MyClass();
		
		// 부모형으로 객체 할당(자동 형변환)
		X x = myClass;
		x.x();
	
		Y y = myClass;
		y.y();
		
		// MyInterface형으로 객체 생성
		MyInterface iClass = myClass;
		iClass.x();
		iClass.y();
		iClass.myMethod();
	}

}
