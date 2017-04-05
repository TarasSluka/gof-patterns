package patterns.structure.bridge.buildCompany.wall;

public class ConcreteSluWallCreator implements IWallCreator {
    @Override
    public void buildWallWithDoor() {
        System.out.println("ConcreteSluWallCreator  buildWallWithDoor");
    }

    @Override
    public void buildWallWithWindow() {
        System.out.println("ConcreteSluWallCreator  buildWallWithWindow");
    }

    @Override
    public void buildWall() {
        System.out.println("ConcreteSluWallCreator  buildWall");
    }
}
