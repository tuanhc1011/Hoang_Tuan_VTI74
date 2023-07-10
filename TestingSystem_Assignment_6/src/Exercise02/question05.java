package Exercise02;

import java.util.Scanner;

public class question05 {
	public static Scanner scanner = new Scanner(System.in);

	public static int inputAge() {
		while (true) {
			try {
				return Integer.parseInt(scanner.next().trim());
			} catch (Exception e) {
				// TODO: handle exception
				System.err.println(" Nhập lại số tuổi : ");
			}
		}
	}

	public static int inputNegaiveInt() {
		while (true) {
			try {
				int input = Integer.parseInt(scanner.next());
				if (input >= 0) {
					return input;
				} else {
					System.err.println("Nhập lại số tuổi:");
				}
			} catch (Exception e) {
				// TODO: handle exception
				System.err.println("Nhập lại số tuổi:");
			}
		}
	}

	public static float inputAgeFloat() {
		while (true) {
			try {
				return Float.parseFloat(scanner.next());
			} catch (Exception e) {
				// TODO: handle exception
				System.err.println("...");
			}
		}
	}

	public static double inputAgeDouble() {
		while (true) {
			try {
				return Double.parseDouble(scanner.next());
			} catch (Exception e) {
				// TODO: handle exception
				System.err.println("...");
			}
		}
	}

	public static String inputAgeString() {
		while (true) {
			// trim() xóa khoảng trắng đầu và cuối chuỗi String nhập vào
			String xString = scanner.nextLine().trim();
			if (xString.isEmpty()) {
				return xString;
			} else {
				System.err.println("Nhập lại");

			}
		}
	}

//// question06
	public static void main(String[] args) {
		while (true) {
			try {
				int age06 = question05.inputAge();
				if (age06 >= 0) {
					System.out.println(age06);
				} else {
					System.out.println("nhap lai:");
				}
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("nhap lai");
			}

		}
	}
}
