package ifexample;

public class SwitchCase1 {

	public static void main(String[] args) {
		// switch ~ case문 (조건의 값이 정해져 있을때 주로 사용)
		// 순위에 따른 메달 색상 출력
		int rank = 2;
		String medalColor = " ";	// 공백 문자로 초기화
		
		switch(rank) {
		case 1:
			medalColor = "금메달";
			break;
		case 2:
			medalColor = "은메달";
			break;
		case 3:
			medalColor = "동메달";
			break;
		default:
			System.out.println("메달이 없습니다.");
			medalColor = "None";
			break;
		}
		System.out.println("메달 색은 " + medalColor + "입니다.");
	}

}
