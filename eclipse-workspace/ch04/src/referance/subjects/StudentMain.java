package referance.subjects;

//Student 
public class StudentMain {

	public static void main(String[] args) {
		//1번 방법 : stdi, stdi2 생성하기
		/*Student stdi = new Student(101, "김희린");
		Student stdi2 = new Student(102, "최은호");
		
		//과목 추가
		stdi.koreanSubject("국어", 90);
		stdi.mathSubject("수학", 99);
		
		stdi2.koreanSubject("국어", 50);
		stdi2.mathSubject("수학", 55);
		
		//학생 정보 출력
		stdi.showStudentInfo();
		System.out.println("====================");
		stdi2.showStudentInfo();*/
		
		//2번 방법 : 객체 배열
		Student[] students = {
		new Student(101, "김희린"),
		new Student(102, "최은호"),
		new Student(102, "함소연"),
		};
		
		//점수 저장
		students[0].koreanSubject("국어", 100);
		students[0].mathSubject("수학", 100);
		
		students[1].koreanSubject("국어", 90);
		students[1].mathSubject("수학", 90);
		
		students[2].koreanSubject("국어", 80);
		students[2].mathSubject("수학", 80);
		
		//전체 출력
		for(int i=0; i < students.length; i++) {
			students[i].showStudentInfo();
		}
		System.out.println("-------------------------");
		
		//향상 for
		for(Student Subject : students) {	//참조 후 클래스 참조 전 클래스 : 배열명
			Subject.showStudentInfo();		//참조 전 클래스
		}									//참조 전 클래스가 직접 연관있음
		
		

		
		
		
		
		

		

	}

}
