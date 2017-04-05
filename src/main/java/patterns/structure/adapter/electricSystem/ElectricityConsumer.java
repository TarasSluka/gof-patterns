package patterns.structure.adapter.electricSystem;

public class ElectricityConsumer {

    public static void chargeNotebook(INewElectricitySystem electricitySystem) {
        System.out.println(electricitySystem.matchWideSocket());
    }
}
