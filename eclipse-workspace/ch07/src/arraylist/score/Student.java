package arraylist.score;

import java.util.ArrayList;

public class Student {
	private int studentId;		//학번
	private String studentName;	//학생 이름
	private ArrayList<Subject> subjectList;	//주머니 생성
	
	//생성자
	public Student(int studentId, String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;
		subjectList = new ArrayList<>();
	}
	//과목 추가
	public void addSubject(String name, int score) {
		Subject subject = new Subject(name, score); //매개변수로 외부 입력
		subjectList.add(subject); //어레이리스트에 저장함(0번부터)
	}
	
	//학생 정보 출력
	public void showStudentInfo() {
		int total = 0; //총점 변수
		double avg; //평균 점수
		for(int i=0; i<subjectList.size(); i++) {
			Subject s = subjectList.get(i);
			total += s.getscorePoint(); //점수 더하기(총점)
			System.out.printf("%s의 %s 과목 점수는 %d점입니다.\n", studentName, 
								s.getSubjectName(), s.getscorePoint());
		}
		//평균 계산
		avg = (double)total / subjectList.size();
		System.out.printf("%s의 총점은 %d점, 평균은 %.1f점입니다.\n",
							studentName, total, avg);	//.1f점 : 소수점 첫번째 자릿수까지만
	}

}

