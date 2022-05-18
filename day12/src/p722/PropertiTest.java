package p722;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertiTest {
	
	public static void main(String[] args) {
		Properties pr = new Properties();
		String path = PropertiTest.class.getResource("database.properties.txt").getPath();
		try {
			pr.load(new FileReader(path));	// pr.load 파일을 로드하라는 뜻
		} catch (IOException e) {
			System.out.println("File Not Found ,,");
		}
		
		String url = pr.getProperty("url");
		String id = pr.getProperty("id");
		String pwd = pr.getProperty("pwd");
		
		System.out.printf("%s %s %s",url,id,pwd);
	}
}
