package classpart;

public class StudentTest2 {

	public static void main(String[] args) {
		// Student 클래스 사용
		// std1 을 객체, 객체변수, 인스턴스, 오브젝트 라고 함
		Student std = new Student(101, "김산");
		std.showInfo();
	
		Student std2 = new Student(102, "이강");
		std.showInfo();
	}

}
