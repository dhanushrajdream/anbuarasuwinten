package Time;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class Logging4 {
	public static void main(String[] args) {
		final Logger logger = Logger.getLogger(Logging4.class);
		
		BasicConfigurator.configure();;
		logger.debug("This is a Debug Message");
		logger.info("This is an info Message");
		logger.warn("This is a Warning message");
		logger.error("This is an error Messgage");	
		logger.fatal("This is a fatal message");
		
	}

}
