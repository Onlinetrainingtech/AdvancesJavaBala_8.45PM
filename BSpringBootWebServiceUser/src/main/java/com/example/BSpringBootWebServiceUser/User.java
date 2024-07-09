package com.example.BSpringBootWebServiceUser;

public class User 
{
   private int userid;
   private String username;
   private String useremail;
public int getUserid() {
	return userid;
}
public void setUserid(int userid) {
	this.userid = userid;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getUseremail() {
	return useremail;
}
public void setUseremail(String useremail) {
	this.useremail = useremail;
}
public User(int userid, String username, String useremail) {
	super();
	this.userid = userid;
	this.username = username;
	this.useremail = useremail;
}
public User() {
	
	// TODO Auto-generated constructor stub
}
   
   
}
