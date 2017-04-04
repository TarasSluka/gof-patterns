package patterns.creation.builder;

public class BuyLaptop {
    private LaptopBuilder laptopBuilder;

    public Laptop getLaptop() {
        return laptopBuilder.getMyLaptop();
    }

    public void setLaptopBuilder(LaptopBuilder laptopBuilder) {
        this.laptopBuilder = laptopBuilder;
    }


    public void constructBuilder(String monitorResolution, String processor, String memory, String hdd, String battery) {
        laptopBuilder.createNewLaptop();
        laptopBuilder.setMonitorResolution(monitorResolution);
        laptopBuilder.setProcessor(processor);
        laptopBuilder.setMemory(memory);
        laptopBuilder.setHDD(hdd);
        laptopBuilder.setBattery(battery);
    }
}
