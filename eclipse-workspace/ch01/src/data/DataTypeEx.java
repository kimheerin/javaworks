package data;

public class DataTypeEx {

	public static void main(String[] args) {
		// int와 long의 차이
		// int 크기 - 4byte(32bit) -21억 ~ 21억
		// long 크기 - 8byte(64bit) 
		
		int num1 = 1234567890; //12억
		long num2 = 12345678900L; //long은 숫자 뒤에 'L' or 'l'을 붙여야 함
		
		System.out.println(num1);
		System.out.println(num2);
		

	}

}
