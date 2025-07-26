package OOPs;

public class classobj {
    public static void main(String[] args) {
        Person john = new Person();       // Create an instance of Person class
        john.setName("John");   // Set the name property using setter
        john.age = 30;    // Set the age property

        System.out.println("Name: " + john.getName() + ", Age: " + john.age); // Get the name using getter

        Person khushneet = new Person(22, "Khushneet Singh Sardar");   // Parameterized constructor creates another instance
        System.out.println("Name: " + khushneet.getName() + ", Age: " + khushneet.age);

        Person singh = new Person("Singh", 25);
        System.out.println("Name: " + singh.getName() + ", Age: " + singh.age);

        Developer devAlice = new Developer(28, "Alice"); // Create an instance of Developer class with parameters
        Developer devBob = new Developer("Bob", 30); // Create another instance of Developer class with parameters
        Developer devDefault = new Developer(); // Create an instance of Developer class using default constructor

        System.out.println("Name: " + devAlice.getName() + ", Age: " + devAlice.age);
        System.out.println("Name: " + devBob.getName() + ", Age: " + devBob.age);
        System.out.println("Name: " + devDefault.getName() + ", Age: " + devDefault.age);

        john.eat();  // Call the eat method on john
        khushneet.walk(); // Call the walk method on khushneet
        khushneet.walk(2); // Call the overloaded walk method on khushneet
        singh.walk(5); // Call the overloaded walk method on singh

        john.dowork(); // Person working
        devAlice.dowork(); // Developer working

        System.out.println("Total persons created: " + Person.count); // Access static variable count
    }
}

// Developer class inherits Person, represents a specialized type of Person
class Developer extends Person {
    public Developer() {
        super(); // Call the default constructor of Person
        System.out.println("A new developer has been created.");
    }
    public Developer(int newAge, String newName) {
        super(newAge, newName); // Call the parameterized constructor of Person
        System.out.println("A new developer has been created with name: " + newName + " and age: " + newAge);
    }
    public Developer(String name, int age) {
        super(name, age); // Call the constructor of Person with parameters
        System.out.println("A new developer has been created with name: " + name + " and age: " + age);
    }

    @Override
    void dowork() { // Overriding the dowork method from Person class
        System.out.println("Developer is coding.");
    }
}

// Person class with properties and behaviors
class Person {
    private String name;    // Encapsulated: private property for name
    public int age;         // Public property for age (for demo)

    static int count = 0; // Static variable means it is property of the class, not instance do not need to create object to access it

    public Person() {   // Default constructor
        name = "Unknown";
        age = 0;
        count++;
        System.out.println("A new person has been created.");
    }

    public Person(int newAge, String newName){
        name = newName; // Constructor with parameters to initialize name and age
        age = newAge;
        count++;
        System.out.println("A new person has been created with name: " + name + " and age: " + age);
    }

    public Person(String name, int age) {
        this.name = name; // Use 'this' to refer to the instance variable
        this.age = age;   // Initialize the instance variables
        count++; // Increment the static count variable
        System.out.println("A new person has been created with name: " + name + " and age: " + age);
    }

    // Encapsulation: getter and setter for name
    public String getName() {
        return name;
    }
    public void setName(String n) {
        name = n;
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
    void dowork() {
        System.out.println("Person is working.");
    }
}
/*
 * This is also a example of a polymorphism concept in OOPs, where the method walk is overloaded.
 * The same method name is used with different parameters.
 * Also, method overriding is shown with dowork() in Developer.
 * Static variable count tracks total persons created.
 * Encapsulation: name is private, use getName/setName to access it.
*/