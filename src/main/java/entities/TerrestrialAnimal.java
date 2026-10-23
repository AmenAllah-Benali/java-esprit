package entities;

public class TerrestrialAnimal extends Animal {

        protected int nbrLegs;
        public TerrestrialAnimal(String family, String name, int age, boolean isMammal,int nbLegs){
            super(family,name,age,isMammal);
            this.nbrLegs=nbLegs;

        }
    public String toString(){
        return super.toString()+"nbr of legs :"+this.nbrLegs;




    }


}
