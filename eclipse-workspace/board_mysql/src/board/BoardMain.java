package board;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class BoardMain {

	private Scanner sc = new Scanner(System.in);
	private Connection conn;
	private PreparedStatement pstmt;
	
	//db 연결 관련 변수
	String driverClass ="com.mysql.cj.jdbc.Driver";
    String url = "jdbc:mysql://127.0.01:3306/mydb?serverTime=Asia/Seoul";
    String user ="myuser";
    String password ="pwmyuser";
	
	//생성자
	public BoardMain() {
		try {
	         Class.forName("com.mysql.cj.jdbc.Driver");
	         conn = DriverManager.getConnection(url, user, password);
	         System.out.println("DB 연결 성공!" + conn);
	      } catch (Exception e) {
	         e.printStackTrace();
	         exit();
	      }	
	   }
	
	public void list() {
		System.out.println("[게시글 목록]");
		System.out.println("-----------------------------------------------");
		System.out.printf("%-4s%-12s%-20s%-20s \n", "no", "writer", "date", "title");
		System.out.println("-----------------------------------------------");
		//System.out.printf("%-4s%-12s%-12s%-40s \n", "1", "이오늘", "2023-10-17", "가입 인사");
		
		//db- board 테이블의 모든 게시글 가져오기
		try {
			String sql = "SELECT * FROM board ORDER BY bno DESC";
						
			pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {	//게시글이 있는 동안 반복(다음 행으로 이동)
				Board board = new Board();
				board.setBno(rs.getInt("bno"));
				board.setBtitle(rs.getString("btitle"));
				board.setBwriter(rs.getString("bwriter"));
				board.setBdate(rs.getTimestamp("bdate"));
				board.setBcontent(rs.getString("bcontent"));

				//게시글 출력
				System.out.printf("%-4s%-12s%-20s%-20s \n",
									board.getBno(), 
									board.getBwriter(),
									board.getBdate(),
									board.getBtitle(),
									board.getBcontent()
				);	
			}//while
			rs.close();
			pstmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
			exit();
		}
		mainMenu();			//mainMenu() 메서드 호출
	}
	
	public void mainMenu() {
		System.out.println("-----------------------------------------------");
		System.out.println("1. Create |2. Read |3. Clear |4. Exit |");
		System.out.print("선택 : ");
		
		String menuNo = sc.nextLine();
		                                                     
		switch(menuNo) {
		case "1":
			create(); break;
		case "2":
			read(); break;
		case "3":
			clear(); break;
		case "4":
			exit(); break;
		}
	}

	public void create() {
		//System.out.println("create() 메서드 실행됨");
		Board board = new Board();
		System.out.println("[새 게시물 등록]");
		
		System.out.print("제목 : ");
		String title = sc.nextLine();
		board.setBtitle(title);
		
		System.out.print("내용 : ");
		String content = sc.nextLine();
		board.setBcontent(content);
		
		System.out.print("작성자 : ");
		String writer = sc.nextLine();
		board.setBwriter(writer);
		
		//DB처리
		try {
			String sql = "INSERT INTO board(btitle, bcontent, bwriter)"
					+ "VALUES (?, ?, ? )";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, board.getBtitle());
			pstmt.setString(2, board.getBcontent());
			pstmt.setString(3, board.getBwriter());
			//SQL 실행
			pstmt.executeUpdate();
			
			pstmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
			exit(); //종료 메서드 호출
		}
		//목록 메서드 호출
		
		list();
	}
	
	private void read() {
		//System.out.println("read() 메서드 실행됨");
		System.out.println("[게시글 열기]");
		System.out.print("글 번호 : ");
		int bno = Integer.parseInt(sc.nextLine());
		
		//DB처리	
		try {
			String sql = "SELECT * FROM board WHERE bno = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, bno);
			//쿼리 실행
			pstmt.executeQuery();
			ResultSet rs = pstmt.executeQuery();
			//전체 가져올 때는 whlie, 1개 혹은 없으면 if
			if(rs.next()) {
				Board board = new Board();
				//DB값을 가져와 board에 세팅
				board.setBno(rs.getInt("bno"));
				board.setBwriter(rs.getString("bwriter"));
				board.setBdate(rs.getTimestamp("bdate"));
				board.setBtitle(rs.getString("btitle"));
				board.setBcontent(rs.getString("bcontent"));
				
				//콘솔에 출력
				System.out.println("-----------------------------------------------");
				System.out.println("번 호 : " + board.getBno());
				System.out.println("제 목 : " + board.getBtitle());
				System.out.println("내 용 : " + board.getBcontent());
				System.out.println("작성자 : " + board. getBwriter());
				System.out.println("작성일 : " + board.getBdate());
				System.out.println("-----------------------------------------------");
				
				//수정 및 삭제 메뉴 만들기
				System.out.println("1.Edit | 2.Delete | 3.List |");
				System.out.print("선택 : ");
				String menuNo = sc.nextLine();
				
				if(menuNo.equals("1")) {
					update(board);
				}else if(menuNo.equals("2")) {
					delete(board);
				}
			}
			rs.close();
			pstmt.close();		
		} catch (SQLException e) {
			e.printStackTrace();
		}
		list();
	}
	
	public void update(Board board) {	//이미 작성된 글(board)을 가져와서 수정
		System.out.println("[수정하기]");
		
		System.out.print("제목 : ");
		String title = sc.nextLine();
		board.setBtitle(title);
		
		System.out.print("내용 : ");
		String content = sc.nextLine();
		board.setBcontent(content);
		
		System.out.print("작성자 : ");
		String writer = sc.nextLine();
		board.setBwriter(writer);
		
		//DB처리 - UPDATE
		try {
			String sql = "UPDATE board SET btitle = ?, bcontent = ?, bwriter = ?"
					+ "WHERE bno = ?";
			pstmt = conn.prepareStatement(sql);		//콘솔에서 수정한 제목을 db에 저장
			pstmt.setString(1, board.getBtitle());
			pstmt.setString(2, board.getBcontent());
			pstmt.setString(3, board.getBwriter());
			pstmt.setInt(4, board.getBno());
			
			//SQL 실행
			pstmt.executeUpdate();
			pstmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
			exit();
		}
		}
	
	public void delete(Board board) {
		System.out.println("삭제하시겠습니까?");
		System.out.println("1. OK | 2. Cancle");
		System.out.print("선택 : ");
		
		String menuNo = sc.nextLine();
		if(menuNo.equals("1")) {
			//DB 작업 - TRUCHATE
			try {
				String sql = "DELETE FROM board WHERE bno = ?";
				pstmt = conn.prepareStatement(sql);
				pstmt.setInt(1, board.getBno());
				//SQL 실행
				pstmt.executeUpdate();
				
				pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
				exit();
			}
		}
	}

	//테이블을 유지하면서 전체 글 삭제 = sql : TRUNCATE TABLE board;
	private void clear() {
		//System.out.println("clear() 메서드 실행됨");
		System.out.println("[게시글 삭제]");
		System.out.println("-----------------------------------------------");
		//확인 취소 메뉴
		System.out.println("삭제하시겠습니까?");
		System.out.println("1. OK | 2. Cancle");
		System.out.print("선택 : ");
		
		String menuNo = sc.nextLine();
		if(menuNo.equals("1")) {
			//DB 작업 - TRUCHATE
			try {
				String sql = "TRUNCATE TABLE board";
				pstmt = conn.prepareStatement(sql);
				//SQL 실행
				pstmt.executeUpdate();
				
				pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
				exit();
			}	
		}
		list();
	}
	private void exit() {
		if(conn != null) {
			try {
				conn.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
		System.out.println("*** 게시판을 종료합니다. ***");
		System.exit(0);	//즉시 종료
	} 
	
	public static void main(String[] args) {
		BoardMain bd1 = new BoardMain();
		bd1.list();	
	}
}
