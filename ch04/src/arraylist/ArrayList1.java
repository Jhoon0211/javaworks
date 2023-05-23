package arraylist;

import java.util.ArrayList;

public class ArrayList1 {

	public static void main(String[] args) {
		// 기본적으로 10개의 저장 공간이 생성
		ArrayList<String> cartList = new ArrayList<>();
		
		// 자료 저장 - 객체이름.add()
		cartList.add("계란");
		cartList.add("콩나물");
		cartList.add("커피");

		System.out.println(cartList.get(0));
		System.out.println(cartList.get(1));
		
		// cartList크기 - 객체이름.size()
		System.out.println(cartList.size() + "개");
		
		// 전체요소 출력
		for(int i=0; i<cartList.size(); i++) {	// 리스트를 순회하면서
			String cart = cartList.get(i);	//	요소를 가져와서
			System.out.println(cart);
		}
		System.out.println("====================");
			
		// 요소 수정
		cartList.set(0, "라면");
		
		// 요소 삭제	// 인덱스()를 써도 되고 "" 자료형을 써도 된다
		//cartList.remove(1);
		cartList.remove("양파");
		// contains() - 인덱스가 없으면 예외 발생하므로 미리 인덱스 추가
		// contains() 사용 권장
		if(cartList.contains(cartList.get(2)))
			cartList.remove(2);
		
		// 향상 for문 출력 | for (String 변수 : 객체이름) { }
		for(String cart : cartList)
			System.out.println(cart);
		}
	}


