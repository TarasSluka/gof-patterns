package patterns.structure.decorator.car;

public class AmbulanceCar extends DecoratorCar {
    public AmbulanceCar(Car decoratorCar) {
        super(decoratorCar);
    }

    @Override
    public void go() {
        super.go();
        System.out.println("..........beeb-beeb-beeb-beeb-..........");
    }
}
