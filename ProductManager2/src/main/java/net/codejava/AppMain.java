package net.codejava;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@SpringBootApplication
public class AppMain {
	private static final Logger logger = LogManager.getLogger(AppMain.class);
	public static void main(String[] args) {
		SpringApplication.run(AppMain.class, args);
		System.out.println("runn");
	      logger.info("This is an info message");
	        logger.error("This is an error message");
	        
	       
	}
}

