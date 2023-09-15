package banking.array;

public class Account {
	//필드
	private String ano;		//계좌번호
	private String owner;	//예금주
	private int balance;	//잔고
	
	//매개변수가 있는 생성자
	public Account(String ano, String owner, int balance) {
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;
	}
	//get,set | private 썼으니까
	public void setAno(String ano) {
		this.ano = ano;
	}
	public String getAno() {
		return ano;
	}
	public void setowner(String owner) {
		this.owner = owner;
	}
	public String getowner() {
		return owner;
	}
	public void setbalance(int balance) {
		this.balance = balance;
	}
	public int getbalance() {
		return balance;
	}



}
