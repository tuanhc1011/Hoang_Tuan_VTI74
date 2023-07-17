package Exercise01;

public class secondaryStudent extends student {
	public static int COUNTsec06 = 0;

	public secondaryStudent() {
		super();
		COUNTsec06++;
	}

	public void ques06() {
		System.out.println("Create 2 primary stu");
		primaryStudent pr1 = new primaryStudent();
		primaryStudent pr2 = new primaryStudent();
		System.out.println("Create 6 secondary stu");
		secondaryStudent sec1 = new secondaryStudent();
		secondaryStudent sec2 = new secondaryStudent();
		secondaryStudent sec3 = new secondaryStudent();
		secondaryStudent sec4 = new secondaryStudent();
		secondaryStudent sec5 = new secondaryStudent();
		secondaryStudent sec6 = new secondaryStudent();

		System.out.println("Số student");
		String length = "8";
		System.out.println("Tổng sinh viên: " + length);
		System.out.println("pre sinh viên: " + "2");
		System.out.println("secondary sinh vien: " + "6");
	}
}