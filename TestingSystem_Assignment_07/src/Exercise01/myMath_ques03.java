package Exercise01;

import java.util.Scanner;

public class myMath_ques03 {
	public static int max(int a, int b) {
		if (a <= b) {
			return b;
		} else {
			return a;
		}
	}

	public static int min(int a, int b) {
		if (a <= b) {
			return a;
		} else {
			return b;
		}
	}

	public static int sum(int a, int b) {
		return a + b;
	}

	public static void ques03() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập vào số thứ nhất: ");
		int a = scanner.nextInt();
		System.out.println("Nhập vào số thứ hai: ");
		int b = scanner.nextInt();

		System.out.println("Số lớn hơn là: " + myMath_ques03.max(a, b));
		System.out.println("Số nhỏ hơn là: " + myMath_ques03.min(a, b));
		System.out.println("Tổng của 2 số là: " + myMath_ques03.sum(a, b));
	}

}
