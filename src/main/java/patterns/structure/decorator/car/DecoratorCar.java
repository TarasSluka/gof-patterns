package patterns.structure.decorator.car;

import lombok.Data;

@Data
public class DecoratorCar extends Car {
    private Car decoratorCar;

    public DecoratorCar(Car decoratorCar) {
        this.decoratorCar = decoratorCar;
    }

    @Override
    public void go() {
        decoratorCar.go();
    }

}
