package classes.student;

public class StundentTest0911 {

	public static void main(String[] args) {
		// Student 객체 생성
		// 메모리 영역(new -> heap 영역 사용)
		// 점 연산자로 접근함
		Student student1 = new Student();
		student1.name = "홍길동";
		student1.studentId = 102;
		student1.grade = 2;
		student1.showStudentInfo(); //아래 세 줄 대신 classes에서 선언한 함수로 출력(간단하게)
		
		/*system.out.println("이름 : " + student1.name);
		System.out.println("학번 : " + student1.studentId);
		System.out.println("학년 : " + student1.grade);*/
		
		System.out.print("===============================");
		
		Student student2 = new Student();
		student2.name = "김희린";
		student2.studentId = 102;
		student2.grade = 2;
		student2.showStudentInfo();
		
		/*System.out.println("이름 : " + student2.name);
		System.out.println("학번 : " + student2.studentId);
		System.out.println("학년 : " + student2.grade);*/
		
		

	}

}
