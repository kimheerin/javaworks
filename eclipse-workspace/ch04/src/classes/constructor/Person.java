package classes.constructor;

//참조 자료형 - Person 클래스 정의
public class Person {
	String name;	//사람의 이름
	float height;	//키
	float weight;	//몸무게
	
	//1.기본 생성자
	public Person() {}
	
	//2.매개변수가 있는 생성자
	public Person(String n) {
		name = n;
	}
	
	//3.매개변수가 있는 생성자(모든 필드)
	public Person(String n, float h, float w) {
		name = n;	//외부에서 입력된 이름을 저장
		height = h;
		weight = w;
	}
	
	//메소드
	public void showPersonInfo() {
		System.out.printf("이름 : %s 키 : %.1f 몸무게 : %.1f",
				name, height, weight);		//문자열 %s 숫자열 %f
	}

}
