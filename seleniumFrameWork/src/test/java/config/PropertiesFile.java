package config;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesFile {

	public static void main(String[] args) {
	
		getproperites();

	}

	public static void getproperites() {
		
		try {
			
			Properties prop= new Properties();
			InputStream input= new FileInputStream("C:/Users/drham/eclipse-workspace/seleniumFrameWork/src/test/java/config/config.properties");
			prop.load(input);
			String browser=prop.getProperty("browser");
			System.out.println(browser);
		}catch(Exception exp) {
			
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}
		
		
	}
	
	
	
	
}
