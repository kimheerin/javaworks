package funcinterface.lamdastring;

public class StringConcatTest1 {

	public static void main(String[] args) {
		
		StringConcatImpl concat = new StringConcatImpl();
		
		String str1 = "안녕";
		String str2 = "하쇼";
		
		concat.makeString(str1, str2);
	}

}
