package datainputoutput;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileCopyTest2 {

	public static void main(String[] args) {
		//close() 사용 안 하는 방법 : try ~ with ~ resource문
		String originFile = "C:/File/CuteMS.jpg"; 		//원본 파일
		String copyFile = "C:/File/CuteMSCopy2.jpg";	//사본 파일
		long start, end;
		
		try (InputStream is = new FileInputStream(originFile);
			OutputStream os = new FileOutputStream(copyFile);){
			start = System.currentTimeMillis();	//복사한 시간
			
			/*
			while(true) {
			 
			int num = is.read();	//읽은 바이트 수
			if(num == -1) break;
			os.write(num); 			//파일에 쓰기
			}*/
			byte[] data = new byte[1024];
			
		   while(true) {
	            int readBytes = is.read(data); //데이터를 받은 바이트 수 
	            if(readBytes == -1)break;
	            for(int i =0; i <readBytes; i++) {
	               os.write(data[i]);
	            }
		   }
			os.flush(); 	//파일 비우기
			end = System.currentTimeMillis();
			System.out.println("복사하는 데에 걸린 시간 " + (end-start) + "ms");

		}catch (IOException e) {
			e.printStackTrace();
		}
	}
}
