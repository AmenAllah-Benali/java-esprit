package entities;

public class Penguin extends AquaticAnimal{
    protected float swimmingDepth;
    public Penguin(String family, String name, int age, boolean isMammal,String habit,float depth){
        super(family,name,age,isMammal,habit);
        this.swimmingDepth=depth;

    }


    public String toString(){
        return super.toString()+"swimming depth:"+this.swimmingDepth;




    }



}
