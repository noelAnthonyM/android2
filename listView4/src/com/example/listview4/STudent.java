package com.example.listview4;

public class STudent {

	private int image;
	private String studentName;
	private String course;
	
	public STudent(int image, String studentName, String course) {
		super();
		this.image = image;
		this.studentName = studentName;
		this.course = course;
	}
	public int getImage() {
		return image;
	}
	public void setImage(int image) {
		this.image = image;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	
}
