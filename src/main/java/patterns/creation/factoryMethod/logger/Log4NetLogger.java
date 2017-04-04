package patterns.creation.factoryMethod.logger;

public class Log4NetLogger implements ILogger {
    public void massage(String massage) {
        System.out.println("Log4Net massage " + massage);
    }

    public void error(String massage) {
        System.out.println("Log4Net error " + massage);
    }

    public void verboseInformation(String massage) {
        System.out.println("Log4Net verboseInformation " + massage);
    }
}
