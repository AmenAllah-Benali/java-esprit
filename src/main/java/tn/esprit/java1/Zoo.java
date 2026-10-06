package tn.esprit.java1;

public class Zoo {
    Animal[] animals;
    String name;
    String city;
    final int nbrCages=25;
    int nbrAnimals=0;
    public Zoo(String name,String city){

        animals=new Animal[nbrCages];
        this.name=name;
        this.city=city;



    }
public void displayzoo(){
    System.out.println("zoo:"+ name);
    System.out.println("city:"+ city);
    System.out.println("number of cages:"+ nbrCages);


}
public boolean addAnimal(Animal animal){
        if (nbrAnimals>=nbrCages){return false;}
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
    }

