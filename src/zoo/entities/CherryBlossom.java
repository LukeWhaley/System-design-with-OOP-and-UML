package zoo.entities;

import zoo.interfaces.SwayInWind;

public class CherryBlossom extends Plant implements SwayInWind {
    private String waterRequirement;

    public CherryBlossom(String name, String waterRequirement) {
        super(name);
        this.waterRequirement = waterRequirement;
    }

    public CherryBlossom() {
        this("Unnamed CherryBlossom", "Unknown");
    }

    @Override
    public void interact() {
        System.out.println("The cherry blossom is blooming!");
    }

    @Override
    public void sway() {
        System.out.println("The cherry blossom sways gently in the breeze.");
    }

    public void grow(){
        System.out.println("The cherry blossom grew!");        
    }

    public void grow(int amount){
        System.out.println("The cherry blossom grew by" + amount + "cm!");        
    }

    protected void setWaterRequirement(String requirement) {
        this.waterRequirement = requirement;
    }
}
