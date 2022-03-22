package threadDemo;

public class Test {
		public static void main(String[] args) {
			// write your code here
			Thread[] employees = new Thread[30];
			for (int i = 0; i < 30; i++) {
				Employee employee = new Employee(i);
				employees[i] = new Thread(employee);
				employees[i].start();
			}
		}
		
}
