package kr.or.iei.run;

import kr.or.iei.model.User;

public class UserTest2 {

	public static void main(String[] args) {
		//user1 - 인스턴스(객체) | 2.매개변수가 있는 생성자 출력
		/*User user1 = new User("bbb222", "kakaka", "희린김");
		
		System.out.println("계정 : " + user1.getId());
		System.out.println("암호 : " + user1.getpwd());
		System.out.println("이름 : " + user1.getname());*/
		
		//크기가 3인 배열 생성			
		User[] users = new User[3];
		//user 3명 객체 생성
		User user1 = new User("bbb222", "bababa", "희린김");
		User user2 = new User("ccc333", "cacaca", "희린이");
		User user3 = new User("ddd444", "dadada", "희린박");
		//생성한 객체 배열에 저장
		users[0] = user1;
		users[1] = user2;
		users[2] = user3;
		//users[0] 1개 출력
		System.out.println(users[0].getId() + ", " +
							users[0].getpwd() + ", " + users[0].getname());
		System.out.println("▣▣▣▣▣▣▣▣▣▣▣▣▣▣▣▣▣▣");
		//users 전체 출력
		for(int i=0; i<users.length; i++) {
			System.out.println(users[i].getId() + ", " +
								users[i].getpwd() + ", " + users[i].getname());
		}
		/*User apple = new User("iphone", "12", "pro");
		User mango = new User("galaxy", "flip4", "ljy");
		
		System.out.println("     계정     |     암호      |     이름     |");
		System.out.println("------------------------------------------");
		System.out.println("   " + apple.getId() + "\t   " + apple.getpwd() +"\t          "+ apple.getname());
		System.out.print("   " +mango.getId() +"\t  "+ mango.getpwd() +"\t          "+ mango.getname());*/

	}

}
