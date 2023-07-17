package Exercise01;

public class question01 {
	public void ques01() {
		student[] students = new student[3];
		System.out.println("Create 3 students");
		for (int i = 0; i < students.length; i++) {
			System.out.println("student number " + (i + 1) + " :");
			student student = new student();
			students[i] = student;
		}
		System.out.println("Student information on Bách Khoa: ");
		for (int i = 0; i < students.length; i++) {
			System.out.println(students[i]);
		}
		System.err.println("Give awway 3 studen for Đại học Công nhệ: ");
		student.college = "Đại học Công nghệ";
		System.out.println("New student information after give away");
		for (int i = 0; i < students.length; i++) {
			System.out.println(students[i]);
		}
	}
}
