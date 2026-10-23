package entities;

public class Dolphin extends AquaticAnimal{
    protected float swimmingSpeed;
        public Dolphin(String family, String name, int age, boolean isMammal,String habit,float speed){
            super(family,name,age,isMammal,habit);
            this.swimmingSpeed=speed;

        }

        public String toString(){
return super.toString()+"swimming speed :"+this.swimmingSpeed;




        }



    public void swim() {
        System.out.println("this dolphin is swimming");
    }



    }
