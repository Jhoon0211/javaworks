package methods;

public class Random1 {

	public static void main(String[] args) {
		// 주사위 10번 던지기
		/*for(int i=1; i<=10; i++) {
			int dice = (int)( Math.random()*6)+ 1;
			System.out.println(dice);
		} */
				
		// 문자를 난수(무작위수)로 추출하기
		String[] word = {"나", "너", "우리", "세계"};
		int rnd = (int)(Math.random()*word.length);
		
//		System.out.println(rnd);
//		System.out.println(word[rnd]);
		
		// 로또복권 추첨
		// 번호를 6개 저장할 배열 선언
		// 추첨번호 (1~45)
		int[] lotto = new int[6];
		
		for(int i=0; i<lotto.length; i++) {
			lotto[i] = (int)(Math.random()*45) +1;
			for(int j=0; j<i; j++) {
				if(lotto[i] == lotto[j]) { // 이전 번호와 일치하면, 
					i--; 	// 이전 인덱스로 이동하여 다시 추출
				}
			}
		}
		// 로또 번호 출력
		for(int i=0; i<lotto.length; i++) {
		System.out.print(lotto[i] + " ");
		} // for 종료

	} // main 종료
	// 디버깅
	/*
	 * 9 6 31 29 40 5 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 	
	*/
	
	
	
	
	
	
	
	

}
