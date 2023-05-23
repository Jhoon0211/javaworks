package arrays;

import java.util.Scanner;

public class CalcScore {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		boolean run = true;	 // 상태 변수
		int[] scores = null; // 배열 초기화 : null
		
		while(run) {
			try {
			System.out.println("----------------------------------------------------");
			System.out.println("1. 학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료 ");
			System.out.println("----------------------------------------------------");
			System.out.print("선택> ");
	
			int selectNo = Integer.parseInt(sc.nextLine()); // 입력 대기
			
				if(selectNo == 1) {
					System.out.print("학생수> ");	
					int studentNum = Integer.parseInt(sc.nextLine());
					scores = new int[studentNum];}	// 배열의 크기는 학생 수 
				else if(selectNo == 2) {
					if (scores == null) {
						System.out.println("1번을 먼저 선택해주세요.");}
					else {	// 학생수를 입력하지 않았다면
					for(int i=0; i<scores.length; i++) {
						System.out.print("scores[" + i + "]> ");
						scores[i] = Integer.parseInt(sc.nextLine());
						}
					}
				}
				else if(selectNo == 3) {
					if (scores == null) {
						System.out.println("1번을 먼저 선택해주세요.");}
					else {
						for(int i=0; i<scores.length; i++) {
						System.out.println("scores[" + i + "]> " + scores[i]);
					}
				}
				}
				else if(selectNo == 4) {
					if(scores != null) {
						// 분석 - 총점, 평균, 최고점수
						int sumV = 0;
						double avg;
						int maxV = scores[0]; // 0번 인덱스를 최대값으로 임의로 설정
						
						// 총점
						for (int i=0; i<scores.length; i++) {
							sumV += scores[i];
							// 최대값
							if (maxV < scores[i])
								maxV = scores[i];
						}
							// 평균
							avg = (double)sumV / scores.length;
						
						
							// 출력
							System.out.println("총점 : " + sumV);
							System.out.println("평균 : " + avg);
							System.out.println("최고점수 : " + maxV);
						
					}
					else{
						System.out.println("1번을 먼저 선택해주세요.");
					}
				}else if(selectNo == 5) {
					run = false;
					System.out.println("프로그램을 종료합니다.");
				}else {
					System.out.println("지원되지 않는 메뉴입니다. 다시 선택해주세요.");
					}
			}catch(Exception e) {
				System.out.println("올바른 선택이 아닙니다. 다시 선택해주세요.");
			} // try~catch 끝
		} // while 끝
	}	// main 끝
} // class 끝

