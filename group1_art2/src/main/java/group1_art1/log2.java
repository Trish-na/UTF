package group1_art1;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class log2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Logger logger = LogManager.getLogger(log2.class);
		logger.error("This is log for error message");
	}

}
