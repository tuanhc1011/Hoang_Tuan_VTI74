package Exercise01;

public class question02 {
	public static int moneyGroup = 0;

	public void ques02() {
		student[] students = new student[3];
		for (int i = 0; i < students.length; i++) {
			System.out.println("Student number " + (i + 1) + " :");
			student stu = new student();
			students[i] = stu;
		}
		System.err.println("Nộp quỹ 100k lẹ nào.");
		System.out.println("Tổng quỹ: " + (question02.moneyGroup += 300) + "k");
		System.out.println("Student A buy candy, bim bim 50k.");
		System.out.println("Tổng quỹ: " + (question02.moneyGroup -= 50) + "k");
		System.out.println("Student B buy break 20k.");
		System.out.println("Tổng quỹ:" + (question02.moneyGroup -= 20) + "k");
		System.out.println("Student C buy đồ dùng học tập 150k.");
		System.out.println("Tổng quỹ: " + (question02.moneyGroup -= 150) + "k");
		System.out.println("Đóng tiếp 50k tiền quỹ nữa nhé.");
		System.err.println("Tổng quỹ: " + (question02.moneyGroup += 150) + "k");
	}
}
