package patterns.creation.builder;

public class GamingLaptopBuilder extends LaptopBuilder {
    @Override
    public void setMonitorResolution(String monitorResolution) {
        laptop.setMonitorResolution("Gaming " + monitorResolution);
    }

    @Override
    public void setProcessor(String processor) {
        laptop.setProcessor("Gaming " + processor);
    }

    @Override
    public void setMemory(String memory) {
        laptop.setMemory("Gaming " + memory);
    }

    @Override
    public void setHDD(String hdd) {
        laptop.setHdd("Gaming " + hdd);
    }

    @Override
    public void setBattery(String battery) {
        laptop.setBattery("Gaming " + battery);
    }
}
