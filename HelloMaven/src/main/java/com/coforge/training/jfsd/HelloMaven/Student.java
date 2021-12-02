package com.coforge.training.jfsd.HelloMaven;

public class Student {
	
	private int rollno;
	private String name;
	private String course;
	private double marks;
	
	
	public Student(int rollno, String name, String course, double marks) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.course = course;
		this.marks = marks;
	}
	
	public void display()
	{
		System.out.println("***********Student Details*****");
		System.out.println(this.rollno+" "+this.name+" "+this.course+" "+this.marks);
	}
	
	
	

}
