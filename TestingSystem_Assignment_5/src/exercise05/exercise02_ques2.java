package exercise05;

import java.time.LocalDate;
import java.util.Scanner;

public class exercise02_ques2 {
	public enum gender {
		MALE, FEMALE, UNKNOWN
	}

	String name;
	gender gen;
	LocalDate birthday;
	String address;

	public exercise02_ques2(String name, gender gender, LocalDate birthDate, String adress) {
		super();
		this.name = name;
		this.gen = gender;
		this.birthday = birthDate;
		this.address = adress;
	}

	public exercise02_ques2() {
		super();
	}

//// a)
	public void inputInfo() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập thông tin Person từ bàn phím: ");
		System.out.println("Name: ");
		this.name = sc.next();
		System.out.println("Gender 1.Male, 2.Female, 3.Unknown: ");
		int flagGender = sc.nextInt();
		switch (flagGender) {
		case 1:
			this.gen = gender.MALE;
			break;
		case 2:
			this.gen = gender.FEMALE;
			break;
		case 3:
			this.gen = gender.UNKNOWN;
			break;
		}
		System.out.println("Birthday nhập theo định dạng yyyy-MM-dd: ");
		this.birthday = LocalDate.parse(sc.next());
		System.out.println("Address: ");
		this.address = sc.next();
	}

//// b)
	public String showInfo() {
		return "Person [name: " + name + ", gender: " + gen + ", birthday: " + birthday + ", address:" + address + "]";
	}
//// class lưu trữ thông tin sinh viên

	public class student extends exercise02_ques2 {
		int id;
		Float avgPoin;
		String email;

//a)
		public void infor() {
			Scanner scan0202 = new Scanner(System.in);
			super.inputInfo();
			System.out.println("Nhập vào mã sinh viên");
			this.id = scan0202.nextInt();
			System.out.println("Nhập vào điểm trung bình");
			this.avgPoin = scan0202.nextFloat();
			System.out.println("Nhập vào email sinh viên");
			this.email = scan0202.nextLine();
		}

//b)
		public String showInfor() {
			return super.showInfo() + "Mã sinh viên" + id + ". Điểm trung bình: " + avgPoin + ". Email: " + email;
		}

		boolean hobo() {
			return avgPoin > 8.0 ? true : false;
		}

		public void demo() {
			student st = new student();
			st.infor();
			if (st.hobo()) {
				System.out.println("sinh  viên này đạt học bổng.");
			} else {
				System.out.println("sinh viên này không đạt học bổng.");
			}
		}

	}
}
