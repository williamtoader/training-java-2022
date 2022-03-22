package fileTest;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class InputOutputTest {
	public static void main(String[] args) throws IOException {
		FileOutputStream out = new FileOutputStream("data.txt");
		for (int i = 1; i <= 50; i++) {
			out.write(i);
		}
		out.close();
		FileInputStream in = new FileInputStream("data.txt");
		int x;
		while ((x = in.read()) != -1){
			System.out.print(x + " ");
		}
		in.close();
	}
}

