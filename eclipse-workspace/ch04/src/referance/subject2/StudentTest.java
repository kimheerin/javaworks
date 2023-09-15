package referance.subject2;

public class StudentTest {

	public static void main(String[] args) {
		// Student 참조 ★?
		Student kim = new Student(101, "김희린");
		Student park = new Student(102, "박박박");
		
		kim.addSubject("영어", 85);
		kim.addSubject("수학", 90);
		kim.addSubject("국어", 100);
		kim.showStudentInfo();
		park.addSubject("영어", 77);
		park.addSubject("수학", 76);
		park.addSubject("국어", 75);
		park.showStudentInfo();
		
	}

}
