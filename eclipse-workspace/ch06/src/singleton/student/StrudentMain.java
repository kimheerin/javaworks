package singleton.student;

public class StrudentMain {

	public static void main(String[] args) {
		School school = School.getInstans() ;
		
		Student stu1 = school.creatStudent();
		Student stu2 = school.creatStudent();

		System.out.println("김희린 : " + stu1.getStuNum());
	}

}
