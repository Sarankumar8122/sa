package org.college;

public class Student extends Dept {
private void studentName() {
	// TODO Auto-generated method stub
System.out.println("Student Name is Jackson");
	
}
private void studentDept() {
	// TODO Auto-generated method stub
System.out.println("Student department is Mechanical Engineering");
}
private void studentId() {
	// TODO Auto-generated method stub
System.out.println("Student ID is 12345678");
}
public static void main(String[] args) {
	Student c= new Student();
	c.studentName();
	c.studentId();
	c.studentDept();
	c.collegeName();
	c.collegeCode();
	c.collegeRank();
	c.hostalName();
	
	
	
	
}
}
