package arraylist.scorelist;

public class Subject {
	private String subjectName;	// 과목 이름
	private int scorePoint;		// 과목 점수
	
	// 생성자 생략
	
	// get(), set()
	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}
	
	public String getSubjectName() {
		return subjectName;
	}
	
	public void setScorePoint(int scorePoint) {
		this.scorePoint = scorePoint;
	}
	
	public int getScorePoint() {
		return scorePoint;
	}
}
