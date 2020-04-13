package com.kh.model.vo;

public class Player implements java.io.Serializable{
	
	private static final long serialVersionUID = -663632L;
	private String userId;		//유저아이디
	private String userPwd;		//유저비밀번호
	private String userName;	//유저 닉네임
	private String phoneNumber;	//핸드폰번호
	private String email;		//이메일
	private int pearl = 0;	//진주
	private int garbage = 0;	//쓰레기
	private int sp = 10;		//공격력
	private int satiety = 100;	//포만감

	public Player() {}

	public Player(String userId, String userPwd, String userName, 
			String phoneNumber, String email) {
		super();
		this.userId = userId;
		this.userPwd = userPwd;
		this.userName = userName;
		this.phoneNumber = phoneNumber;
		this.email = email;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getUserId() {
		return userId;
	}

	public String getUserPwd() {
		return userPwd;
	}

	public String getUserName() {
		return userName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public int getPearl() {
		return pearl;
	}

	public int getGarbage() {
		return garbage;
	}

	public int getSp() {
		return sp;
	}

	public int getSatiety() {
		return satiety;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setPearl(int pearl) {
		this.pearl = pearl;
	}

	public void setGarbage(int garbage) {
		this.garbage = garbage;
	}

	public void setSp(int sp) {
		this.sp = sp;
	}

	public void setSatiety(int satiety) {
		this.satiety = satiety;
	}
	

}


