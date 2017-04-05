package patterns.creation.singleton;

public class LoggerSingleton {
    private static LoggerSingleton loggerSingleton = new LoggerSingleton();
    private int count = 0;

    private LoggerSingleton() {
    }

    public static LoggerSingleton getLoggerSingleton() {
        return loggerSingleton;
    }

    public void log(String massage) {
        System.out.println(count + " " + massage);
        count++;
    }

}
