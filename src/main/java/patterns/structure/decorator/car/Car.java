package patterns.structure.decorator.car;

import lombok.Data;

@Data
public class Car {
    private String brandName;

    public void go() {
        System.out.println("I'm " + brandName + " and I'm on my way...");
    }

}
