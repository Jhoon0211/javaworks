package types;

public class BitTest {

	public static void main(String[] args) {
		// 2진수, 16진수 표기
		int num = 10;
		int bNum = 0b1010;	// 2진수 - 접두어(0b)
		int hNum = 0xA;		// 16진수 - 접두어(0x) 
		
		System.out.println(num);
		System.out.println(bNum);
		System.out.println(hNum);
		
		// 2진수 - 32bit
		// int num1 = 0b00000101; // 8bit - 5
		// 첫 비트는 부호비트 (0이면 양수, 1이면 음수)
		int num1 = 0b00000000000000000000000000000101; // 8bit - 5
		
		// 2진수 - 음수만드는 법, 1. 101 전의 0을 전부 1로 바꾸고(보수-반대되는 수), 2. 맨뒤에 1을 더함 
		int num2 = 0b11111111111111111111111111111011; // 8bit - 5
		
		
		int total = num1 + num2;
		
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(total);
		
	}

}
