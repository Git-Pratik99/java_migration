package module1;


import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;

import java.util.logging.Logger;


public class LoggingExample {

    private static final Logger logger = Logger.getLogger(LoggingExample.class.getName());

    private String message;


    public LoggingExample(String message) {

        this.message = message;

    }


    public void logInfo() {

        logger.info(message);

    }


    public void logWarning() {

        logger.warning(message);

    }


    public void logSevere() {

        logger.severe(message);

    }


    public static void main(String[] args) {

        LoggingExample example = new LoggingExample("Logging Example Message");

        example.logInfo();

        example.logWarning();

        example.logSevere();
        
        List<String> list = Arrays.asList("Java 7", "Diamond Operator");
        for (String item : list) {
            System.out.println(item);
        }

    }

}