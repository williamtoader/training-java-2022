package inheritancePackage;

public class Test {
	public static void main(String[] args) {
		Car c1 = new Car(100,1500,"green",4);
		System.out.println(c1.getNumberOfDoors());
		System.out.println(c1.getEnginePower());
		
	}
}
