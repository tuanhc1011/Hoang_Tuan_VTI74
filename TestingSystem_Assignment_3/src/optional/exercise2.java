package optional;

import java.time.LocalDate;

public class exercise2 {
	private String email;
	private String userName;
	private String fullName;
	private LocalDate createDate;

	public static void main(String[] args) {
		exercise2[] acc1 = new exercise2[5];
		for (int i = 1; i < acc1.length; i++) {
			exercise2 task5 = new exercise2();
			task5.email = "Email" + i;
			task5.fullName = "Fullname" + i;
			task5.userName = "Username" + i;
			task5.createDate = LocalDate.now();
			acc1[i] = task5;
			System.out.println("Thông tin acc thứ " + i + " là: \n" + "Email: " + acc1[i].email + "\n" + " User name: "
					+ acc1[i].userName + "\n" + " Full name: " + acc1[i].fullName + "\n" + " Create Date "
					+ acc1[i].createDate);

		}

	}

}