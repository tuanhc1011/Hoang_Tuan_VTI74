package TestingSystem_Assignment_01;

import java.time.LocalDate;
import java.util.Arrays;

public class Group {
	int id;
	String name;
	int creatorID;
	LocalDate creatDate;
	Account[] accounts;

	@Override
	public String toString() {
		return "Group [id=" + id + ", name=" + name + ", creatorID=" + creatorID + ", creatDate=" + creatDate
				+ ", accounts=" + Arrays.toString(accounts) + "]";
	}

}
