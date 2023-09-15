package singleton.student;

public class School {
	private static School instance;
	
	private School() {}
	
	public static School getInstans() {
		if(instance == null) {
			instance = new School() ;
		}
		return instance;
	}
	
	//학생 생성
	public Student creatStudent() {
		Student stu = new Student();
		return stu;
	}
}
