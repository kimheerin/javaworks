package collection.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
//import java.util.*;		//간결하게

public class BoardTest {

	public static void main(String[] args) {
		//ArrayList 또는 Vector 사용
		
		//ArrayList<Board> list = new ArrayList<>();
		List<Board> list = new Vector<>();
		
		//객체 생성
		Board board1 = new Board("제목1", "내용1", "글쓴이1");
		Board board2 = new Board("제목2", "내용2", "글쓴이2");
		Board board3 = new Board("제목3", "내용3", "글쓴이3");
		
		//객체 저장
		list.add(board1);
		list.add(board2);
		list.add(board3);
		
		//객체 삭제
		if(list.contains(board2)) {
			list.remove(board2);
			//list.romove(i);		//index로 객체 삭제 가능
		}
		
		//맨 앞 객체 가져오기(0번 인덱스)
		System.out.println(list.get(0).getTitle());		//toString 대신 이렇게도 출력 가능
		System.out.println(list.get(0).getContent());
		System.out.println(list.get(0).getWriter());

		//전체 출력
		for(int i=0; i<list.size(); i++) {
			Board board = list.get(i);
			System.out.println(board.getTitle() + ", " +
								board.getContent() + ", " +
								board.getWriter());
			
		}
	}

}
