package hiding.accounts;

public class AccountTest {

	public static void main(String[] args) {
		//Account 인스턴스 생성
		Account account = new Account();
	
		//멤버에 직접 접근하지 못하도록 제한 ---> get, set으로 접근
		//account.ano = 11-222-333
		//멤버 메소드에 접근 가능
		account.SetAno("111-222-3333");
		account.setOwner("김김김");
		account.SetBalance(10000);
		
		//계좌번호 출력
		System.out.println("계좌 번호 : " + account.getAno());
		System.out.println("예금주 : " + account.getOwner());
		System.out.println("잔고 : " + account.getBalance());
		
		//System.out.println(account.ano);
		
	
		
		
		
		
		
		
	}

}
