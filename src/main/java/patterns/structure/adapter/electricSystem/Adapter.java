package patterns.structure.adapter.electricSystem;

public class Adapter implements INewElectricitySystem {

    private OldElectricitySystem electricitySystem;

    public Adapter(OldElectricitySystem electricitySystem) {
        this.electricitySystem = electricitySystem;
    }

    @Override
    public String matchWideSocket() {
        return electricitySystem.matchThinSocket();
    }
}
