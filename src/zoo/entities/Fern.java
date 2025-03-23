package zoo.entities;

import zoo.interfaces.SwayInWind;

public class Fern extends Plant implements SwayInWind {
    private String waterRequirement;

    public Fern(String name, String waterRequirement) {
        super(name);
        this.waterRequirement = waterRequirement;
    }

    public Fern() {
        this("Unnamed Fern", "Unknown");
    }

    @Override
    public void interact() {
        System.out.println("The fern looks very green.");
    }

    @Override
    public void sway() {
        System.out.println("The fern sways gently in the breeze.");
    }

    public void grow(){
        System.out.println("The fern grew!");        
    }

    public void grow(int amount){
        System.out.println("The fern grew by" + amount + "cm!");        
    }

    protected void setWaterRequirement(String requirement) {
        this.waterRequirement = requirement;
    }
}
