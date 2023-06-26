package optional;

import java.util.Scanner;

public class exercise1 {

	/// Ques1
//	public static void main(String[] args) {
//		float luongAcc1 = 5240.5f;
//		float luongAcc2 = 10970.055f;
//		int a = (int) luongAcc1;
//		int a2 = (int) luongAcc2;
//
//		System.out.println("lương của Account 1 là: " + a);
//		System.out.println("lương của Account 2 là: " + a2);
//
//	}
	/// Ques 2
//	public static void main(String[] args) {
//		int min = 0;
//		int max = 9999;
//		int q2 = (int) (Math.random() * max) + min;
//		if (q2 < 10000) {
//			System.out.printf("%0,6d \n", q2);
//		} else {
//			System.out.println(q2);
//		}
//	}
/// Ques 3
//	public static void main(String[] args) {
//		int q3 = (int) (Math.random() * (99999 - 1)) + 1;
//		System.out.println(q3);
//		String b = String.valueOf(q3);
//		System.out.println("Hai số cuối là: " + b.substring(3));
//	}
	/// Ques 4
	public static void main(String[] args) {
		int a1;
		int a2;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập vào số thứ nhất: ");
		a1 = scanner.nextInt();
		do {
			System.out.println("Nhập vào số thứ hai: ");
			a2 = scanner.nextInt();
			if (a2 == 0) {
				System.out.println("vui lòng nhập b khác 0");
			}
		} while (a2 == 0);
		scanner.close();
		System.out.println("Thương của 2 số là: " + (float) a1 / a2);
	}
}
