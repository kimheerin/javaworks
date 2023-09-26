package decorator;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class DataInputOutputStreamTest {

	public static void main(String[] args) {
		//정수, 실수, 문자열 쓰기

		try {
			//기반 스트림 객체 생성
			OutputStream os = new FileOutputStream("data.db");
			//보조 스트림 객체 생성
			DataOutputStream dos = new DataOutputStream(os);
			
			//기본 타입 자료 쓰기
			dos.writeInt(100);
			dos.writeUTF("박명수");
			dos.writeDouble(99.9);
			
			dos.flush();
			dos.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//바이트 데이터 읽기
		 try(InputStream is = new FileInputStream("./data.db");
	         DataInputStream dis = new DataInputStream(is)) {
	            //기본 타입 자료 읽기
	         int num = dis.readInt();
	         String name = dis.readUTF();
	         double score = dis.readDouble();
	         System.out.println(num + " : " + name + " : "+ score);
	         }catch(IOException e) {
	            e.printStackTrace();
	         }
	}

}