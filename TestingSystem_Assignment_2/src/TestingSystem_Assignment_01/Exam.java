package TestingSystem_Assignment_01;

import java.sql.Date;
import java.util.Arrays;

public class Exam {
	int id;
	String code;
	String title;
	CategoryQuestion[] category;
	int duration;
	Account creatorID;
	Date crateDate;
	Question[] questions;

	@Override
	public String toString() {
		return "Exam [id=" + id + ", code=" + code + ", title=" + title + ", category=" + Arrays.toString(category)
				+ ", duration=" + duration + ", creatorID=" + creatorID + ", crateDate=" + crateDate + ", questions="
				+ Arrays.toString(questions) + "]";
	}

}
