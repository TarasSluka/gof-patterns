package patterns.structure.adapter.temperature;

public interface TemperatureInfo {
    double getTemperatureInF();

    void setTemperatureInF(double temperatureInF);

    double getTemperatureInC();

    void setTemperatureInC(double temperatureInC);
}
