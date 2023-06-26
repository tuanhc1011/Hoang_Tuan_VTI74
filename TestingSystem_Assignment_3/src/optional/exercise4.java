package optional;

import java.util.Scanner;

public class exercise4 {
////// task1
//////	public static void main(String[] args) {
//////		String abc1;
//////		Scanner scan = new Scanner(System.in);
//////		System.out.println("Nhập vào dãy muốn đếm số ký tự: ");
//////		abc1 = scan.nextLine();
//////		String[] i = abc1.split("");
//////		System.out.println("Số ký tự là: " + i.length);
//////		scan.close();
//////	}
////// Task2
//////	public static void main(String[] args) {
//////
//////		Scanner scan1 = new Scanner(System.in);
//////		System.out.println("Nhập vào chuỗi ký tự thứ nhất: ");
//////		String s1 = scan1.next();
//////		System.out.println("Nhập vào chuỗi ký tự thứ hai: ");
//////		String s2 = scan1.next();
//////		System.out.println("Kết quả xâu 2 chuỗi là: " + s1 + " " + s2);
//////		scan1.close();
//////	}
////// Task3
//	public static void main(String[] args) {
//		Scanner scan3 = new Scanner(System.in);
//		String name;
//		System.out.println("Nhập vào tên muốn kiển tra chữ cái đầu: ");
//		name = scan3.nextLine();
//		String no1char = name.substring(0, 1).toUpperCase();
//		String charnext = name.substring(1);
//		System.out.println("Chữ cái đầu họ và tên: " + name.charAt(0));
//		name = no1char + charnext;
//		System.out.println(name);
//		scan3.close();
//	}

////// Task4
//	public static void main(String[] args) {
//		Scanner scan4 = new Scanner(System.in);
//		String nameUser;
//		System.out.println("Nhập vào tên người dùng: ");
//		nameUser = scan4.nextLine();
//		nameUser = nameUser.toUpperCase();
//		for (int i = 0; i < nameUser.length(); i++) {
//			System.out.println("Ký tự thứ " + (i + 1) + " là: " + nameUser.charAt(i));
//		}
//	}
//// Task5
//	public static void main(String[] args) {
//		Scanner fullname = new Scanner(System.in);
//		String ten;
//		String ho;
//		String tendem;
//		System.out.println("Nhập vào họ: ");
//		ho = fullname.nextLine();
//		System.out.println("Nhập vào tên đệm: ");
//		tendem = fullname.nextLine();
//		System.out.println("Nhập vào tên: ");
//		ten = fullname.nextLine();
//
//		System.out.println("Họ và tên: " + ho + " " + tendem + " " + ten);
//		fullname.close();
//	}
//// Task6
//	public static void main(String[] args) {
//		String fullname;
//		String name;
//		String midname;
//		String botname;
//		Scanner scan6 = new Scanner(System.in);
//		System.out.println("Nhập vào họ và tên: ");
//		fullname = scan6.nextLine();
//		fullname = fullname.trim();
//		String[] abc6 = fullname.split(" ");
//		botname = abc6[0];
//		System.out.println("Họ là: " + botname);
//		name = abc6[(abc6.length - 1)];
//		for (int i = 1; i <= abc6.length - 2; i++) {
//			midname = abc6[i];
//			System.out.println("Tên đệm là: " + midname);
//		}
//
//		System.out.println("Tên là: " + name);
//		scan6.close();
//	}
//// task 7
//	public static void main(String[] args) {
//		String name7;
//		String a701;
//		String a702;
//		Scanner scan7 = new Scanner(System.in);
//		System.out.println("Nhập vào họ và tên: ");
//		name7 = scan7.nextLine();
//		scan7.close();
//		name7 = name7.trim();
//		name7 = name7.replaceAll("\\s+", " ");
//		String[] abc7 = name7.split(" ");
//
//		for (String name701 : abc7) {
//			a701 = name701.substring(0, 1).toUpperCase();
//			a702 = name701.substring(1);
//			name701 = a701 + a702;
//			name7 = name7 + " ";
//
//		}
//		System.out.println("Tên chuẩn hóa: \n" + name7);
//
//	}
//// task8
//	public static void main(String[] args) {
//		String[] group = { "Java", "Group TT Java", "Doi Dev Gia va", "Gia va new" };
//		for (String gr8 : group) {
//			if (gr8.contains("Java")) {
//				System.out.println(gr8);
//			}
//		}
//	}
//// task9
//	public static void main(String[] args) {
//		String[] group9 = { "JAVA", "PYTHON", "C++", "HTML" };
//		for (String gr9 : group9) {
//			if (gr9.equals("JAVA")) {
//				System.out.println(gr9);
//			}
//		}
//	}
//// task10
//	public static void main(String[] args) {
//		Scanner scan10 = new Scanner(System.in);
//		String chuoi1, chuoi2;
//		System.out.println("Nhập vào chuỗi ký tự thứ nhất: ");
//		chuoi1 = scan10.nextLine();
//		System.out.println("Nhập chuỗi ký tự thứ 2: ");
//		chuoi2 = scan10.nextLine();
//		scan10.close();
//		String chuoidaonguocchuoi1 = new StringBuffer(chuoi1).reverse().toString();
//		if (chuoi2.equals(chuoidaonguocchuoi1)) {
//			System.out.println("2 chuỗi đảo ngược nhau");
//		} else {
//			System.out.println("2 chuỗi không đảo ngược");
//		}
//	}
//// task11
	public static void main(String[] args) {
		String chuoikytu11;
		Scanner scan11 = new Scanner(System.in);
		System.out.println("Nhập vào chuỗi ký tự: ");
		chuoikytu11 = scan11.nextLine();
		scan11.close();
		int x = 0;
		for (int i = 0; i < chuoikytu11.length(); i++) {
			if ('a' == chuoikytu11.charAt(i)) {
				x++;
			}
		}
		System.out.println(x);
	}

}