package kr.or.iei.run;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
	
	//필드
	private static ServerSocket serverSocket;
	
	public static void main(String[] args) {
		System.out.println("==========================================");
		System.out.println("서버를 종료하려면 q 또는 Q를 입력하고 Enter를 누르세요.");
		System.out.println("==========================================");
		
		startServer();
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			String key = sc.nextLine();
			if(key.toLowerCase().equals("q")) {
				break;
			}
		}
		sc.close();
		
		//서버 종료
		stopServer();
	}
	public static void startServer() { 
		//항상 대기 - 스레드 만들기
		Thread thread = new Thread() {
			@Override
			public void run() {
				try {
					serverSocket = new ServerSocket(8000);
					System.out.println("[서버] 시작");
					
					//항상 클라이언트 연결 대기
					while(true) {
						System.out.println("\n[서버] 연결 요청 대기\n");
						
						//연결 수락 및 객체 생성
						Socket socket = serverSocket.accept();
						
						//IP 확인
						InetSocketAddress isa = 
								(InetSocketAddress) socket.getRemoteSocketAddress();
						String clientIp = isa.getHostString();
						System.out.println("[서버] " + clientIp + "의 연결 요청을 수락");
						
						//데이터 받기
						InputStream is = socket.getInputStream();
						//기반스트림을 생성자의 매개변수로 연결
						DataInputStream dis = new DataInputStream(is);
						String massage = dis.readUTF();
						System.out.println("[서버] 데이터 받기 : " + massage);
						
						//데이터 보내기
						String massage2 = "서버가 전송하는 집에 가고 싶어";
						DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
						dos.writeUTF(massage2);
						dos.flush();
						System.out.println("[서버] 데이터 전송 : " + massage2);
						
						socket.close();
						System.out.println("[서버] " + clientIp + "의 연결 종료");
					}
				} catch (IOException e) {
					e.getMessage();
				}
			}
		};//Thread 끝
		thread.start();
	}//startServer
	
	public static void stopServer() {
		try {
			serverSocket.close();
			System.out.println("[서버] 종료");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}//stopServer
}
