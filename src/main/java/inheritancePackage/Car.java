package inheritancePackage;

public class Car extends Vehicle{
	private int numberOfDoors;
	
	public Car() {};
	
	
	public Car(int enginePower, int weight, String color, int numberOfDoors) {
		this.setEnginePower(enginePower);
		this.setWeight(weight);
		this.setColor(color);
		this.setNumberOfDoors(numberOfDoors);
	}
	
	public int getNumberOfDoors() {
		return this.numberOfDoors;
	}
	
	public void setNumberOfDoors(int n) {
		this.numberOfDoors = n;
	}
}
