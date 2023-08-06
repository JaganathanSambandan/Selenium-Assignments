package org.student;

import org.department.Department;

public class Student extends Department {

	public void studentName()
	{
		System.out.println("Student Name is Jaganathan");
	}
	
	public void studentDept()
	{
		System.out.println("Student Department is B.C.A");
	}
	public void studentId()
	{
		System.out.println("Student ID is 40946");
	}
	
	public static void main(String[] args) {
		Student s=new Student();
		s.collegeName();
		s.collegeCode();
		s.collegeRank();
		s.deptName();
		s.studentName();
		s.studentDept();
		s.studentId();
	}
}
