package overriding.shop;

public class MainClass2 {

	public static void main(String[] args) {
		//자동 형변환 | class
		HeadShop shop11 = new Shop1(); //부모class 변수명 = new 자식class();
		shop11.비빔밥();
		
		System.out.println("=====================");
		
		HeadShop shop22 = new Shop2();
		shop22.비빔밥();
		
		System.out.println("=====================");
		
		//강제 형변환
		int iNum = 10;			
		double dNum;
		
		dNum=iNum;
		System.out.println(dNum);
		
		iNum = (int)dNum;			//double이 int에 못 들어가서 강제 형변환
		System.out.println(iNum);
	}

}
