package patterns.creation.builder;

public class RunBuilder {
    public static void main(String[] args) {
        System.out.println("RunBuilder");
        /*Trip builder*/
        System.out.println("Trip builder");
        TripLaptopBuilder tripLaptopBuilder = new TripLaptopBuilder();
        BuyLaptop shop = new BuyLaptop();
        shop.setLaptopBuilder(tripLaptopBuilder);
        shop.constructBuilder();
        Laptop laptop = shop.getLaptop();
        System.out.println(laptop.toString());

        /*Gaming builder*/
        System.out.println("Gaming builder");
        GamingLaptopBuilder gamingLaptopBuilder = new GamingLaptopBuilder();
        BuyLaptop shop2 = new BuyLaptop();
        shop2.setLaptopBuilder(gamingLaptopBuilder);
        shop2.constructBuilder();
        Laptop laptop2 = shop2.getLaptop();
        System.out.println(laptop2.toString());
    }
}
