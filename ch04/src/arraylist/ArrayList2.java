package arraylist;

import java.util.ArrayList;

public class ArrayList2 {
	public static void main(String[] args) {
		// 정수를 저장할 ArrayList 생성
		// Wrapper 클래스 - Integer 클래스
		ArrayList<Integer> numberList = new ArrayList<>();
		
		// 요소 저장
		numberList.add(1);
		numberList.add(2);
		numberList.add(3);
		numberList.add(4);
		
		
		// 요소들의 합계	
		int sumV = 0;
		double avg;
		
		for (int i=0; i<numberList.size(); i++) {
			sumV += numberList.get(i);
		}
		avg = (double)sumV / numberList.size();
		
		System.out.println("합계" + sumV);
		System.out.println("평균" + avg);
	}
}
