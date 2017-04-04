package patterns.creation.builder;

public class TripLaptopBuilder extends LaptopBuilder {
    @Override
    public void setMonitorResolution(String monitorResolution) {
        laptop.setMonitorResolution("Trip " + monitorResolution);
    }

    @Override
    public void setProcessor(String processor) {
        laptop.setProcessor("Trip " + processor);
    }

    @Override
    public void setMemory(String memory) {
        laptop.setMemory("Trip" + memory);
    }

    @Override
    public void setHDD(String hdd) {
        laptop.setHdd("Trip " + hdd);
    }

    @Override
    public void setBattery(String battery) {
        laptop.setBattery("Trip " + battery);
    }
}
