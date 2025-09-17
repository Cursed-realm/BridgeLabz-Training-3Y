package OOPS;
class Animal {
    private int age;
    private String gender;

    public Animal(int age, String gender) {
        this.age = age;
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

  
    public boolean isMammal() {
        
        
        return false;
    }


    public void mate() {
        System.out.println("The animal is looking for a mate.");
    }
}


class Duck extends Animal {
    private String beakColor = "Yellow";

    public Duck(int age, String gender, String beakColor) {
        super(age, gender);
        this.beakColor = beakColor;
    }

    public String getBeakColor() {
        return beakColor;
    }

   
    public void swim() {
        System.out.println("The duck is swimming.");
    }

    
    public void quack() {
        System.out.println("Quack! Quack!");
    }
}
class Fish extends Animal {
    private int sizeInFt;
    private boolean canEat;

    public Fish(int age, String gender, int sizeInFt, boolean canEat) {
        super(age, gender);
        this.sizeInFt = sizeInFt;
        this.canEat = canEat;
    }
    public int getSizeInFt() {
        return sizeInFt;
    }
    public boolean getCanEat() {
        return canEat;
    }
    public void swim() {
        System.out.println("The fish is swimming.");
    }
}
class Zebra extends Animal {
    private boolean isWild;

    public Zebra(int age, String gender, boolean isWild) {
        super(age, gender);
        this.isWild = isWild;
    }
    public boolean getIsWild() {
        return isWild;
    }

    @Override
    public boolean isMammal() {
        return true;
    }

    public void run() {
        System.out.println("The zebra is running.");
    }
}

public class Main {
    public static void main(String[] args) {

        Animal myAnimal = new Animal(5, "Male");
        Duck myDuck = new Duck(2, "Female", "Orange");
        Fish myFish = new Fish(1, "Male", 1, false);
        Zebra myZebra = new Zebra(4, "Female", true);

        System.out.println("--- Animal ---");
        System.out.println("Age: " + myAnimal.getAge());
        System.out.println("Gender: " + myAnimal.getGender());
        myAnimal.mate();

        System.out.println("\n--- Duck ---");
        System.out.println("Age: " + myDuck.getAge());
        System.out.println("Gender: " + myDuck.getGender());
        System.out.println("Beak Color: " + myDuck.getBeakColor());
        myDuck.swim();
        myDuck.quack();

        System.out.println("\n--- Fish ---");
        System.out.println("Age: " + myFish.getAge());
        System.out.println("Gender: " + myFish.getGender());
        System.out.println("Size: " + myFish.getSizeInFt() + " ft");
        System.out.println("Can Eat: " + myFish.getCanEat());
        myFish.swim();

        System.out.println("\n--- Zebra ---");
        System.out.println("Age: " + myZebra.getAge());
        System.out.println("Gender: " + myZebra.getGender());
        System.out.println("Is Wild: " + myZebra.getIsWild());
        System.out.println("Is Mammal: " + myZebra.isMammal());
        myZebra.run();
    }
}