package abstract_fabric.fabric;

import abstract_fabric.model.*;

public class WoodFurnitureFabric implements FurnitureFabric{
    @Override
    public Chair getChair() {
        return new WoodChair();
    }

    @Override
    public Sofa getSofa() {
        return new WoodSofa();
    }

    @Override
    public Table getTable() {
        return new WoodTable();
    }
}
