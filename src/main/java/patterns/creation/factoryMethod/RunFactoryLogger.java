package patterns.creation.factoryMethod;

import patterns.creation.factoryMethod.logger.ILogger;
import patterns.creation.factoryMethod.logger.LoggerProviderFactory;
import patterns.creation.factoryMethod.logger.LoggingProviders;

public class RunFactoryLogger {

    public static void main(String[] args) {
        LoggingProviders providerType = LoggingProviders.Enterprise;
        ILogger logger1 = LoggerProviderFactory.getLoggingProvider(providerType);
        logger1.massage("suka");
    }
}
