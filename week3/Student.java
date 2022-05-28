package org.student;

import org.department.Department;

public class Student extends Department{

	public void studentName() {
		System.out.println("Student Name: Sunitha");
	}
	public void studentDept() {
		System.out.println("Student Department: Electronics");
	}
	public void studentId() {
		System.out.println("Student ID: 401");
	}
	public static void main(String[] args) {
		Student student = new Student();
		student.collegeName();
		student.collegeCode();
		student.collegeRank();
		student.deptName();
		student.studentId();
		student.studentName();
		student.studentDept();
	}
}
