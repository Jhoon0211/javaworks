package classpart;


// 접근 제어자 - public
public class Student {
	// 클래스의 3요소 - 멤버변수, * 생성자 *, 메서드
	// 생성자(Constructor)는 반환형이 없음 (void, return) 클래스 이름과 동일
	// 생성자 오버로딩(이름은 같고, 매개변수가 있느냐 없느냐의 차이)
	int studentId;		// 학번
	String studentName;	// 이름
	
	public Student() {}  // 기본 생성자
	
	// (전달할 수 있는) 매개변수가 있는 생성자, 생성자의 오버로딩 (Overloading)
	public Student(int studentId, String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;
	}
	// void = 비어있음, 내보낼게 없음(return 키워드 없을때 사용)
	// 자료형이 없다
	public void showInfo() { 
		System.out.println("학번: " + studentId +
				", 이름: " + studentName);
	}
}
