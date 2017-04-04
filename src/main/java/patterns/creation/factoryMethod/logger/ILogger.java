package patterns.creation.factoryMethod.logger;

public interface ILogger {
    void massage(String massage);

    void error(String massage);

    void verboseInformation(String massage);

}
