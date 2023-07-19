package exercise03;

public class CPU {
	float price;

	public CPU(float price) {
		super();
		this.price = price;
	}

	public class processor {
		int coreAmount;
		String menufacture;
	}

	public Double getCache() {
		return 4.3;
	}

	public class ram {
		int memory;
		String menufacture;

		public ram(int memory, String manufacture) {
			this.memory = memory;
			this.menufacture = manufacture;
		}

		public double getClockspeed() {
			return 5.5;
		}
	}
}
