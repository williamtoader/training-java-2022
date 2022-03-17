package exceptionDemo;

import java.io.IOException;

public class Test {
	
	public static void main(String[] args) {
		

		
		try {
			int[] myNumbers = {1, 2, 3};
			System.out.println(myNumbers[2]);
			var x = 2/0;
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array index exception");
		}catch (RuntimeException e) {
			System.out.println("Runtime exception");
			var y = 10/0;
		}catch(Exception e) {
			System.out.println("general exception");
		}
		finally {
			System.out.println("The 'try catch' is finished.");
		}
		


	}
	
}
