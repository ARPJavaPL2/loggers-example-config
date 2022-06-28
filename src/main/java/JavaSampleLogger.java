import java.util.logging.ConsoleHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class JavaSampleLogger {

    public static final Logger LOGGER = Logger.getLogger(JavaSampleLogger.class.getName());

    public static void main(String[] args) {


        Handler handlerObj = new ConsoleHandler();
        handlerObj.setLevel(Level.ALL);
        LOGGER.addHandler(handlerObj);
        LOGGER.setLevel(Level.ALL);

        LOGGER.severe("Log this message");
        LOGGER.warning("Log this message");
        LOGGER.info("Log this message");
        LOGGER.config("Log this message");
        LOGGER.fine("Log this message ");
        LOGGER.finer("Log this message");
        LOGGER.finest("Log this message");
    }

}
