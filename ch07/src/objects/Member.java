package objects;

public class Member {
	
	String id;
	
	Member(String id){
		this.id = id;
	}
	
	@Override
	public int hashCode() {
		return super.hashCode(); 
	}
	
	// equals() 재정의
	@Override
	public boolean equals(Object obj) {
		// 강제 형변환
		if(obj instanceof Member) { // obj의 Book 의 인스턴스(객체)라면
			Member member = (Member)obj; // 강제 형변환
			if(id.equals(member.id))
				return true; // true 반환
		}
		return false;
	}

}
