package singleton.card;

public class Card {
	static int serialNum = 0;	// 기준번호 (클래스 변수, static, 정적 변수)
	int cardNum;	// 카드번호 (인스턴스 변수)
	
	Card(){
		serialNum++;
		cardNum = serialNum;
	}
	
	// 카드 번호를 가져오는 함수 정의
	int getCardNum() {
		return cardNum;
	}
}
