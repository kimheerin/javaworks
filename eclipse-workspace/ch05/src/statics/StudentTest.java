package statics;

public class StudentTest {

	public static void main(String[] args) {
		//인스턴스 객체 변수(static 없으면), class 객체 변수(static 붙으면) | 학생
		
		//class 객체 변수 출력 (클래스 이름으로 직접 접근 -new 안 함)
		Student.serialNum++;
		System.out.println(Student.serialNum);		//1001
		Student.serialNum++;
		System.out.println(Student.serialNum);		//1002...
	
		//인스턴스 객체 변수 생성
		Student s1 = new Student();
		s1.setiId(101);
		System.out.println("학번 : " + s1.getid());
		
		//인스턴스 객체 변수 출력
		/*System.out.println("s1 : " + s1.getid());*/

		

	}

}
