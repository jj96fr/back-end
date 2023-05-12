package pkg_lib;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Mian {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Logger log = LoggerFactory.getLogger(Mian.class);
		
		log.info("Test Logger!!!");
		log.error("Test Error!!!");
		log.warn("Teest Warning!");
		log.debug("Test Debug");
	}

}
