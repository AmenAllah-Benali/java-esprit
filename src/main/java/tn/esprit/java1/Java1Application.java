package tn.esprit.java1;
public class Java1Application {

    public static void main(String[] args) {


        Animal lion=new Animal("lions","Lion",5,true);
        Animal tiger=new Animal("tigers","tiger",4,true);
        Animal elephant=new Animal("Elephants","Elephant",10,true);
        Zoo myZoo=new Zoo("myzoo","Tunis");


        System.out.println(myZoo);


        System.out.println(myZoo.addAnimal(lion));
        System.out.println(myZoo.addAnimal(tiger));

        System.out.println(myZoo.addAnimal(elephant));


        myZoo.displayAnimals();


        System.out.println("Index: " + myZoo.searchAnimal(lion));


        Animal lion2 = new Animal("lions", "Lion", 5, true);

        System.out.println("Index: " + myZoo.searchAnimal(lion2));


        System.out.println(myZoo.addAnimal(lion2));

        System.out.println(myZoo.removeAnimal(lion));
        myZoo.displayAnimals();


    }

}
