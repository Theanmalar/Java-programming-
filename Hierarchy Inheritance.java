// Hierarchy 
class Animal {
    
    public void sound(String manner) {
        System.out.println("I love Animals!");
        System.out.println("Sounds of Animals " + manner  );
    }
}

// Dog class inherits from Animal
class Dog extends Animal {
    // Overriding the sound method in Animal
    public void sound(String manner) {
        System.out.println("The dog barks " + manner + ".");
    }
}

// Cat class inherits from Animal
class Cat extends Animal{ 
    // override the sound method
    public void sound(String manner) {
        System.out.println("The cat meows " + manner + ".");
    }
}
public class Main {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        Animal myDog = new Dog();
        Animal myCat = new Cat();
        myAnimal.sound("in their life ");
        myDog.sound("loudly");
        myCat.sound("softly");
    }
}
