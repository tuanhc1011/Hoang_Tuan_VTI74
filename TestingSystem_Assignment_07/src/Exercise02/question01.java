package Exercise02;

import java.util.Scanner;

public class question01 {
	public void ques01() {
		System.out.println("Chương trình tính tổng số nguyên dương với Pi:");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập vào số tự nhiên: ");
		int a = scanner.nextInt();
		System.out.println("Tổng là: " + mymath.sum(a));

//// Thay đổi số Pi báo lỗi luôn ở đầu.
		mymath.pi = 3.15;
	}
}
