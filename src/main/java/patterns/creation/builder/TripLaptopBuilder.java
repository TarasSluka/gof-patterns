package patterns.creation.builder;

public class TripLaptopBuilder extends LaptopBuilder {
    @Override
    public void setMonitorResolution() {
        laptop.setMonitorResolution("Trip monitorResolution");
    }

    @Override
    public void setProcessor() {
        laptop.setProcessor("Trip processor");
    }

    @Override
    public void setMemory() {
        laptop.setMemory("Trip memory");
    }

    @Override
    public void setHDD() {
        laptop.setHdd("Trip hdd");
    }

    @Override
    public void setBattery() {
        laptop.setBattery("Trip battery");
    }
}
