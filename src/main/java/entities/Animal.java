package entities;

public class Animal {
    public String family;
    public String name;
    public int age;
    public boolean isMammal;

    public Animal(String family, String name, int age, boolean isMammal){
        this.family=family;
        this.name=name;
        this.age=age;
        this.isMammal=isMammal;



    }
    public String toString() {
        return "Animal{" +
                "family='" + family + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", isMammal=" + isMammal +
                '}';
    }

    public String getAnimalName(){
        return this.name;
    }
    public String getAnimalFamily(){
        return this.family;
    }
    public int getAnimalAge(){
        return this.age;
    }
    public boolean isMammal(){
        return this.isMammal;
    }
    public void setAnimalName(String name){
        this.name=name;
    }
    public void setAnimalFamily(String family){
        this.family=family;
    }
    public void setAnimalAge(int age){
        if(age<0){System.out.println("the animal age should not be negative");}
        else {this.age=age;}
    }
    public void setIsMammal(boolean isMammal){
        this.isMammal=isMammal;
    }
    public void displayAnimal(){
        System.out.println("Family:"+ family);
        System.out.println("name:"+ name);
        System.out.println("age:"+ age);
        System.out.println("is it Mammal?:"+ isMammal);
    }

}
