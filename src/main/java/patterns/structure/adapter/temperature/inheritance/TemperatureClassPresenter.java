package patterns.structure.adapter.temperature.inheritance;

import patterns.structure.adapter.temperature.CelsiusPresenter;
import patterns.structure.adapter.temperature.TemperatureInfo;

public class TemperatureClassPresenter extends CelsiusPresenter implements TemperatureInfo {
    @Override
    public double getTemperatureInF() {
        return cToF(getTemperature());
    }

    @Override
    public void setTemperatureInF(double temperatureInF) {
        setTemperature(fToC(temperatureInF));
    }

    @Override
    public double getTemperatureInC() {
        return getTemperature();
    }

    @Override
    public void setTemperatureInC(double temperatureInC) {
        setTemperature(temperatureInC);
    }

    private double fToC(double f) {
        return ((f - 32) * 5 / 9);
    }

    private double cToF(double c) {
        return ((c * 9 / 5) + 32);
    }
}
