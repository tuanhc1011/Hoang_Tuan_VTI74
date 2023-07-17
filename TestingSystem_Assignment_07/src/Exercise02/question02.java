package Exercise02;

import java.util.Scanner;

public class question02 {
	private final int idclass;
	String name;

	public question02(int id, String name) {
		super();
		this.idclass = id;
		this.name = name;
	}

	public String getNameStu() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getid() {
		return idclass;
	}

	@Override
	public String toString() {
		return "question02 [idclass=" + idclass + ", name=" + name + "]";
	}

	public void ques02() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Tạo thông tin sinh viên.");
		System.out.println("Nhập vào id: ");
		int id = scanner.nextInt();
		System.out.println("Tên sinh viên: ");
		String nameString = scanner.nextLine().trim();
		question02 question02 = new question02(id, nameString);
		System.out.println("Thông tin sinh viên vừa thêm mới: ");
		System.out.println(question02);
	}
}
