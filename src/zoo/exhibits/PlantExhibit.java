package zoo.exhibits;

import zoo.entities.*;

public class PlantExhibit extends Exhibit {

    protected boolean isIndoor;

    public PlantExhibit(String name, int capacity) {
        super(name, capacity);
        this.isIndoor = true;
    }

    public PlantExhibit() {
        super();
    }

    @Override
    public void displayDetails() {
        System.out.println("Plant Exhibit: " + entities.size() + " plants.");
    }

    protected void setIndoor(boolean indoor) {
        this.isIndoor = indoor;
    }
}
