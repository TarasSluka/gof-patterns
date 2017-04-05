package patterns.structure.bridge;

import patterns.structure.bridge.draw.figure.Circle;
import patterns.structure.bridge.draw.drawer.LargeCircleDrawer;
import patterns.structure.bridge.draw.figure.Shape;
import patterns.structure.bridge.draw.drawer.SmallCircleDrawer;

public class RunDraw {
    public static void main(String[] args) {
        Shape[] shapes = {
                new Circle(5, 10, 10, new LargeCircleDrawer()),
                new Circle(20, 30, 100, new SmallCircleDrawer())};

        for (Shape next : shapes) {
            next.draw();
        }
    }
}
