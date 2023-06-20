package TestingSystem_Assignment_01;

public class task10 {
	public static void main(String[] args) {
		Department depa = new Department();
		depa.id = 1;
		depa.name = "Sale";
		Department depb = new Department();
		depb.id = 1;
		depb.name = "Sale";

		Account accc1 = new Account();
		accc1.email = "NguyenVanA@gmail.com";
		accc1.fullName = "Nguyen Van A";
		accc1.departmentid = depa;
		Account accc2 = new Account();
		accc2.email = "NguyenVanB@gmail.com";
		accc2.fullName = "Nguyen Van B";
		accc2.departmentid = depb;

//Task10
		Account[] accin4 = { accc1, accc2 };

		for (int a = 0; a < accin4.length; a++) {
			System.out.println("Thong tin acc thu " + (a + 1) + " la");
			System.out.println("Email: " + accin4[a].email);
			System.out.println("Fullname: " + accin4[a].fullName);
			System.out.println("Phong ban: " + accin4[a].departmentid.name);
		}
	}

}
