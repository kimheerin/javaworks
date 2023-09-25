package datainputoutput;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileCopyTest {

	public static void main(String[] args) {
		
		String originFile = "C:/File/CuteMS.jpg"; 	//원본 파일
		String copyFile = "C:/File/CuteMSCopy.jpg";	//사본 파일
		try {
			InputStream is = new FileInputStream(originFile);
			OutputStream os = new FileOutputStream(copyFile);
			
			while(true) {
				int num = is.read();	//읽은 바이트 수
				if(num == -1) break;
				os.write(num); 			//파일에 쓰기
			}
			os.flush(); 	//파일 비우기
			is.close();
			os.close();
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
}
