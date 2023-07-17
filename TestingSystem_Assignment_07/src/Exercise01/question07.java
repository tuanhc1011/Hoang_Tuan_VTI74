package Exercise01;

import java.util.Scanner;

public class question07 extends student {
	public question07() {
		super();
		COUNT++;
		if (COUNT > 7) {
			System.err.println("Bạn chỉ có thể tạo tối đa 7 sinh viên.");
		} else {
			this.id = COUNT;
			Scanner scanner = new Scanner(System.in);
			System.out.println("Nhập vào tên sinh viên: ");
			this.nameStudent = scanner.nextLine().trim();
		}
	}

	public void question07() {
		for (int i = 0; i <= 6; i++) {
			student student = new student();
		}
		System.out.println("Create Primary Student.");
		primaryStudent ps1 = new primaryStudent();
		System.out.println("Primary Student: " + ps1);

		System.out.println("Create Secondary Student.");
		secondaryStudent ss1 = new secondaryStudent();
		System.out.println("Secondary Student: " + ss1);
	}
}
