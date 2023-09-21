package collection.member;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MemberArrayList memberList = new MemberArrayList();
		
		//member 객체 생성
		Member mem1 = new Member(1001, "이순신");
		Member mem2 = new Member(1002, "광화문");
		Member mem3 = new Member(1003, "경복궁");
		Member mem4 = new Member(1003, "안국");

		//회원 추가 메서드 호출
		memberList.addNumber(mem1);
		memberList.addNumber(mem2);
		memberList.addNumber(mem3);
		memberList.addNumber(mem4);		//중복 허용함
		memberList.removeMember(1003);
		memberList.removeMember(1004);	//이미 등록돼 있던 경복궁 삭제되고 안국만 남음
		
		//회원의 객체 수
		System.out.println("총 객체수 : " + memberList.getSize() + "\n");
	
		//회원 목록 조회
		memberList.showAllMember();
	}

}
