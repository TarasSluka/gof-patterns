package patterns.creation.factoryMethod.logger;

public class EnterpriseLogger implements ILogger {
    public void massage(String massage) {
        System.out.println("EnterpriseLogger massage " + massage);
    }

    public void error(String massage) {
        System.out.println("EnterpriseLogger error " + massage);
    }

    public void verboseInformation(String massage) {
        System.out.println("EnterpriseLogger verboseInformation " + massage);
    }
}
