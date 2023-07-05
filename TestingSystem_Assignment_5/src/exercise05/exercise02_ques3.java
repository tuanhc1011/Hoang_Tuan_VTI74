package exercise05;

import java.util.Scanner;

public class exercise02_ques3 {
	Float a03;
	Float b03;

	Float chuVi() {
		return 2 * (a03 + b03);
	}

	Float dienTich() {
		return a03 * b03;
	}

	public exercise02_ques3(Float a031, Float b031) {
		super();
		this.a03 = a031;
		this.b03 = b031;
	}

	public class hinhVuong extends exercise02_ques3 {
		public hinhVuong(Float a032) {
			super(a032, a032);
			// TODO Auto-generated constructor stub
		}
	}

	public class ques03 {
		private hinhVuong hVuong;
		Scanner scanner;

		public ques03() {
			scanner = new Scanner(System.in);
		}

		public void ques() {
			while (true) {
				System.out.println("----------------------------------------");
				System.out.println("----Chọn chức năng muốn sử dụng---------");
				System.out.println("1. Tạo hình vuông");
				System.out.println("2. Tính chu vi hình vuông");
				System.out.println("3. Tính diện tích hình vuông");
				System.out.println("4. Exit");
				System.out.println("----------------------------------------");
				int choose = scanner.nextInt();
				switch (choose) {
				case 1:
					System.out.println("Nhập vào độ dài cạnh hình vuông");
					Float a033 = scanner.nextFloat();
					hVuong = new hinhVuong(a033);
					System.out.println("Tạo thành công hình vuông cạnh dài " + a033);
					break;
				case 2:
					Float chuvi = hVuong.chuVi();
					System.out.println("Chu vi của hình vuông là: " + chuvi);
					break;
				case 3:
					Float dientich = hVuong.dienTich();
					System.out.println("Diện tích hình vuông là: " + dientich);
					break;
				case 4:
					return;
				default:
					System.out.println("Vui lòng lựa chọn từ 1 đến 4");
					break;
				}
			}
		}
	}

}
