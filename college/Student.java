package org.college;

public class Student extends Department {
	public void studentName() {
		System.out.println("Student name is Sathish");
	}
	public void studentDep() {
		System.out.println("He choose MEC DEP");
	}
	public void studentId() {
		System.out.println("Student Id is 23451");
	}
	public static void main(String[] args) {
		Student details = new Student();
		details.collegeName();
		details.collegeCode();
		details.collegeRank();
		details.department();
		details.studentName();
		details.studentId();
		details.studentDep();
	}

}
