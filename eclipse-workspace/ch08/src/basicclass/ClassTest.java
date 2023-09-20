package basicclass;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public class ClassTest {

	public static void main(String[] args) throws ClassNotFoundException {
		//String 클래스의 정보 춮력
		System.out.println("===== 클래스의 이름 가져오기 =====");
		
		Class<?> pClass1= Class.forName("java.lang.String");
		System.out.println(pClass1.getName());
		
		
		System.out.println("===== 클래스의 필드(멤버변수) 출력하기 =====");
		Field[] fields = pClass1.getDeclaredFields();
		for(Field field : fields)
			System.out.println(field);
		
		
		System.out.println("===== 생성자 정보 출력하기 =====");
		Constructor<?> [] cons = pClass1.getConstructors();
		for(Constructor<?> con : cons) {
			System.out.println(con);
		}
		
		
	}

}
