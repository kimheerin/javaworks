package decorator;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class BufferedStreamTest {

	public static void main(String[] args) {
		String originFile = "c:/File/CuteMS.jpg"; //원본 파일
		String copyFile = "c:/File/CuteMs-3.jpg";	//사본 파일
		long start, end;
		
		//보조 스트림은 단독으로 사용할 수 없음
		//가변스트림을 생성자로 사용하여 사용할 수 있음
		try {
			//가변 스트림 객체 생성
			InputStream is = new FileInputStream(originFile);
			OutputStream os = new FileOutputStream(copyFile);

			//보조 스트림 객체 생성
			BufferedInputStream bis = new BufferedInputStream(is);
			BufferedOutputStream bos = new BufferedOutputStream(os);
			start = System.currentTimeMillis();
			
			int data;
			while((data = bis.read()) != -1) {	//바이트 데이터 읽음
				bos.write(data); //바이트 데이터 쓰기
			}
			bis.close();
			bos.close();
			
			end = System.currentTimeMillis();
			System.out.println("복사 소요 시간 : " + (end-start) + "ms");
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();

		}
	}

}
