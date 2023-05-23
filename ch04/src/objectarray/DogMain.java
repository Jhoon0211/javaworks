package objectarray;

public class DogMain {

	public static void main(String[] args) {
		// 강아지 세마리 생성 (배열생성)
		Dog[] dogArray = new Dog[3];
		
		
		// 0~3번까지 한번에 표출 (객체생성)
		//dogArray[0] = new Dog();
		for (int i=0; i<dogArray.length; i++) {
			// 각각 배열 요소의 공간 생성 (기본 생성자로 생성)
			dogArray[i] = new Dog(); // 기본 생성자
		}
		
		dogArray[0].setDogName("백구");
		dogArray[0].setType("진돗개");
		
		System.out.println(dogArray[0].getDogName());
		System.out.println(dogArray[0].getType());
}
}
