import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogbackSampleLogger {

    public static final Logger logger = LoggerFactory.getLogger(LogbackSampleLogger.class);

    public static void main(String[] args) throws InterruptedException {

        for (int i = 0; i < 10; i++) {

            logger.info("Logging basic message");

            final String someDetailMessage = "some message";
            logger.debug("Logging message with param: {}", someDetailMessage);

            final RuntimeException exception = new RuntimeException("Exception message");
            logger.error("Logging message with param {} and exception", someDetailMessage, exception);
            Thread.sleep(5000);
        }

    }
}
