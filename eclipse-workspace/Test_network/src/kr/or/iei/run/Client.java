package kr.or.iei.run;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {

	public static void main(String[] args) {
		//Socket 생성
		try {
			//서버에 연결 요청 및 객체 생성
			Socket socket = new Socket("localhost", 8000);
			System.out.println("[클라이언트] 연결 성공");
			
			//데이터 보내기
			String sendmassage = "클라이언트가 전송하는 내일은 테스트";
			OutputStream os = socket.getOutputStream();
			DataOutputStream dos = new DataOutputStream(os);
			dos.writeUTF(sendmassage);
			dos.flush();
			System.out.println("[클라이언트] 데이터 전송 : " + sendmassage);
			
			//데이터 받기
			DataInputStream dis = new DataInputStream(socket.getInputStream());
			String rcMassage = dis.readUTF();
			System.out.println("[클라이언트] 데이터 받기 : " + rcMassage);
			
			socket.close();
			System.out.println("[클라이언트] 연결 종료");
		} catch (UnknownHostException e) {	//host 컴퓨터 이름 오류
			e.printStackTrace();
		} catch (IOException e) {	//IP주소 또는 port 번호 오류
			e.printStackTrace();
		}
	}
}
