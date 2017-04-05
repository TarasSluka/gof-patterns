package patterns.structure.adapter.electricSystem;

public class NewElectricitySystem implements INewElectricitySystem {
    @Override
    public String matchWideSocket() {
        return "220V";
    }
}

