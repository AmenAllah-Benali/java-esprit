package entities;

public abstract class AquaticAnimal extends Animal{
    protected  String habitat;
    public AquaticAnimal(String family, String name, int age, boolean isMammal,String habit){
        super(family,name,age,isMammal);
        this.habitat=habit;

        }
    public String toString(){
        return super.toString()+"habitat :"+this.habitat;




    }



    public abstract void swim();

}
