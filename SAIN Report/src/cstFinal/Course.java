package cstFinal;

public class Course {
	private String courseNum;
	private String courseTitle;
	private int credits;
	private String grade;
	
	public Course(String courseNum, String courseTitle, int credits, String grade) {
		this.courseNum = courseNum;
		this.courseTitle = courseTitle;
		this.credits = credits;
		this.grade = grade;
	}

	public String getCourseNum() {
		return courseNum;
	}

	public void setCourseNum(String courseNum) {
		this.courseNum = courseNum;
	}

	public String getCourseTitle() {
		return courseTitle;
	}

	public void setCourseTitle(String courseTitle) {
		this.courseTitle = courseTitle;
	}

	public int getCredits() {
		return credits;
	}

	public void setCredits(int credits) {
		this.credits = credits;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}
	
	@Override
	public String toString() {
		return "Course [courseNum=" + courseNum + ", courseTitle=" + courseTitle + ", credits=" + credits + ", grade="
				+ grade + "]";
	}
}
