// Parent class
class Animal {
    public void makeSound() {
        System.out.println("Some generic animal sound...");
    }
}

// Child class: Dog
class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Dog says: Woof Woof!");
    }
}

// Child class: Cat
class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Cat says: Meow Meow!");
    }
}

// Main class
public class AnimalSoundSystem {
    public static void main(String[] args) {
        // Polymorphism: Parent reference pointing to child objects
        Animal animal1 = new Dog();
        Animal animal2 = new Cat();

        // Method calls
        animal1.makeSound();
        animal2.makeSound();
    }
}
