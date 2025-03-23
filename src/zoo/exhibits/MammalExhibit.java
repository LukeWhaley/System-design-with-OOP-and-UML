package zoo.exhibits;

import zoo.entities.*;

public class MammalExhibit extends Exhibit {

    protected String specialFeature;

    public MammalExhibit(String name, int capacity) {
        super(name, capacity);
        this.specialFeature = "none";
    }

    public MammalExhibit() {
        super();
    }

    @Override
    public void displayDetails() {
        System.out.println("Mammal Exhibit: " + entities.size() + " animals.");
    }

    protected void setSpecialFeature(String feature) {
        this.specialFeature = feature;
    }
}