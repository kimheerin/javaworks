package kr.or.iei.run;

import kr.or.iei.model.User;

public class UserTest {

	public static void main(String[] args) {
		// user1 - 인스턴스(객체) | 1.필드(속성) 출력
		User user1 = new User();					//패키지가 달라서 임포트 해야 함
		user1.setId("abc123");
		user1.setpwd("hahaha");
		user1.setname("김희린");
		

		System.out.println("계정 : " + user1.getId());
		System.out.println("암호 : " + user1.getpwd());
		System.out.println("이름 : " + user1.getname());
	
	}

}
