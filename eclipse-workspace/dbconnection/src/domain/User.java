package domain;

import java.io.Serializable;

//DTO 클래스 (자료 전달 객체), VO
public class User implements Serializable{
	
	private static final long serializableID = 1111L; 
	
	//필드
	private String userId;
	private String userName;
	private String userPwd;
	private int userAge;
	private String userEmail;
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPwd() {
		return userPwd;
	}
	public void setUserPwd(String userpwd) {
		this.userPwd = userPwd;
	}
	public int getUserAge() {
		return userAge;
	}
	public void setUserAge(int userAge) {
		this.userAge = userAge;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId +
				"," + "userName=" + userName +
				", userPassword=" + userPwd +
				", userAge=" + userAge +
				", userEmail=" + userEmail + "]";
	}
}//class
