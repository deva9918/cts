package com;

class Engine1 {
	int engineNo, age;
	String fuelType;

	@Override
	public String toString() {
		return "Engine [engineNo=" + engineNo + ", age=" + age + ", fuelType=" + fuelType + "]";
	}

	public Engine1(int engineNo, int age, String fuelType) {
		super();
		this.engineNo = engineNo;
		this.age = age;
		this.fuelType = fuelType;
	}

	public int getEngineNo() {
		return engineNo;
	}

	public void setEngineNo(int engineNo) {
		this.engineNo = engineNo;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getFuelType() {
		return fuelType;
	}

	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}
}

	class car {
		@Override
		public String toString() {
			return "car [e=" + e + ", carNo=" + carNo + ", carModel=" + carModel + "]";
		}

		Engine1 e;
		int carNo;
		String carModel;

		public car(Engine1 e, int carNo, String carModel) {
			super();
			this.e = e;
			this.carNo = carNo;
			this.carModel = carModel;
		}

		public Engine1 getE() {
			return e;
		}

		public void setE(Engine1 e) {
			this.e = e;
		}

		public int getCarNo() {
			return carNo;
		}

		public void setCarNo(int carNo) {
			this.carNo = carNo;
		}

		public String getCarModel() {
			return carModel;
		}

		public void setCarModel(String carModel) {
			this.carModel = carModel;
		}

	}
public class Engine
{
public static void main(String ar[])
{
	car c=new car(new Engine1(101, 22, "petrol"), 122334, "suziki");
			System.out.println(c);
}

}
