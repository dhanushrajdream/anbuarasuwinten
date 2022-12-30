package Time;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class PropertyLog {
	
	static Logger logger=Logger.getLogger(PropertyLog.class);
	public static void main(String[] args) {
		
		PropertyConfigurator.configure("log4j.properties");
		logger.debug("This is a Debug Message");
		logger.info("This is an info Message");
		logger.warn("This is a Warning message");
		logger.error("This is an error Messgage");	
		logger.fatal("This is a fatal message");
	}

}
