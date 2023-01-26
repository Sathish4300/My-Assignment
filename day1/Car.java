package Program.day1;

public class Car {
	public void applyBreak() {
		System.out.println("Vehicle can be stop");
	}
	public void applyGear() {
		System.out.println("User can able to change the gear");
	}
	public void applyAccelerate() {
		System.out.println("Vehicle is moving");
	}
	public void switchOnAc() {
		System.out.println("User can able to ON the AC");
	}
	public static void main(String[] args) {
		Car car = new Car();
		car.applyAccelerate();
		car.applyGear();
		car.switchOnAc();
		car.applyBreak();
	}
}
