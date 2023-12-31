package referance.subject2;

import referance.subjects.Subject;  //subject에 있는 Student 가져오기

public class Student {
	private int studentId;			//메인에선 int studentId=0;으로 선언해야 하지만 여기선 자동임
	private String studentName;
	private Subject[] subjects; 	//subject에 있는 Student 가져오기
	
	//생성자 있는 경우
	public Student(int studentId, String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;
	//과목 저장할 배열 생성(10개짜리)	
		subjects = new Subject [10];	
	}
	//과목 추가하는 메서드 생성★?
	public void addSubject(String name, int score) {
	//생성된 메서드 값 저장★?	
		Subject subject = new Subject();
		subject.setSubjectName(name);
		subject.setscorePoint(score);
	//생성한 메서드 과목 저장★?							
	//subjects[0] = subject; //1개 저장
	for(int i=0; i<subjects.length; i++) {
		if(subjects[i] == null) {
			subjects[i] = subject;
			break;
			}
		}
	}
	//학생 정보 출력★?
	public void showStudentInfo () {
		int total = 0;	//총점
		double aver;	//평균
		int count = 0; 	//개수
		for(int i=0; i<subjects.length; i++) {
			if(subjects[i] != null) {			//null이 아닌 것만 출력	
				//Subject subject = subjects[i];	//트루니까 객체 저장됨
				count++;						//트루일 때마다 1씩 증가
				total += subjects[i].getscorePoint();
			System.out.println(studentId + "번 " + "학생 : " + studentName + " | " + subjects[i].getSubjectName() + 
							" 점수 : " + subjects[i].getscorePoint());
			}
		}
		aver = (double)total / count;	//null이 아닌 개수가 들어가야 함
		System.out.printf("총점 : %d, 평균 : %.1f\n", total, aver);	//printf => %d, %s, %.1f...


	}
}
