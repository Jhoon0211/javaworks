package TwoDimention;

public class TwoDimention2 {

	public static void main(String[] args) {
		// 5행 5열의 2차원 배열 생성 - 문자 입력
		char[][] a = new char[5][5];
		
		for(int i=0; i<a.length; i++) {
	         for(int j=0; j<a[i].length; j++) {
	        	 a[i][j] = '*';
	            System.out.print(a[i][j] + " ");
	         }
	         System.out.println();
	      }
		
		// 삼각형 생성
		char[][] b = new char[5][5];
		
		for(int i=0; i<b.length; i++) {
	         for(int j=0; j<i+1; j++) {
	        	 b[i][j] = '*';
	            System.out.print(b[i][j] + " ");
	         }
	         System.out.println();
	      }
		
		// 
		char[][] c = new char[5][5];
		
		for(int i=0; i<c.length; i++) {
	         for(int j=i; j<c[i].length; j++) {
	        	 c[i][j] = '*';
	            System.out.print(c[i][j] + " ");
	         }
	         System.out.println();
	      }
		/*
		  i=0 j=0 a[0][0] *
		  	      a[0][0] **
		  	      a[0][0] ***
		  	      a[0][0] ****
		  	      a[0][0] ***** (최종)
		  i=1 j=1 a[1][1] *
		  	      a[1][2] **
		  	      a[1][3] ***
		  	      a[1][4] **** (최종)
		  i=2 j=2 a[2][2] *
		  	      a[2][3] **
		  	      a[2][4] *** (최종)  	      
		 
		 */
		
		// 1부터 순차증가
		int[][] arr = new int[4][5];
		
		for(int i=0; i<arr.length; i++) {
	         for(int j=0; j<arr[i].length; j++) {
	        	 // 열의 종료값 x 행의 값 + 열의 값
	        	 arr[i][j] = (arr[i].length*i)+(j+1);
	            System.out.print(arr[i][j] + " ");
	         }
	         System.out.println();
	      }
	}
}

