package TestingSystem_Assignment_01;

public class Task11 {
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

//Task11
		Department[] dep = { depa, depb };

		for (int b = 0; b < dep.length; b++) {
			System.out.println("Thong tin phong ban thu " + (b + 1) + " la");
			System.out.println("Thong tin ID: " + dep[b].id);
			System.out.println("Fullname: " + dep[b].name);
		}
	}
}
