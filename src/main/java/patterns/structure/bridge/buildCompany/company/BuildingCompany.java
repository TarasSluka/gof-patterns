package patterns.structure.bridge.buildCompany.company;

import lombok.Data;
import patterns.structure.bridge.buildCompany.wall.IWallCreator;

@Data
public class BuildingCompany {

    private IWallCreator wallCreator = null;

    public void buildRoom() {
        wallCreator.buildWallWithDoor();
        wallCreator.buildWall();
        wallCreator.buildWallWithWindow();
        wallCreator.buildWall();
        System.out.println("Room finished.");
    }

    public void buildRoof() {
        System.out.println("Roof is built.");
    }

    public void buildFoundation() {
        System.out.println("Foundation is built.");
    }

}
//    public abstract void buildRoom();
//        System.out.println("Foundation is built.");

//    public abstract void buildRoof();
//        System.out.println("Foundation is built.");

//    public abstract void buildFoundation();
//System.out.println("Foundation is built.");
