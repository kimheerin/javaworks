package collection.queue;

public class Message {
	
	String command; 	//수행 - 이메일, sms, katalk
	String to;			//대상

	public Message(String command, String to){
		this.command = command;
		this.to = to;
	}
}
