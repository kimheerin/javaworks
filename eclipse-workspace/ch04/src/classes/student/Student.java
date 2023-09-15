package classes.student;

//참고(래퍼런스) 자료형
public class Student {
	//클래스 내부에서 변수 = 필드(field)
	String name;	//학생 이름
	int studentId; 	//학번(101)
	int grade;		//학년
	
	//함수가 아니므로 반환형이 없음
	//클래스 이름과 같음
	//기본 생성자는 생략
	public Student() {} 	//기본 생성자 클래스명 변수명 = new ^클래스명^(); 클래스명과 동일
	
	
	//학생의 정보를 출력하는 메소드(함수) 정의
	public void showStudentInfo() {
		System.out.println("\n이름 : " + name + 
				"\n학번 : " + studentId + "\n학년 : " + grade);
	}
	
	
	
	
	}

