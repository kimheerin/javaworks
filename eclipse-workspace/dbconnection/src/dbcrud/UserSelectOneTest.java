package dbcrud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import domain.User;

public class UserSelectOneTest {

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
			String sql = "SELECT * FROM users WHERE userid = ? ";
			pstmt = conn.prepareStatement(sql);
			
			//? 값 지정
			pstmt.setString(1, "today");

			//SQL 실행 - 검색
			ResultSet rs = pstmt.executeQuery();
			if(rs.next()) {	//검색한 데이터가 있으면(찾았다면)
				//DB에서 userid(컬럼은 소문자)를 꺼내옴
				User user =new User();
				user.setUserId(rs.getString("userid"));
				user.setUserName(rs.getString("username"));
				user.setUserPwd(rs.getString("userpwd"));
				user.setUserAge(rs.getInt("userage"));
				user.setUserEmail(rs.getString("useremail"));
				//객체 정보를 문자열로 출력함
				//System.out.println(user);
			
				System.out.println("userId : " + user.getUserId());
				System.out.println("username : " + user.getUserName());
				System.out.println("userpwd : " + user.getUserPwd());
				System.out.println("userage : " + user.getUserAge());
				System.out.println("useremail : " + user.getUserEmail());
				
				/*
				String userId = rs.getString("userid");
				String userName = rs.getString("username");
				String userPwd = rs.getString("userpwd");
				int userAge = rs.getInt("userage");
				String userEmail = rs.getString("useremail");
				
				//db에서 userid(칼럼은 소문자)를 꺼내옴
				System.out.println("userId : " + userId);
				System.out.println("username : " + userName);
				System.out.println("userpwd : " + userPwd);
				System.out.println("userage : " + userAge);
				System.out.println("useremail : " + userEmail);
				*/
							
			}else {
				System.out.println("ID가 존재하지 않습니다.");
			}
			rs.close();
			pstmt.close();
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
}