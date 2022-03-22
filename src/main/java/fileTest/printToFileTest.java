package fileTest;
import java.io.File;
import java.io.PrintWriter;
public class printToFileTest {
	public static void main(String[] args) throws Exception {
		
		File f = new File("data.txt");
		if (!f.exists()) {
			System.err.println("The files does not exist!");
			System.exit(0);
		}
		
		PrintWriter pw = new PrintWriter(f);
		pw.append("Hello, World!");
		pw.append("2022");
		pw.close();
	}
}
