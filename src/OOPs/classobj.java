package OOPs;

public class classobj {
    public static void main(String[] args) {
        Person p1 = new Person();       // Create an instance of Person class
        p1.name = "John";   // Set the name property
        p1.age = 30;    // Set the age property

        System.out.println("Name: " + p1.name+ ", Age: " + p1.age);

        Person p2 = new Person();
        p2.name = "Jane";
        p2.age = 25;

        System.out.println("Name: " + p2.name + ", Age: " + p2.age);

        p1.eat();  // Call the eat method on p1
        p2.walk(); // Call the walk method on p2
        p2.walk(2); // Call the overloaded walk method on p2
    }
}

class Person {
    String name;    // Instance variable for name property
    int age;    // Property for age

    void walk() {   // Behavior method for walking
        System.out.println(name + " is walking.");
    }
    void eat() {    // Behavior method for eating
        System.out.println(name + " is eating.");
    }
    void walk(int steps) { // Overloaded method for walking with steps
        System.out.println(name + " is walking " + steps + " steps.");
    }
}