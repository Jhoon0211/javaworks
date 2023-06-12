package fileio.reader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReaderTest2 {

	public static void main(String[] args)  {
		
		Reader fr = null;
		try {
			fr = new FileReader("data2.txt");
			 int data;
			 
			 while((data = fr.read()) != -1 ) {
				 System.out.print((char)data);
			 }
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fr.close();
			} catch(IOException e) {
				e.printStackTrace();
			}
		}
		
		
		 /*while(true) {
			 data = fr.read(); // 코드값으로 저장
			 if(data == -1 ) // 읽을 데이터가 없으면
				 break;		 // 빠져 나옴
			 System.out.println((char)data);
		 }*/
		 
		 
	}

}
