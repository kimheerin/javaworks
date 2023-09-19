package arraylist.score;

//subject 자료형 정의
public class Subject {
	//기본 생성자 or set 택1
	
	//필드
	private String subjectName;	//과목 이름
	private int scorePoint;		//과목 점수
	
	//매개변수가 있는 생성자
	public Subject(String subjectName, int scorePoint) {
		this.subjectName = subjectName;
		this.scorePoint = scorePoint;
	}
	
	//get, set
	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}
	
	public String getSubjectName() {
		return subjectName;
	}
	
	public void setscorePoint(int scorePoint) {
		this.scorePoint = scorePoint;
	}
	public int getscorePoint() {
		return scorePoint;
	}
	
	
	
	
	
}



