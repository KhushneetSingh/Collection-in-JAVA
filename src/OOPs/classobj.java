package OOPs;

public class classobj {
    public static void main(String[] args) {
        Person p1 = new Person();       // Create an instance of Person class
        p1.name = "John";   // Set the name property
        p1.age = 30;    // Set the age property

        System.out.println("Name: " + p1.name+ ", Age: " + p1.age);

        Person p2 = new Person(22, "Khushneet Singh Sardar");   // Default constructor creates another instance
        p2.name = "Jane";
        p2.age = 25;

        System.out.println("Name: " + p2.name + ", Age: " + p2.age);

        Person p3 = new Person("Singh", 25);
        p3.name = "Singh";
        p3.age = 25;

        p1.eat();  // Call the eat method on p1
        p2.walk(); // Call the walk method on p2
        p2.walk(2); // Call the overloaded walk method on p2
        p3.walk(5); // Call the overloaded walk method on p3
        System.out.println("Total persons created: " + Person.count); // Access static variable count
    }
}

class Person {
    String name;    // Instance variable for name property
    int age;    // Property for age

    static int count = 0; // Static variable means it is property of the class, not instance do not need to create object to access it
    public Person() {   // Default constructor
        count++;
        System.out.println("A new person has been created.");
    }

    public Person(int newAge, String newName){
        this(); // Call the constructor that is of the same class
        name = newName; // Constructor with parameters to initialize name and age
        age = newAge;
    }

    public Person(String name, int age) {
        this.name = name; // Use 'this' to refer to the instance variable
        this.age = age;   // Initialize the instance variables
        count++; // Increment the static count variable
        System.out.println("A new person has been created with name: " + name + " and age: " + age);
    }

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
/*
 * This is also a example of a polymorphism concept in OOPs, where the method walk is overloaded.
 * The same method name is used with different parameters.
*/