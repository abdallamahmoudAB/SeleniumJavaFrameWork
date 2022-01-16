package demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4jDemo {
	
	static Logger logger = LogManager.getFormatterLogger(Log4jDemo.class);

	public static void main(String[] args) {
		
		System.out.println("\n   Hello world....!\n");
		
		logger.trace("this is trace message");
		logger.info("this is an information message");
		logger.error("this is an errod message");
		logger.warn("this is a warning message");
		logger.fatal("this is a fatal message");
		
		System.out.println("\n    completed ");
		
	}

}
