package patterns.structure.bridge;

import patterns.structure.bridge.buildCompany.company.BuildingCompany;
import patterns.structure.bridge.buildCompany.wall.BrickWallCreator;
import patterns.structure.bridge.buildCompany.wall.ConcreteSluWallCreator;
import patterns.structure.bridge.buildCompany.wall.IWallCreator;

public class RunBuildCompany {
    public static void main(String[] args) {

        IWallCreator brickWallCreator = new BrickWallCreator();
        IWallCreator concreteSluWallCreator = new ConcreteSluWallCreator();
        BuildingCompany company = new BuildingCompany();
        company.buildFoundation();
        company.setWallCreator(brickWallCreator);
        company.getWallCreator().buildWallWithWindow();

        company.buildRoom();

        company.buildRoof();

    }
}
