package TestingSystem_Assignment_01;

import java.sql.Date;

public class Question {
	int id;
	String content;
	CategoryQuestion categoryID;
	TypeQuestion typeID;
	Account creatorID;
	Date createDate;

	@Override
	public String toString() {
		return "Question [id=" + id + ", content=" + content + ", categoryID=" + categoryID + ", typeID=" + typeID
				+ ", creatorID=" + creatorID + ", createDate=" + createDate + "]";
	}

}
