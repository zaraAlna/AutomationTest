package utilities;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;


public class ReadPropertyFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileReader fr =new FileReader("C:\\Users\\akila\\git\\AutomationTest\\AutomationTest\\src\\test\\resources\\configFiles\\config.properties");
		Properties p = new Properties();
		p.load(fr);
		
	}

}
