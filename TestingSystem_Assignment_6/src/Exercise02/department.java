package Exercise02;

import java.util.Scanner;

public class department {
	public static Scanner scanner2 = new Scanner(System.in);
	public static int COUNTdep;
	public int id;
	public String depName;

	@Override
	public String toString() {
		return "department [id=" + id + ", depName=" + depName + "]";
	}

	public department(String name) {
		super();
		COUNTdep++;
		this.id = COUNTdep;
		this.depName = name;
	}

	public department() {
		super();
		COUNTdep++;
		this.id = COUNTdep;
		System.out.println("Nhập vào tên phòng ban:");
		this.depName = scanner2.nextLine();
	}

}
