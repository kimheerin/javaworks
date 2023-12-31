package kr.or.iei.model;

//회원 class (자료형)
public class User {

		//1.필드(속성)
		private String id; 					//private = 접근 못하도록 하는 것(보안 문제)
		private String pwd; 
		private String name; 
		
		public User () {					//타이틀 넣고 싶을 때 | public 클래스명() {}
			System.out.println("User 클래스");//밑에 매개변수 생성자 때문에 살려야 함
		}
		
		//2.매개변수가 있는 생성자
		public User(String id, String pwd, String name) { 
			this.id = id;					//함수 아니라서 void 같은 거 없음
			this.pwd = pwd;
			this.name = name;
		}
		
		//set필드명(), get필드명()				//private 접근 불가이므로 set get 사용
		//접근하려면 public 써야 함
		public void setId(String id) {		//set = 입력	| id 입력
			this.id = id;
		}
		public String getId() {				//get = 출력 | id 출력
			return id;
		}
		public void setpwd(String pwd) {	//set = 입력	| pwd 입력
			this.pwd = pwd;
		}
		public String getpwd() {			//get = 출력 | pwd 출력
			return pwd;
		}
		public void setname(String name) {	//set = 입력	| name 입력
			this.name = name;
		}
		public String getname() {			//get = 출력 | name 출력
			return name;
		}
		
}
