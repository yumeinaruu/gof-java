package abstract_fabric.fabric;

import abstract_fabric.model.*;

public class MetalFurnitureFabric implements FurnitureFabric{
    @Override
    public Chair getChair() {
        return new MetalChair();
    }

    @Override
    public Sofa getSofa() {
        return new MetalSofa();
    }

    @Override
    public Table getTable() {
        return new MetalTable();
    }
}
