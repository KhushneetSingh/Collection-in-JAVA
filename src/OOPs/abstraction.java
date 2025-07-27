package OOPs;

// This example demonstrates abstraction in Java using abstract classes and methods.
public class abstraction {
    public static void main(String[] args) {
        // You cannot create an object of abstract class Car directly.
        // Car C1 = new car(); // Not allowed

        Audi a1 = new Audi(); // Create an object of Audi, which extends Car
        a1.Start(); // Calls the overridden Start method of Audi
    }
}

// Audi class extends Car and provides implementation for abstract method Start
class Audi extends Car{
    @Override
    void Start(){
        System.out.println("Audi is starting with a roar!");
    }
}

// BMW class extends Car and provides its own implementation for Start
class BMW extends Car{
    @Override
    void Start(){
        System.out.println("BMW is starting with a smooth purr!");
    }
}

// Abstract class Car defines a blueprint for all cars
abstract class Car{
    int price; // Property for price
    abstract void Start(); // Abstract method, must be implemented by subclasses
}

/*
 * Explanation:
 * - The abstract class Car cannot be instantiated directly.
 * - It contains an abstract method Start(), which means any subclass must provide its own implementation.
 * - Audi and BMW are concrete subclasses that implement the Start() method differently.
 * - This is abstraction: you define what a car can do (Start), but leave the details to the specific car types.
 * - In main, you create an Audi and call its Start method, which prints a message specific to Audi.
 */