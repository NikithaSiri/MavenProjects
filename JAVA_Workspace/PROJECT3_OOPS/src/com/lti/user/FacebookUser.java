/* STATIC:
 * declated at class level
 * class variable
 * shared by all objects of that class
 * initialized once
 * their values can be changed-hold you can call static methods with class names
 * called directly without creating objects eg:Math.sqrt(); - math class have static methods so we dont have to create object*/


package com.lti.user;

class Facebook{
	
int userId;
int no=0;
static int like=0;
Facebook(int userId)
{
	this.userId=userId;
    
}
static void likes()
{
	like++;
	System.out.println("likes" +like);
}
@Override
public String toString() {
	return "Facebook [userId=" + userId + ", no=" + no + "]";
}
void showLikes()
{
	no++;
	System.out.println("no" +no);
}
}
public class FacebookUser {
	public static void main(String[] args) {
	
		Facebook user1=new Facebook(101);
		System.out.println(user1);
		user1.showLikes();
		Facebook.likes();
		Facebook user2=new Facebook(102);
		System.out.println(user2);
		user2.showLikes(); 
        Facebook.likes();
		Facebook user3=new Facebook(103);
		System.out.println(user3);
		user3.showLikes();
		Facebook.likes();

	}
}
