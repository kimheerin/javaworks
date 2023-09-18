package objectequals.member;

public class Member {
	private String memberId;	//사번
	private String name;		//이름
	
	public Member(String memberId, String name) {
		this.memberId = memberId;
		this.name = name;
	}
	
	//hashCode() 재정의
	@Override
	public int hashCode() {	//멤버이름.hashCode() 반환
		return memberId.hashCode();
	}
	
	//equals 재정의
	@Override
	public boolean equals(Object obj) {	//object가 string보다 크다
		if(obj instanceof Member) {
			Member member = (Member) obj;
			if(this.memberId.equals(memberId)) {
				return true;	//외부 입력된 회원 아이디와 이미 생성한 회원아이디가 일치하면
			}
		}	
		return false;
	}
	
	//toString() 재정의 | 객체 문자열 정보
	@Override
	public String toString() {
		return memberId + ", " + name;
	}

}
