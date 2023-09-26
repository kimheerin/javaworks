package datainputoutput;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class GeyBytesTest {

	public static void main(String[] args) {
		//OutputStream은 문자열 쓰기를 지원하지 않지만
		//String 클래스의 getBytes()
		try {
			OutputStream os = new FileOutputStream("C:/File/out.txt");
			String data = "안녕하세요. \n좋은 하루 보내세요.";
			
			os.write(data.getBytes());
			
			os.flush();	//잔류 버퍼 비우기
			//os.close();
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
}
