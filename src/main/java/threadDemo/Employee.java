package threadDemo;


class Employee implements Runnable {
	int no;
	public Employee(int no) {
		this.no = no;
	}
	@Override
	public void run() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Employee " + this.no + " arrived at work!");
	}
}
