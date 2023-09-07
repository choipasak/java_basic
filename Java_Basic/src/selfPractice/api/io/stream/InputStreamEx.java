package selfPractice.api.io.stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class InputStreamEx {

	public static void main(String[] args) {
		
		try {
			FileInputStream fis = new FileInputStream("C:/MyWork");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
