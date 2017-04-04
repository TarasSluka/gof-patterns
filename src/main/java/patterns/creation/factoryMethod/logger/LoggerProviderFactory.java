package patterns.creation.factoryMethod.logger;

public class LoggerProviderFactory {
    public static ILogger getLoggingProvider(LoggingProviders providers) {
        switch (providers) {
            case Log4Net:
                return new Log4NetLogger();
            case Enterprise:
                return new EnterpriseLogger();
            default:
                return new EnterpriseLogger();
        }
    }
}
