package dbcrud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserInsertTest {

	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt = null;	//SQL 처리 클래스
		
		//JDBC 드라이버 등록
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			
			//연결하기 - URL, user, password
			conn = DriverManager.getConnection(
								"jdbc:oracle:thin:@localhost:1521/xe"
								,"c##mydb"
								,"pwmydb");
			System.out.println("연결 성공!");
			
			//DB처리 작업
			//매개 변수화된 SQL문 작성 - 동적 바인딩
			String sql = "INSERT INTO users(userid, username, userpwd, userage, useremail) "
					+ "VALUES (?, ?, ?, ?, ?)";
			pstmt = conn.prepareStatement(sql);
			
			//? 값 지정
			pstmt.setString(1, "cloud2");
			pstmt.setString(2, "한구름");
			pstmt.setString(3, "u12345");
			pstmt.setInt(4, 38);
			pstmt.setString(5, "cloudd@korea.kr");
			
			//SQL 실행
			int rows = pstmt.executeUpdate();
			System.out.println("저장된 행의 수 : " + rows);
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		}catch (SQLException e) {
			e.printStackTrace();
		}finally {
			if(conn != null) {	//연결되어 있다면
				try {
					conn.close();
					System.out.println("연결 종료");
				}catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}//main
}//class
