package abstractDemo;

public class Test {
	public static void main(String[] args) {
		Vehicle c1 = new Car();
		Vehicle a1 = new Airplane();
		
		c1.startEngine();
		a1.startEngine();
		System.out.print(c1.toString());
		
	}
}
