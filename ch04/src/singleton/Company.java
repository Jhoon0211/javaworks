package singleton;

public class Company {
	// '싱글톤 패턴'
	// 유일하게 생성한 인스턴스(Company 클래스의 객체)
	// private - 접근 불가
	private static Company instance = new Company();
		
	// 기본 생성자
	private Company() {} // 매개 변수가 없으므로 기본 생성자, {} - field가 없음
	
	// instance에 접근(사용)할 메서드 생성
	public static Company getInstance() {
		if(instance == null) {
			instance = new Company();
		}
		return instance;
	}

}
