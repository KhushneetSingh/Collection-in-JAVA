package FunMethod;

// Demonstrates method overloading in Java, including use of varargs
public class overloading {
    public static void main(String[] args) {
        // Call overloaded methods with different arguments
        greet();
        greet("Alice");
        greet("Bob", 25);
        greet("Charlie", "David", "Eve"); // Using varargs
    }

    // Overloaded method 1: No parameters
    static void greet() {
        System.out.println("Hello!");
    }

    // Overloaded method 2: One String parameter
    static void greet(String name) {
        System.out.println("Hello, " + name + "!");
    }

    // Overloaded method 3: String and int parameters
    static void greet(String name, int age) {
        System.out.println("Hello, " + name + "! You are " + age + " years old.");
    }

    // Overloaded method 4: Varargs - accepts multiple String arguments
    static void greet(String... names) {
        System.out.print("Hello");
        for (String name : names) {
            System.out.print(", " + name);
        }
        System.out.println("!");
    }
}