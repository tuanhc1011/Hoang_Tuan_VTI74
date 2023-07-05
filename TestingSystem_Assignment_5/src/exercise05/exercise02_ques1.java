package exercise05;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class exercise02_ques1 {
	public interface Istudent {
		void diemDanh();

		void hocBai();

		void donVeSinh();
	}

	static class Student implements Istudent {
		public static int COUNT;
		private int id;
		private String name;
		private int group;

		@Override
		public String toString() {
			return "Student [id: " + id + ", name: " + name + ", group: " + group

					+ "]";
		}

		public int getGroup() {
			return group;
		}

		@Override
		public void diemDanh() {
			System.out.println(name + " điểm danh.");
		}

		@Override
		public void hocBai() {

			System.out.println(name + " đang học bài.");
		}

		@Override
		public void donVeSinh() {
			System.out.println(name + " đi dọn vệ sinh.");
		}

		public Student(String name, int group) {
			COUNT++;
			this.id = COUNT;
			this.name = name;
			this.group = group;
		}
	}

	public class ques1 {
		ArrayList<Student> listStudents;
		Random random;
		Scanner scan0201;

		public ques1() {
			listStudents = new ArrayList<exercise02_ques1.Student>();
			random = new Random();
			scan0201 = new Scanner(System.in);
		}

		void ques1() {
			while (true) {
				System.out.println("---------------------------");
				System.out.println("1. Tạo danh sách sinh viên");
				System.out.println("2. Hiển thị danh sách sinh viên");
				System.out.println("3. Điểm danh sinh viên");
				System.out.println("4. Gọi nhóm 1 đi học");
				System.out.println("5. Gọi nhóm 2 đi dọn vệ sinh");
				System.out.println("6. Exit");
				System.out.println("----------------------------");
				int chose1 = scan0201.nextInt();
				switch (chose1) {
//// a)
				case 1:
					inStudent();
					System.out.println("Tạo thành công 10 sinh viên.");
					break;
				case 2:
					for (Student student : listStudents) {
						System.out.println(student);
					}
					break;
//// b)
				case 3:
					System.out.println("Cả lớp điểm danh: ");
					for (Student student : listStudents) {
						student.diemDanh();
					}
					break;
//// c)
				case 4:
					System.out.println("Nhóm 1 đi học bài: ");
					for (Student student : listStudents) {
						if (student.getGroup() == 1) {
							student.hocBai();
						}
					}
					break;
//// d)
				case 5:
					System.out.println("Nhóm 2 đi dọn vệ sinh: ");
					for (Student student : listStudents) {
						if (student.getGroup() == 2) {
							student.donVeSinh();
						}
					}
					break;
				case 6:
					return;
				default:
					System.out.println("Vui lòng lựa chọn đúng số trên menu");

					break;
				}
			}
		}

//// a)
		private void inStudent() {
			for (int i = 0; i < 10; i++) {
				Student st = new Student("Student " + (i + 1),

						random.nextInt(3) + 1);

				listStudents.add(st);

			}
		}
	}
}
