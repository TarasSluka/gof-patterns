package patterns.creation.singleton;

public class RubSingleton {
    public static void main(String[] args) {
        LoggerSingleton logger;
        logger = LoggerSingleton.getLoggerSingleton();
        HardProcessor processor = new HardProcessor(1);
        logger.log("Hard work started...");
        processor.processTo(5);
        logger.log("Hard work finished...");

    }
}
