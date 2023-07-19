package exercise03;

import exercise03.car.engine;

public class question02 {
	public void question02() {
		car car = new car("Mazda", "8WD");
		engine e1 = car.new engine("Crysler");
		System.out.println("da them moi oto");
		System.out.println("thong tin " + car);
		System.out.println("thong tin dong co " + e1);
	}
}
