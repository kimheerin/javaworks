package serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class ObjectInOutStreamTest {

   public static void main(String[] args) {
      //Member 객체를  엑셀화해서 파일 
      try(OutputStream os = new FileOutputStream("object.dat")) {
    	  ObjectOutputStream oos = new ObjectOutputStream(os);
    	  
    	  Member m1 = new Member("sky123", "김하늘");
    	  
    	  //파일에 쓰기
    	  oos.writeObject(m1);

    	  oos.flush();

      }catch(IOException e) {
         e.printStackTrace();
      }
      
      //객체를 역직렬화하여 파일에서 열기
      try(InputStream is = new FileInputStream("object.dat");
    		  ObjectInputStream ois = new ObjectInputStream(is)) {
    	  
    	  Member m2 = (Member) ois.readObject();
    	  System.out.println(m2);
      }catch(IOException e) {
    	  e.printStackTrace();
      } catch (ClassNotFoundException e) {
		e.printStackTrace();
      }
   }

}