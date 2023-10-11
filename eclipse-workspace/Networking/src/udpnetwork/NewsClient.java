package udpnetwork;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;

public class NewsClient {

	public static void main(String[] args) {
		try {
			//UDP가 비연결 방식이므로 port가 존재하지 않음
			DatagramSocket datagramSocket = new DatagramSocket();
			System.out.println("[클라이언트] 통신 소켓 생성");
			
			//구독하고자 하는 뉴스 주제 보내기
			//서버의 호스트와 port를 명시하여 연결 요청
			String data = "경제";
			byte[] bytes = data.getBytes("utf-8");
			DatagramPacket sendPacket = new DatagramPacket(bytes,
								bytes.length, new InetSocketAddress("localhost", 8100));
			datagramSocket.send(sendPacket);
			
			//무한 반복 대기
			while(true) {
				//서버가 보낸 뉴스 주제 받기
				DatagramPacket receivePacket = new DatagramPacket
						(new byte[1024], 1024);
				datagramSocket.receive(receivePacket);
				
				//문자열로 복원
				String news = new String(receivePacket.getData(), 0,
								receivePacket.getLength(), "utf-8");
				System.out.println(news);	
				
				//contains - 뉴스10이 포함된 문자열이 있으면 contains()-String의 문자열 메서드
				if(news.contains("뉴스10")) break;	//while문엔 break 필수
			}//while
			datagramSocket.close();
			System.out.println("[클라이언트] 통신 연결 종료");
		} catch (IOException e) {
			//e.printStackTrace();
			System.out.println("[서버] " + e.getMessage());
		}
	}//main
}