package patterns.creation.singleton;

public class LoggerSingleton {
    private static LoggerSingleton loggerSingleton = null;
    private int count = 0;

    private LoggerSingleton() {
    }

    public static LoggerSingleton getLoggerSingleton() {
        if (loggerSingleton == null)
            loggerSingleton = new LoggerSingleton();
        return loggerSingleton;
    }

    public void log(String massage) {
        System.out.println(count + " " + massage);
        count++;
    }

}
