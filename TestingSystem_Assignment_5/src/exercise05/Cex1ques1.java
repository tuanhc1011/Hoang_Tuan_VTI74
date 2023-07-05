package exercise05;

import java.util.ArrayList;
import java.util.Scanner;

import exercise05.exercise01.News;

public class Cex1ques1 {
	private Scanner scan2;
	private ArrayList<News> listNews;

	public Cex1ques1() {
		scan2 = new Scanner(System.in);
		listNews = new ArrayList<News>();
	}

	public void ques1() {
		menu();
	}

	private void menu() {
		while (true) {
			System.out.println("---------------------------");
			System.out.println("Lựa chọn chức năng bạn muốn sử dụng:");
			System.out.println("1. Insert news.");
			System.out.println("2. View list news.");
			System.out.println("3. Average rate");
			System.out.println("4. Exit.");
			System.out.println("---------------------------");
			int choose = scan2.nextInt();
			switch (choose) {
			case 1:
				System.out.println("Nhập vào Title:");
				String title = scan2.nextLine();
				System.out.println("Nhập vào Publish Date");
				String publishDate = scan2.nextLine();
				System.out.println("Nhập vào Author");
				String author = scan2.nextLine();
				System.out.println("Nhập vào Content");
				String content = scan2.nextLine();
				System.out.println("Nhập vào điểm đánh giá 1");
				int rate1 = scan2.nextInt();
				System.out.println("Nhập vào điểm đánh giá 2");
				int rate2 = scan2.nextInt();
				System.out.println("Nhập vào điểm đánh giá 3");
				int rate3 = scan2.nextInt();
				int[] rates = { rate1, rate2, rate3 };
				News news = new News(title, publishDate, author, content, rates);
				listNews.add(news);
				break;
			case 2:
				for (News new2 : listNews) {
					new2.display();
				}
				break;
			case 3:
				System.out.println("Đánh giá điểm bình chọn trung bình:");
				for (News news2 : listNews) {
					System.out.println("Title: " + news2.getTitle() + "điểm trung bình: " + news2.calculate());
				}
				break;
			case 4:
				return;
			default:
				System.out.println("Vui lòng chọn chức năng: ");
				break;
			}
		}
	}
}
