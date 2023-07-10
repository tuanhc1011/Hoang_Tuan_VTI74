package Exercise02;

import java.util.Scanner;

import Exercise02.enumNamePossition.positionName;

public class position {
	public static Scanner scanner1 = new Scanner(System.in);
	public static int COUNT = 0;
	public int id;
	public positionName posName;

	@Override
	public String toString() {
		return "position [id=" + id + ", posName=" + posName + "]";
	}

	public position() {
		super();
		COUNT++;
		this.id = COUNT++;
		System.out.println("chon ten vi tri muon nhap 1. DEV..... 2. TEST........3. SCRUM_MASTER.........4. PM......");
		while (true) {
			int choose = scanner1.nextInt();
			switch (choose) {
			case 1:
				this.posName = enumNamePossition.positionName.DEV;
				return;
			case 2:
				this.posName = positionName.TEST;
				return;
			case 3:
				this.posName = positionName.SCRUM_MASTER;
				return;
			case 4:
				this.posName = positionName.PM;
				return;

			default:
				System.err.println("Vui lòng chọn số từ 1 đến 4");
			}
		}
	}
}
