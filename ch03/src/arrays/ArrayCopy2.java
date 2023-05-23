package arrays;

public class ArrayCopy2 {
	
	public static void main(String[] args) {
		char[] arr1 = {'N', 'E', 'T'};
		char[] arr2 = new char[3];
		char[] arr3 = new char[3];
		
		// 배열 복사
		for (int i=0; i < arr1.length; i++) {
			arr2[i] = arr1[i];
			System.out.print(arr2[i]+" ");
		}
			
		// 역순 복사 N E T 를 T E N으로 
		for (int i=0; i < arr1.length; i++) {
			arr3[2-i] = arr1[i];
			System.out.println(arr3[i] + " ");
			
		}
		// i=2, N
		// i=1, E
		// i=0, T
		System.out.println();
		for (int i=0; i < arr3.length; i++) {
			System.out.print(arr3[i]+" ");
		}
	}
}
