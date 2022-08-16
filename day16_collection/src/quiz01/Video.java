package quiz01;

import java.time.LocalDate;

public class Video {
	protected String title, category, lendName;
	protected LocalDate lendDate;
	protected boolean lend;
	
	public Video() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Video(String title, String category, String lendName, LocalDate lendDate, boolean lend) {
		super();
		this.title = title;
		this.category = category;
		this.lendName = lendName;
		this.lendDate = LocalDate.now();
		this.lend = lend;
	}

	public void display() {
		System.out.println("Video [title=" + title + ", category=" + category + ", lendName=" + lendName + ", lendDate=" + lendDate
				+ ", lend=" + lend + "]");
	}

}
