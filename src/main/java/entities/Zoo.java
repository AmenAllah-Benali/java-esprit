package entities;

import java.util.Objects;

public class Zoo {
    public Animal[] animals;
    public String name;
    public String city;
    final int nbrCages=25;
    int nbrAnimals=0;
    public Aquatic[] aquaticAnimals = new Aquatic[10];
    int nbrAquaticAnimals = 0;
    public Zoo(String name,String city){

        animals=new Animal[nbrCages];
        this.name=name;
        this.city=city;



    }
    public void setZooName(String name){
        if (Objects.equals(name, "")){System.out.println("the zoo name should not be empty");}
        else {
            this.name = name;
        }
    }
    public void setZooCity(String city){
        this.city=city;
    }
    public void setZooAnimals(Animal[] animals){
        this.animals=animals;
    }
    public String getZooName(){
        return this.name;
    }
    public String getZooCity(){
        return this.city;
    }
    public Animal[] getZooAnimals(){
        return this.animals;
    }






public void displayzoo(){
    System.out.println("zoo:"+ name);
    System.out.println("city:"+ city);
    System.out.println("number of cages:"+ nbrCages);


}
public boolean addAnimal(Animal animal){
        if (!this.isZooFull()){return false;}
        if(searchAnimal(animal)!=-1){return false;}
        animals[nbrAnimals]=animal;
        nbrAnimals++;
        return true;
    }
public int searchAnimal(Animal animal){
        for (int i=0;i<nbrAnimals;i++){
            if(animals[i].name.equals(animal.name)){return i;}
        }
        return -1;


}
public boolean removeAnimal(Animal animal){
        int index=searchAnimal(animal);
        if (index==-1){return false;}
        for (int i=index;i<nbrAnimals-1;i++){
            animals[i]=animals[i+1];
        }
        animals[nbrAnimals-1]=null;
        nbrAnimals--;
        return true;




}
    public void displayAnimals(){
       for (int i=0;i<nbrAnimals;i++){
           animals[i].displayAnimal();
           System.out.println("-----------");
        }
    }
    public boolean isZooFull() {
        if (nbrAnimals <= nbrCages) {
            return false;

        }
        return true;
    }
public Zoo compareZoo(Zoo z1,Zoo z2){
    if (z1.nbrAnimals<z2.nbrAnimals){return z2;}
    else if(z1.nbrAnimals>z2.nbrAnimals){return z1;}
    else {return null;}

    }
    public void addAquaticAnimal(Aquatic aquatic) {
        if (nbrAquaticAnimals < 10) {
            aquaticAnimals[nbrAquaticAnimals] = aquatic;
            nbrAquaticAnimals++;
        } else {
            System.out.println("The aquatic animals array is full!");
        }
    }
    public void displayAquaticAnimals() {
        for (int i = 0; i < nbrAquaticAnimals; i++) {
            aquaticAnimals[i].swim();
        }
    }
    public float maxPenguinSwimmingDepth() {
        float maxDepth = 0;

        for (int i = 0; i < nbrAquaticAnimals; i++) {
                if ((Penguin) aquaticAnimals[i].getSwimmingDepth() > maxDepth) {
                    maxDepth = (Penguin) aquaticAnimals[i].getSwimmingDepth();

            }
        }

        return maxDepth;
    }
    public void displayNumberOfAquaticAnimals() {
        int dolphinCount = 0;
        int penguinCount = 0;

        for (int i = 0; i < nbrAquaticAnimals; i++) {
            if (aquaticAnimals[i] == (Dolphin) aquaticAnimals[i]) {
                dolphinCount++;
            } else if (aquaticAnimals[i] ==(Penguin) aquaticAnimals[i]) {
                penguinCount++;
            }
        }

        System.out.println("Number of dolphins: " + dolphinCount);
        System.out.println("Number of penguins: " + penguinCount);
    }

    }

