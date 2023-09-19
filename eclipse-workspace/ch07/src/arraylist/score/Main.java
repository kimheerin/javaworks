package arraylist.score;

public class Main {

	public static void main(String[] args) {
		//Student 객체 생성
		Student std1 = new Student(101, "우영우");
		
		std1.addSubject("국어", 100);
		std1.addSubject("수학", 70);
		std1.addSubject("과학", 99);
		
		std1.showStudentInfo();

	}

}
