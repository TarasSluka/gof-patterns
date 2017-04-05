package patterns.structure.decorator;

import patterns.structure.decorator.car.AmbulanceCar;
import patterns.structure.decorator.car.Car;
import patterns.structure.decorator.car.Mercedes;

public class RunCar {

    public static void main(String[] args) {
        Car doctorCar = new AmbulanceCar(new Mercedes());
        doctorCar.go();
    }
}
