package patterns.creation.builder;

public abstract class LaptopBuilder {
    protected Laptop laptop;

    public Laptop getLaptop() {
        return laptop;
    }

    private void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }

    public void createNewLaptop() {
        laptop = new Laptop();
    }

    public Laptop getMyLaptop() {
        return laptop;
    }

    public abstract void setMonitorResolution(String monitorResolution);

    public abstract void setProcessor(String processor);

    public abstract void setMemory(String memory);

    public abstract void setHDD(String hdd);

    public abstract void setBattery(String battery);
}
