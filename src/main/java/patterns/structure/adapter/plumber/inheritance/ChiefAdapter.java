package patterns.structure.adapter.plumber.inheritance;

import patterns.structure.adapter.plumber.Chief;
import patterns.structure.adapter.plumber.Plumber;

public class ChiefAdapter extends Plumber implements Chief {
    @Override
    public String makeBreakfast() {
        return getGasket();
    }

    @Override
    public String makeLunch() {
        return getPipe();
    }

    @Override
    public String makeDinner() {
        return getScrewNut();
    }
}
