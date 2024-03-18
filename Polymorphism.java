class Animal {
    String makeSound() {
        return "Animal sounds";
    }
}

class Dog extends Animal {
    String makeSound() {
        return "Dog barks";
    }
}

class Cat extends Animal {
    String makeSound() {
        return "Cat meows";
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal dog = new Dog();
        Animal cat = new Cat();
        System.out.println(animal.makeSound());
        System.out.println(dog.makeSound());
        System.out.println(cat.makeSound());
    }
}
