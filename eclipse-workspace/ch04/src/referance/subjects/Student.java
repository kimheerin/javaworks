package referance.subjects;

public class Student {
	
	//필드
	int studentId;		//학번
	String studentName;	//이름
	Subject Korean;		//국어 과목(참조).. 가져온 거 Subject.java
	Subject math;
	
	//생성자
	public Student(int studentId, String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;
		Korean = new Subject();		//korean 객체 생성, 참조할 땐 new 어쩌고
		math = new Subject();		//위와 동일
	}
	
	//국어 과목 추가 메소드 정의
	public void koreanSubject(String name, int score) {
		Korean.setSubjectName(name);
		Korean.setscorePoint(score);
	}
	
	//수학 과목
	public void mathSubject(String name, int score) {
		math.setSubjectName(name);
		math.setscorePoint(score);
	}	
	
	//학생의 정보 출력
	public void showStudentInfo() {
		System.out.println("'" + studentName + "'의 " +
							Korean.getSubjectName() + " 점수 : " +
							Korean.getscorePoint());
		System.out.println("'" + studentName + "'의 " +
				math.getSubjectName() + " 점수 : " +
				math.getscorePoint());
		
	}



}
