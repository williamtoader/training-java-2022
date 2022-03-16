package polymorphismDemo;

public class Tomato extends Vegetable{
	
	public String getName() {
		return "Tomato";
	}
	
	public void f1(int a) {
		System.out.println("a function with one param");
	}
	public void f1(String a) {
		System.out.println("a function with one param as string");
	}
	public void f1(int a, int b) {
		System.out.println("a function with 2 param");
	}
	public void f1(int a, int b, int c) {
		System.out.println("a function with 3 param");
	}
	
}
