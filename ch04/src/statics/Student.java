package statics;

public class Student {
	
	private static int serialNum = 1000;
	private int studentId;  // 학번
	private String name;	// 이름
	
	Student(){
		serialNum++; // serialNum을 1 증가
		studentId = serialNum;
	}
	
	// get(), set()
	int getStudentId() {
		return studentId;
	}
	
	void studentId(int studentId) {
		this.studentId = studentId;
		
	String getName() {
		return name;
	}
	}
}
