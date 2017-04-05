package patterns.structure.adapter.temperature.composition;

import patterns.structure.adapter.temperature.CelsiusPresenter;
import patterns.structure.adapter.temperature.TemperatureInfo;

public class TemperatureObjectPresenter implements TemperatureInfo {
    CelsiusPresenter celsiusPresenter;

    public TemperatureObjectPresenter() {
        this.celsiusPresenter = new CelsiusPresenter();
    }

    @Override
    public double getTemperatureInF() {
        return cToF(celsiusPresenter.getTemperature());
    }

    @Override
    public void setTemperatureInF(double temperatureInF) {
        celsiusPresenter.setTemperature(fToC(temperatureInF));
    }

    @Override
    public double getTemperatureInC() {
        return celsiusPresenter.getTemperature();
    }

    @Override
    public void setTemperatureInC(double temperatureInC) {
        celsiusPresenter.setTemperature(temperatureInC);
    }

    private double fToC(double f) {
        return ((f - 32) * 5 / 9);
    }

    private double cToF(double c) {
        return ((c * 9 / 5) + 32);
    }
}
