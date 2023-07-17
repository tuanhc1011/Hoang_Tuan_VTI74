package Exercise01;

import java.util.Scanner;

public class student {
	int id;
	String nameStudent;
	public static String college = "Đại học Bách Khoa";
	public static int COUNT = 0;

	public student() {
		super();
		this.id = COUNT++;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập vào tên sinh viên: ");
		this.nameStudent = scanner.nextLine().trim();
	}

	@Override
	public String toString() {
		return "student [id=" + id + ", nameStudent=" + nameStudent + "]";
	}

}
