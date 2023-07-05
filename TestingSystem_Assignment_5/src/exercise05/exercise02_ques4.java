package exercise05;

import java.util.Scanner;

public class exercise02_ques4 {
	int sum(int a41, int a42) {
		return (a41 + a42);
	}

	byte sum(byte a41, byte a42) {
		return (byte) (a41 + a42);
	}

	Float sum(Float a41, Float a42) {
		return (a41 + a42);
	}

	int sum(int a41, byte a42) {
		return (a41 + a42);
	}

	Float sum(Float a41, int a42) {
		return (a41 + a42);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		exercise02_ques4 s1 = new exercise02_ques4();
		while (true) {
			System.out.println("--------------------------------------------");
			System.out.println("---Lựa chọn công thức tính tổng---");
			System.out.println("1. Tổng 2 số kiểu int (số có giá trị từ -2 tỷ đến 2 tỷ)");
			System.out.println("2. Tổng 2 số kiểu byte (số có giá trị từ -128 đến 127)");
			System.out.println("3.Tính tổng 2 số kiểu float (số thực)");
			System.out.println("4. Tông 2 số kiểu int và float");
			System.out.println("5. Tổng 2 số kiểu byte và int");
			System.out.println("6. Exit");
			System.out.println("--------------------------------------------");
			int choose = scanner.nextInt();
			switch (choose) {
			case 1:
				System.out.println("Nhập vào số int 1: ");
				int a = scanner.nextInt();
				System.out.println("Nhập vào số int 2: ");
				int b = scanner.nextInt();
				System.out.println("Tổng 2 số là: " + s1.sum(a, b));
				break;
			case 2:
				System.out.println("Nhập vào số byte 1: ");
				int a2 = scanner.nextInt();
				System.out.println("Nhập vào số byte 2: ");
				int b2 = scanner.nextInt();
				System.out.println("Tổng 2 số là: " + s1.sum(a2, b2));
				break;
			case 3:
				System.out.println("Nhập vào số float 1: ");
				int a3 = scanner.nextInt();
				System.out.println("Nhập vào số float 2: ");
				int b3 = scanner.nextInt();
				System.out.println("Tổng 2 số là: " + s1.sum(a3, b3));
				break;
			case 4:
				System.out.println("Nhập vào số float 1: ");
				int a4 = scanner.nextInt();
				System.out.println("Nhập vào số int 2: ");
				int b4 = scanner.nextInt();
				System.out.println("Tổng 2 số là: " + s1.sum(a4, b4));
				break;
			case 5:
				System.out.println("Nhập vào số int 1: ");
				int a5 = scanner.nextInt();
				System.out.println("Nhập vào số byte 2: ");
				int b5 = scanner.nextInt();
				System.out.println("Tổng 2 số là: " + s1.sum(a5, b5));
				break;
			case 6:
				return;
			}
		}
	}
}
