package collection.member;

public class MemberHashMapTest {

	public static void main(String[] args) {
		
		MemberHashMap memberMap = new MemberHashMap();
		
		//회원 추가
		memberMap.addMember(new Member(1001, "이순신"));
		memberMap.addMember(new Member(1002, "광화문"));
		memberMap.addMember(new Member(1003, "경복궁"));
		memberMap.addMember(new Member(1004, "안국"));
		
		System.out.println("총 객체 수 - " + memberMap.getSize());
		
		//회원 삭제
		memberMap.removeMember(1003);
		
		System.out.println("총 객체 수 - " + memberMap.getSize());
		
		//회원 목록
		memberMap.showAllMember();

	}

}
