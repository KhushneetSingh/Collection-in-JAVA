import java.util.*;

// This class demonstrates passing strings to methods and how Java handles string immutability.
public class function {
    public static void main(String[] args) {
        // Declare and initialize a string variable
        String chacha = "Iron man";
        // Call greet method with chacha
        greet(chacha);
        // Print the value of chacha after method call
        System.out.println("chacha = " + chacha);

        // Declare and initialize another string variable
        String mae = "Khushneet";
        // Call great method with mae
        great(mae);
        // Print the value of mae after method call
        System.out.println("mae = " + mae);
    }

    // Method to greet a person by name
    static void greet(String name) {
        System.out.println("Hello, " + name + "!");
    }

    // Method to demonstrate that changing the parameter does not affect the original variable
    static void great(String naam){
        // Assign a new value to the parameter
        naam = "Singh";
        System.out.println("Hello, " + naam + "!");
    }
}