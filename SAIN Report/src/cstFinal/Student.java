package cstFinal;
import java.util.Date;

public class Student {
	private String name;
	private String majorID;
	private String username;
	private String password;
	private String id;
	private Date date;
	private double GPA;
	
	public Student(String name, String majorID, String username, String password, String id, Date date, double GPA) {
		this.name = name;
		this.majorID = majorID;
		this.username = username;	
		this.password = password;
		this.id = id;
		this.date = date;
		this.GPA = GPA;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMajorID() {
		return majorID;
	}

	public void setMajorID(String majorID) {
		this.majorID = majorID;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public double getGPA() {
		return GPA;
	}

	public void setGPA(double gPA) {
		GPA = gPA;
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", majorID=" + majorID + ", username=" + username + ", password=" + password
				+ ", id=" + id + ", date=" + date + ", GPA=" + GPA + "]";
	}
	
}
