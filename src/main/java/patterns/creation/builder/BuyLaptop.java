package patterns.creation.builder;

public class BuyLaptop {
    private LaptopBuilder laptopBuilder;

    public Laptop getLaptop() {
        return laptopBuilder.getLaptop();
    }

    public void setLaptopBuilder(LaptopBuilder laptopBuilder) {
        this.laptopBuilder = laptopBuilder;
    }


    public void constructBuilder() {
        laptopBuilder.createNewLaptop();
        laptopBuilder.setMonitorResolution();
        laptopBuilder.setProcessor();
        laptopBuilder.setMemory();
        laptopBuilder.setHDD();
        laptopBuilder.setBattery();
    }
}
