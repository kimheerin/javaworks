package collection.queue;

import java.util.LinkedList;
import java.util.Queue;

public class MessageQueueTest {

	public static void main(String[] args) {
		Queue<Message> msgQueue = new LinkedList<>();
		
		//Massage 객체 생성 
		Message email = new Message("email", "최은호");
		Message sms = new Message("sms", "김희린");
		Message katalk = new Message("katalk", "함소연");
		
		//객체 저장 - offer()
		msgQueue.offer(email);
		msgQueue.offer(sms);
		msgQueue.offer(katalk);
		
		//객체 꺼내기 (삭제) - poll()
		
		
		//반복 - 확인(isEmpty)
		while(!msgQueue.isEmpty()) {
			Message message = msgQueue.poll();	//1개 꺼냄
			switch(message.command) {
			case "email":
				System.out.println(message.to + "님에게 email을 보냅니다.");
				break;
			case "sms":
				System.out.println(message.to + "님에게 sms를 보냅니다.");
				break;
			case "katalk":
				System.out.println(message.to + "님에게 katalk을 보냅니다.");
				break;
			}
		}
	}

}
