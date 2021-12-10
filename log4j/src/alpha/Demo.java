package alpha;
import org.apache.logging.log4j.*;


public class Demo {

	//to initialize log we need to call getlogger logmanager function and pass entire location of the class
	private static Logger log = LogManager.getLogger(Demo.class.getName());
	
	public static void main(String[] args) {
		log.debug("I am debugging");
		log.info("Info details");
		log.error("this is error");
		log.fatal("Fatal error");

	}

}




