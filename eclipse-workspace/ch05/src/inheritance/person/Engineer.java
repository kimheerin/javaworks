package inheritance.person;
//자식 class
public class Engineer extends Person {

	//1.필드
	int comId;
	//매개변수 생성자일 때 반드시 아래 소스를 입력 - 기본 생성자일 땐 X
	public Engineer(String name, int age, int comId) {	//부모+본인 클래스	
		super(name, age);	//super(부모 클래스)
		this.comId = comId;	//본인 클래스
	}

	public int getComId() {
		return comId;
	}

}
