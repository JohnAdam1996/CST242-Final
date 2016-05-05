package cstFinal;
import java.util.Date;

public class Major {
	private String title;
	private String id;
	private double totalCredits;
	
	public Major(String title, String id, double totalCredits) {
		this.title = title;
		this.id = id;
		this.totalCredits = totalCredits;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public double getTotalCredits() {
		return totalCredits;
	}

	public void setTotalCredits(double totalCredits) {
		this.totalCredits = totalCredits;
	}
	
	@Override
	public String toString() {
		return "Major [title=" + title + ", id=" + id + ", totalCredits=" + totalCredits + "]";
	}
}
