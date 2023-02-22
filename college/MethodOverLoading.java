package org.college;

public class MethodOverLoading {
	public void getStudentInfo(int ID) {
		System.out.println("Student Id is " + ID);
	}
	public void getStudentInfo(String name,int ID) {
		System.out.println("Student name is " + name + " Student ID IS " + ID);
	}
	public void getStudentInfo(String email,long phoneno) {
		System.out.println("Student email is " + email + " and student phone number is " + phoneno);
	}
	
	public static void main(String[] args) {
		MethodOverLoading studentDetails = new MethodOverLoading();
		studentDetails.getStudentInfo(345);
		studentDetails.getStudentInfo("VIJAY", 345);
		studentDetails.getStudentInfo("vijay@gmail.com", 8976543215l);
	
	}

}
