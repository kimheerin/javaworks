package statics;

public class Student {
	
	//1.필드
	static int serialNum = 1000;	//학번	//static == 자동 증가
	int id;							//학번
	String name;					//학생명
	//2.생성자
	/*public Student() {
		serialNum++;			// 1000 + 1 ==> 1001
		id = serialNum;
	}*/
	public void setiId(int id) {
		this.id = id;
	}
	public int getid() {
		return id;
	}
	
	
}//class
