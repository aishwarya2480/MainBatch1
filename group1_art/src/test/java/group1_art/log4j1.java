package group1_art;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class log4j1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Logger logger = LogManager.getLogger(log4j1.class);
		logger.error("This is the log for error msgg");

	}

}
