package serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.text.DecimalFormat;
import java.util.Arrays;

public class ObjectInOutStreamTest {

   public static void main(String[] args) {
	   
      //Member 객체를  엑셀화해서 파일 
      try(OutputStream os = new FileOutputStream("object.dat")) {
    	  ObjectOutputStream oos = new ObjectOutputStream(os);
    	  
    	  Member m1 = new Member("sky123", "김하늘");
    	  Product p1 = new Product("Iphone15", 1500000);
    	  int[] number = {1, 2, 3, 4};
    	  
    	  //파일에 쓰기
    	  oos.writeObject(m1);
    	  oos.writeObject(p1);
    	  oos.writeObject(number);

    	  oos.flush();

      }catch(IOException e) {
         e.printStackTrace();
      }
      
      //객체를 역직렬화하여 파일에서 열기
      try(InputStream is = new FileInputStream("object.dat");
    		  ObjectInputStream ois = new ObjectInputStream(is)) {
    	  
    	  Member m2 = (Member) ois.readObject();
    	  Product p2 = (Product) ois.readObject();
    	  int[] number2 = (int[])ois.readObject();
    	  
    	  System.out.println(m2);
    	  System.out.println(p2);
    	  System.out.println(Arrays.toString(number2));
    	  
      }catch(IOException e) {
    	  e.printStackTrace();
      } catch (ClassNotFoundException e) {
		e.printStackTrace();
      }
   }

}