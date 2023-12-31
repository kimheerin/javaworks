package hiding.accounts;

//은행 통상 계좌 자료형 생성
public class Account {			//private = 접근 금지
	private String ano;			//계좌 번호
	private String owner;		//예금주
	private int balance;		//잔고
	
	//기본 생성자
	public Account() {}
	
	//매개변수가 있는 생성자			//AccountTest2.java
	public Account(String ano, String owner, int balance) {
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;
	}
	
	//매개변수가 
	
	//get(), set() 메소드 생성		//AccountTest.java
	//만드는 법 : set-입력 get-출력 + 필드 이름() -필드명 첫 자 대문자
	public void SetAno(String a) {
		ano = a;
	}
	public String getAno() {
		return ano;
	}	
	public void setOwner(String own) {
		owner = own;
	}
	public String getOwner() {
		return owner;
	}
	public void SetBalance(int bal) {
		balance = bal;
	}
	public int getBalance() {
		return balance;
	}
	



}