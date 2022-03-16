package polymorphismDemo;

public class Test {
	public static void main(String[] args) {
		Vegetable t1 = new Tomato();
		Vegetable a1 = new Apple();
		System.out.println(t1.getName());
		System.out.println(a1.getName());
		
		Tomato t = (Tomato) t1;
		
		t.f1(2);
		t.f1("abc");
		t.f1(2,3);
		t.f1(2,3,4);
		
		System.out.println(t instanceof Tomato);
	}
}
