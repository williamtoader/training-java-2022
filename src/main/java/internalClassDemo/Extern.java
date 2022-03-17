package internalClassDemo;

public class Extern {
	private int x;
	public void method1() {
		// code
	}
	class Intern {
		public void method2() {
			method1();
		}
	}
}
