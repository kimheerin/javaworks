package bufferedstream;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriteWordTest {

	public static void main(String[] args) {
		try {
			Writer writer = new FileWriter("word.txt");
			
			String animal = ("ant bear chiken cow eagle elephant horse monkey penguin tiger");
			writer.write(animal);
			writer.flush();
			
		}catch (IOException e) {
			e.printStackTrace();
		}

	}

}
