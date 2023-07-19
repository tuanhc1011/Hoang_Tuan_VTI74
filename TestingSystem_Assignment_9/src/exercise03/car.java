package exercise03;

public class car {
	String name;
	String type;

	public car(String name, String type) {
		super();
		this.name = name;
		this.type = type;

	}

	@Override
	public String toString() {
		return "car [name=" + name + ", type=" + type + "]";
	}

	public class engine {
		String eType;

		public engine(String eType) {
			super();
			this.eType = eType;
		}

		@Override
		public String toString() {
			return "engine [eType=" + eType + "]";
		}

		public String getEngineType() {
			return eType;
		}

		public void setEngineType(String eType) {
			this.eType = eType;
		}

	}
}
