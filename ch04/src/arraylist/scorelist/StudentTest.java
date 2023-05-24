package arraylist.scorelist;

public class StudentTest {

	public static void main(String[] args) {
		// 학생 개체 생성
		Student park = new Student(1001, "박마늘");
		Student lee = new Student(1002, "이양파");
		
		park.koreanSubject("국어과목", 90);
		park.mathSubject("수학과목", 80);
		
		lee.koreanSubject("국어과목", 90);
		lee.mathSubject("수학과목", 90);
		
		park.showInfo();
		lee.showInfo();

	}

}
