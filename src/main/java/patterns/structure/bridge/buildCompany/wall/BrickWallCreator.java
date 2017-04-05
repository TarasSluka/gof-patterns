package patterns.structure.bridge.buildCompany.wall;

public class BrickWallCreator implements IWallCreator {

    @Override
    public void buildWallWithDoor() {
        System.out.println("Brick wall with door.");
    }

    @Override
    public void buildWallWithWindow() {
        System.out.println("Brick wall with window.");
    }

    @Override
    public void buildWall() {
        System.out.println("Brick wall.");
    }
}
