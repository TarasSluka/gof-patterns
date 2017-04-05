package patterns.structure.bridge.draw.figure;

import lombok.Data;
import patterns.structure.bridge.draw.drawer.Drawer;

@Data
public class Circle extends Shape {
    private int x;

    private int y;

    private int radius;

    public Circle(int x, int y, int radius, Drawer drawer) {
        super(drawer);
        setX(x);
        setY(y);
        setRadius(radius);
    }

    @Override
    public void draw() {
        drawer.drawCircle(x, y, radius);
    }

    @Override
    public void enlargeRadius(int multiplier) {
        radius *= multiplier;
    }
}
