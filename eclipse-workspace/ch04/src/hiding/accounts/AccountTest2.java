package hiding.accounts;

public class AccountTest2 {

	public static void main(String[] args) {
		//매개변수가 있는 생성자
		//생성자를 통해 계좌 정보를 입력
		Account account = new Account("111-222-3333", "김김김", 10000);
		
		
		//계좌번호 출력
		System.out.println("계좌 번호 : " + account.getAno());
		System.out.println("예금주 : " + account.getOwner());
		System.out.println("잔고 : " + account.getBalance());

	}

}
