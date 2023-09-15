package kr.or.iei.run;

import kr.or.iei.model.User;

public class UserTest {

	public static void main(String[] args) {
		
		User[] users = new User[3];
		
		User user1 = new User("김희린", "heerit", 1028);
		User user2 = new User("최은호", "silverho", 0212);
		User user3 = new User("함소연", "ssoya", 1019);
		
		users[0] = user1;
		users[1] = user2;
		users[2] = user3;
		
		System.out.println(users[0].getName() + users[1].getid() + users[2].getpwd());

	}

}

