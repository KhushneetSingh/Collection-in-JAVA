package OOPs;

// This class implements two interfaces: Car and Person.
// Demonstrates how a class can inherit behavior from multiple sources using interfaces.
public class IInterfaces implements Car, Person{
    public static void main(String[] args) {
        // You can create an object and call interface methods
        IInterfaces obj = new IInterfaces();
        obj.start();
        obj.stop();
        obj.eat();
        obj.sleep();
    }

    // Implementation of Car interface method
    @Override
    public void start() {
        System.out.println("Car is starting");
    }

    // Implementation of Person interface method
    @Override
    public void eat() {
        System.out.println("Person is eating");
    }

    // Implementation of Person interface method
    @Override
    public void sleep() {
        System.out.println("Person is sleeping");
    }

    // Implementation of Car interface method
    @Override
    public void stop() {
        System.out.println("Unimplemented method 'stop'");
    }
}

// Car interface defines what a car can do
interface Car {
    public abstract void start();   // By default, methods in interfaces are public and abstract
    void stop();
}

// Person interface defines behaviors for a person
interface Person {
    void eat();
    void sleep();
}

/*
 * Explanation:
 * - Interfaces define a contract: what methods a class must implement, but not how.
 * - A class can implement multiple interfaces (multiple inheritance of type).
 * - All methods in interfaces are abstract by default (no body).
 * - In contrast, abstraction using abstract classes allows you to provide some implementation and state.
 * - Abstract classes can have constructors, fields, and non-abstract methods.
 * - Interfaces cannot have constructors or fields (except static final constants).
 * - Use interfaces when you want to specify capabilities that can be shared across unrelated classes.
 * - Use abstract classes when you want to share code and state among related classes.
 */