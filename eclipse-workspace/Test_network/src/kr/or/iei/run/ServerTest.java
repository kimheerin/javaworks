package kr.or.iei.run;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerTest {
	//필드
	private static ServerSocket serverSocket;
	
	public static void main(String[] args) {
		System.out.println("===========================================");
		System.out.println("서버를 종료하려면 q 또는 Q를 입력하고 Enter를 누르세요.");
		System.out.println("===========================================");
		
		startServer();
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			String key = sc.nextLine();
			if(key.toLowerCase().equals("q")); {
			break;
			}
		}
		sc.close();
		
		stopServer();
	}
	private static void startServer() {
		Thread thread = new Thread() {
			@Override
			public void run() {
				try {
					serverSocket = new ServerSocket(8002);
					System.out.println("서버 시작");
					
					while(true) {
						
						//대기
						Socket socket = serverSocket.accept();
						
						//ip주소
						InetSocketAddress isa = (InetSocketAddress) socket.getRemoteSocketAddress();
						String clientIp = isa.getHostName();
						System.out.println("서버 요청 수락?");
						
						//데이터 받기
						InputStream is = socket.getInputStream();
						DataInputStream dis = new DataInputStream(is);
						String message = dis.readUTF();
						System.out.println("서버 데이터 받음");
						
						//데이터 보내기
						String message2 = "가나다라마바사";
						DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
						dos.writeUTF(message2);
						dos.flush();
						System.out.println("서버 데이터 보냄");
						
						//서버 종료
						socket.close();
					}
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		};
		thread.start();
	}
	
	private static void stopServer() {
		try {
			serverSocket.close();
			System.out.println("서버 종료");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}