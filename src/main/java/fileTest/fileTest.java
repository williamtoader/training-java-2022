package fileTest;
import java.io.File;

public class fileTest {
	public static void main(String[] args) {
		File f = new java.io.File("data.txt");
		System.out.println(f.exists());
		System.out.println(f.length());
		System.out.println(f.canRead());
		System.out.println(f.canWrite());
		System.out.println(f.isDirectory());
		System.out.println(f.isFile());
		System.out.println(f.isAbsolute());
		System.out.println(f.isHidden());
		System.out.println(f.getAbsolutePath());
	}
}

