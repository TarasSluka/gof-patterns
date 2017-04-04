package patterns.creation.singleton;

public class HardProcessor {
    private int start;

    public HardProcessor(int start) {
        this.start = start;
        LoggerSingleton.getLoggerSingleton().log("Processor just created.");
    }

    public int processTo(int end) {
        int sum = 0;
        for (int i = start; i < end; ++i) {
            sum += i;
        }
        LoggerSingleton.getLoggerSingleton().log("Processor just calculated some value: " + sum);
        return sum;
    }
}
