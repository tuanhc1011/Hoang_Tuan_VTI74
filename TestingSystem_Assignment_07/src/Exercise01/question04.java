package Exercise01;

public class question04 {
	public String getcollege() {
		return student.college;
	}

	public static void changeCollege(String newCollege) {
		student.college = newCollege;
	}

	public static void ques04() {
		System.out.println("change college: ");
		student student = new student();
		System.out.println("college is: " + student.college);
		System.err.println("change college to Đại học Hà Nội");
		student.college = "Đại học Hà Nội";
		System.out.println("Bây giờ bạn ấy là sinh viên của " + student.college);
	}

}