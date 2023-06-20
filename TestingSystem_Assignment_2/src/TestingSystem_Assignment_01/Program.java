package TestingSystem_Assignment_01;

import java.sql.Date;
import java.time.LocalDate;

public class Program {
	public static void main(String[] args) {

// Department
		Department dep1 = new Department();
		dep1.id = 1;
		dep1.name = "Nam";

		Department dep2 = new Department();
		dep2.id = 2;
		dep2.name = "Anh";

		Department dep3 = new Department();
		dep3.id = 3;
		dep3.name = "Tuan";
// Position
		Position pos1 = new Position();
		pos1.id = 1;
		pos1.name = PositionName.Dev;

		Position pos2 = new Position();
		pos2.id = 2;
		pos2.name = PositionName.PM;

		Position pos3 = new Position();
		pos3.id = 3;
		pos3.name = PositionName.Test;

// Group
		Group group1 = new Group();
		group1.id = 1;
		group1.name = "dev";

		Group group2 = new Group();
		group2.id = 2;
		group2.name = "sale";

		Group group3 = new Group();
		group3.id = 3;
		group3.name = "test";

// account
		Account account1 = new Account();
		account1.id = 1;
		account1.email = "ngoanh@gmail.com";
		account1.fullName = "ngoanh";
		account1.departmentid = dep1;
		account1.positionid = pos2;
		account1.creaDate = LocalDate.of(2019, 10, 20);
		Group[] groupAccounts = { group1, group2 };
		account1.groups = groupAccounts;

		Account account2 = new Account();
		account2.id = 2;
		account2.email = "ngoanh2@gmail.com";
		account2.fullName = "ngoanh2";
		account2.departmentid = dep2;
		account2.positionid = pos1;
		account2.creaDate = LocalDate.of(2021, 06, 24);
		Group[] groupAccounts2 = { group3, group2 };
		account2.groups = groupAccounts2;
		account2.groups = groupAccounts;

		Account account3 = new Account();
		account3.id = 3;
		account3.email = "ngoanh3@gmail.com";
		account3.fullName = "ngoanh3";
		account3.departmentid = dep3;
		account3.positionid = pos3;
		account3.creaDate = LocalDate.of(2021, 11, 10);
		Group[] groupAccounts3 = { group3, group2, group1 };
		account3.groups = groupAccounts3;

// group account 
		group1.accounts = new Account[] { account1 };

		group2.accounts = new Account[] { account2, account3 };

		group2.accounts = new Account[] { account2, account3, account1 };
// Category
		CategoryQuestion cq1 = new CategoryQuestion();
		cq1.id = 11;
		cq1.categoryName = "Nhan tuong hoc";

		CategoryQuestion cq2 = new CategoryQuestion();
		cq2.id = 12;
		cq2.categoryName = "Than so hoc";

		CategoryQuestion cq3 = new CategoryQuestion();
		cq3.id = 13;
		cq3.categoryName = "Triet hoc Mac_Lenin";

// Type Question
		TypeQuestion tq1 = new TypeQuestion();
		tq1.typeID = 113;
		tq1.typeQuestionName = TypeQuestionName.Essay;

		TypeQuestion tq2 = new TypeQuestion();
		tq2.typeID = 113;
		tq2.typeQuestionName = TypeQuestionName.Mutiple_Choice;

		TypeQuestion tq3 = new TypeQuestion();
		tq3.typeID = 113;
		tq3.typeQuestionName = TypeQuestionName.Mutiple_Choice;

// question
		Question que1 = new Question();
		que1.id = 1;
		que1.content = "Sinh ngay 15/5/1997 la cung gi?";
		que1.categoryID = cq2;
		que1.creatorID = account3;
		que1.createDate = Date.valueOf("2020-11-10");
		que1.typeID = tq2;

		Question que2 = new Question();
		que2.id = 1;
		que2.content = "Thay giao ten la gi?";
		que2.categoryID = cq2;
		que2.creatorID = account2;
		que2.createDate = Date.valueOf("2019-10-08");
		que2.typeID = tq1;

		Question que3 = new Question();
		que3.id = 1;
		que3.content = "Hoc xong ra lam gi?";
		que3.categoryID = cq2;
		que3.creatorID = account1;
		que3.createDate = Date.valueOf("2018-11-06");
		que3.typeID = tq3;

// Answer
		Answer an1 = new Answer();
		an1.id = 10;
		an1.content = "Tra loi ngan gon";
		an1.questionID = que2;
		an1.isCorrect = true;

		Answer an2 = new Answer();
		an2.id = 11;
		an2.content = "Tra loi ngan gon";
		an2.questionID = que2;
		an2.isCorrect = false;

		Answer an3 = new Answer();
		an3.id = 12;
		an3.content = "Tra loi ngan gon";
		an3.questionID = que2;
		an3.isCorrect = true;

//Exam
		Exam ex1 = new Exam();
		ex1.id = 1111;
		ex1.code = "A111B";
		ex1.title = "bai tap so 1";
		ex1.category = new CategoryQuestion[] { cq1 };
		ex1.duration = 120;
		ex1.creatorID = account3;
		ex1.crateDate = Date.valueOf("2019-11-10");

		Exam ex2 = new Exam();
		ex2.id = 1112;
		ex2.code = "A111C";
		ex2.title = "bai tap so 2";
		ex2.category = new CategoryQuestion[] { cq1, cq3 };
		ex2.duration = 120;
		ex2.creatorID = account3;
		ex2.crateDate = Date.valueOf("2018-06-02");

		Exam ex3 = new Exam();
		ex3.id = 1113;
		ex3.code = "A111D";
		ex3.title = "bai tap so 3";
		ex3.category = new CategoryQuestion[] { cq2, cq3 };
		ex3.duration = 120;
		ex3.creatorID = account3;
		ex3.crateDate = Date.valueOf("2020=11=15");

//Exam Question
		ExamQuestion eq1 = new ExamQuestion();
		eq1.id = 11111;
		eq1.questionID = 1;

		ExamQuestion eq2 = new ExamQuestion();
		eq2.id = 11113;
		eq2.questionID = 2;

		ExamQuestion eq3 = new ExamQuestion();
		eq3.id = 11113;
		eq3.questionID = 3;

		System.out.println("Thông tin nhân sự thứ nhất là: " + account1.id + account1.fullName + account1.groups);

	}

}
