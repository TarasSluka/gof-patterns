package patterns.creation.builder;

public class GamingLaptopBuilder extends LaptopBuilder {
    @Override
    public void setMonitorResolution() {
        laptop.setMonitorResolution("Gaming monitorResolution");
    }

    @Override
    public void setProcessor() {
        laptop.setProcessor("Gaming processor");
    }

    @Override
    public void setMemory() {
        laptop.setMemory("Gaming memory");
    }

    @Override
    public void setHDD() {
        laptop.setHdd("Gaming hdd");
    }

    @Override
    public void setBattery() {
        laptop.setBattery("Gaming battery");
    }
}
