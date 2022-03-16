package InterfaceDemo;

public class Car implements Vehicle,Metal{

	private static boolean wasInit = false;
	private static Car ref;
	private Car() {
		
	}

	public static Car getInstance() {
		if(wasInit) {
			return ref;
		}else {
			ref = new Car();
			wasInit = true;
			return ref;
		}
	}
	
	@Override
	public void shine() {
		System.out.println("The metal is shining");
		
	}

	@Override
	public void startEngine() {
		System.out.println("the vehicle is running");
		
	}

}
