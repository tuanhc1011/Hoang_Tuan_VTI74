package TestingSystem_Assignment_01;

import java.time.LocalDate;

public class Task6 {
	public static void main(String[] args) {
		Department dep1 = new Department();
		dep1.id = 1;
		dep1.name = "Phong Marketing";
		Department dep2 = new Department();
		dep2.id = 2;
		dep2.name = "Phong Sale";
		Department dep3 = new Department();
		dep3.id = 3;
		dep3.name = "Phong BOD";

		Position pos1 = new Position();
		pos1.id = 1;
		pos1.name = PositionName.Dev;
		Position pos2 = new Position();
		pos2.id = 2;
		pos2.name = PositionName.PM;
		Position pos3 = new Position();
		pos3.id = 3;
		pos3.name = PositionName.Scrum_Master;

		Group group1 = new Group();
		group1.id = 1;
		group1.name = "Testing System";
		group1.creatDate = LocalDate.of(2021, 1, 1);
		Group group2 = new Group();
		group2.id = 2;
		group2.creatDate = LocalDate.of(2023, 6, 20);
		group2.name = "Development";

		Group group3 = new Group();
		group3.id = 3;
		group3.creatDate = LocalDate.of(2021, 10, 15);
		group3.name = "Sale";

		Account acc1 = new Account();
		acc1.id = 1;
		acc1.email = "daonq1";
		acc1.userName = "daonq1";
		acc1.fullName = "Dao Nguyen 1";
		acc1.departmentid = dep1;
		acc1.positionid = pos1;
		acc1.creaDate = LocalDate.now();
		Group[] groupAcc1 = { group1, group2 };
		acc1.groups = groupAcc1;
		Account acc2 = new Account();
		acc2.id = 2;
		acc2.email = "daonq2";
		acc2.userName = "daonq2";
		acc2.fullName = "Dao Nguyen 2";
		acc2.departmentid = dep2;
		acc2.positionid = pos2;
		acc2.creaDate = LocalDate.of(2021, 03, 17);
		acc2.groups = new Group[] { group3, group2 };
		Account acc3 = new Account();
		acc3.id = 3;
		acc3.email = "daonq3";
		acc3.userName = "daonq3";
		acc3.fullName = "Dao Nguyen 3";
		acc3.departmentid = dep3;
		acc3.positionid = pos3;
		acc3.creaDate = LocalDate.now();

		group1.accounts = new Account[] { acc1 };
		group2.accounts = new Account[] { acc1, acc2 };
		group3.accounts = new Account[] { acc2 };

// Task6

		int accgroup = acc2.groups.length;
		if (accgroup == 0) {
			System.out.println("nhan vien nay chua co group");
		} else {
			switch (accgroup) {
			case 1:
				System.out.println("Group cua nhan vien nay la Java Fresher, C# Fresher");
				break;
			case 2:
				System.out.println("Group cua nhan vien nay la Java Fresher, C# Fresher");
				break;
			default:
				System.out.println("Nhan vien nay la nguoi quan trong, tham gia nhieu group");
				break;
			}

		}
	}
}
