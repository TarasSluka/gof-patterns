package patterns.structure.adapter;

import patterns.structure.adapter.electricSystem.Adapter;
import patterns.structure.adapter.electricSystem.ElectricityConsumer;
import patterns.structure.adapter.electricSystem.NewElectricitySystem;
import patterns.structure.adapter.electricSystem.OldElectricitySystem;

public class RunElectricSystem {
    public static void main(String[] args) {
        NewElectricitySystem newElectricitySystem = new NewElectricitySystem();
        ElectricityConsumer.chargeNotebook(newElectricitySystem);

        OldElectricitySystem oldElectricitySystem = new OldElectricitySystem();
        Adapter adapter = new Adapter(oldElectricitySystem);
        ElectricityConsumer.chargeNotebook(adapter);
    }
}
