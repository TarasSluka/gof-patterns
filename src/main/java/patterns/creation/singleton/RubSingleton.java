package patterns.creation.singleton;

public class RubSingleton {
    public static void main(String[] args) {
        LoggerSingleton loggerSingleton;
        for (int i = 0; i < 10; i++) {
            loggerSingleton = LoggerSingleton.getLoggerSingleton();
            loggerSingleton.log("" + String.valueOf(i));
        }

    }
}
