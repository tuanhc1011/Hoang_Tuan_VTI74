package TestingSystem_Assignment_01;

public class Task12 {
	public static void main(String[] args) {
		Department dep1 = new Department();
		dep1.id = 1;
		dep1.name = "Sale1";
		Department dep2 = new Department();
		dep2.id = 2;
		dep2.name = "Sale2";
		Department dep3 = new Department();
		dep3.id = 3;
		dep3.name = "Sale3";
		Department dep4 = new Department();
		dep4.id = 4;
		dep4.name = "Sale4";

//Task 12
		Department[] dep = { dep1, dep2, dep3, dep4 };
		for (int x = 0; x < 2; x++) {
			System.out.println("Thong tin phong ban so " + (x + 1) + " la: ");
			System.out.println("Ma ID phong ban la: " + dep[x].id);
			System.out.println("Ten phong ban nay la: " + dep[x].name);
		}
		;

	}

}
