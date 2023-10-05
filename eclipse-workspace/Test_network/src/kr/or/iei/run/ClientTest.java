package kr.or.iei.run;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientTest {

	public static void main(String[] args) {
		//Socket 생성
		try {
			Socket socket = new Socket("localhost", 8001);
			System.out.println("클라이언트 연결 성공");
			
			//데이터 보내기
			String sendmessage = "염병하지마";
			OutputStream os = socket.getOutputStream();
			DataOutputStream dos = new DataOutputStream(os);
			dos.writeUTF(sendmessage);
			dos.flush();
			System.out.println("클라이언트 데이터 전송 : " + sendmessage);
			
			//데이터 받기
			DataInputStream dis = new DataInputStream(socket.getInputStream());
			String rcmessage = dis.readUTF();
			System.out.println("클라이언트 데이터 받기 : " + rcmessage);
			
			socket.close();
			System.out.println("클라이언트 연결 종료");

		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
