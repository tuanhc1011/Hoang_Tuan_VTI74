package TestingSystem_Assignment_01;

import java.time.LocalDate;
import java.util.Arrays;

public class Account {
	int id;
	String email;
	String userName;
	String fullName;
	Department departmentid;
	Position positionid;
	LocalDate creaDate;
	Group[] groups;

	@Override
	public String toString() {
		return "Account [id=" + id + ", email=" + email + ", userName=" + userName + ", fullName=" + fullName
				+ ", departmentid=" + departmentid + ", positionid=" + positionid + ", creaDate=" + creaDate
				+ ", groups=" + Arrays.toString(groups) + "]";
	}

}
