package patterns.structure.adapter;

import patterns.structure.adapter.temperature.TemperatureInfo;
import patterns.structure.adapter.temperature.composition.TemperatureObjectPresenter;
import patterns.structure.adapter.temperature.inheritance.TemperatureClassPresenter;

public class RunTemperature {
    public static void main(String[] args) {
        System.out.println("class adapter test");
        TemperatureInfo tempInfo = new TemperatureClassPresenter();
        testTempInfo(tempInfo);
        // object adapter
        System.out.println("\nobject adapter test");
        tempInfo = new TemperatureObjectPresenter();
        testTempInfo(tempInfo);
    }

    public static void testTempInfo(TemperatureInfo tempInfo) {
        tempInfo.setTemperatureInC(0);
        System.out.println("temp in C:" + tempInfo.getTemperatureInC());
        System.out.println("temp in F:" + tempInfo.getTemperatureInF());
        tempInfo.setTemperatureInF(85);
        System.out.println("temp in C:" + tempInfo.getTemperatureInC());
        System.out.println("temp in F:" + tempInfo.getTemperatureInF());
    }
}
