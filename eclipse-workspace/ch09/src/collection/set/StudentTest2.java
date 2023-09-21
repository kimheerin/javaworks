package collection.set;

import java.util.HashMap;
import java.util.Map;

public class StudentTest2 {

	public static void main(String[] args) {
		
		Map<String, Student> map = new HashMap<>();	//hashMap 자체가 중복 불허용
		
		//학생 인스턴스 생성
		Student std1 = new Student("이순신", 101);
		Student std2 = new Student("장보고", 102);
		Student std3 = new Student("윤봉길", 103);
		Student std4 = new Student("장보고", 102);
		
		//객체 추가 | 학생을 map에 추가
		map.put("이순신", std1);
		map.put("장보고", std2);
		map.put("윤봉길", std3);
		map.put("장보고", std4);
		
		//자료 출력
		System.out.println(map);

	}

}
