package decorator;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriteExample {

	public static void main(String[] args) {
		//파일에 문자열 쓰기 - Writer -> FileWrite
		try {
			Writer writer = new FileWriter("massage.txt");
			//문자열 쓰기
			String msg = ("행운을 빌어요");
			writer.write(msg);
			writer.flush();
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
}
