package zoo.main;

import zoo.exhibits.*;
import zoo.entities.*;
import zoo.interfaces.*;

public class ZooSimulation {
    public static void main(String[] args) {
        Exhibit mammalExhibit = new MammalExhibit("Savannah Zone", 20);
        Exhibit plantExhibit = new PlantExhibit("Tropical Garden", 15);

        Animal lion = new Lion("Leo", 5, "male");
        Animal giraffe = new Giraffe("Kaku", 6, "male");

        Plant fern = new Fern("Green Gus", "Moist");
        Plant orchid = new Fern("Lillie", "Medium");
        Plant cherryblossom = new Fern("Sakura", "Moist");


        mammalExhibit.addEntity(lion);
        mammalExhibit.addEntity(giraffe);

        plantExhibit.addEntity(fern);
        plantExhibit.addEntity(orchid);
        plantExhibit.addEntity(cherryblossom);

        mammalExhibit.displayDetails();
        plantExhibit.displayDetails();

        System.out.println("Total exhibits: " + Exhibit.getTotalExhibits());
    }
}
