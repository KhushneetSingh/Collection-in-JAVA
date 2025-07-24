package FunMethod;
// Demonstrates variable scope in Java
public class scope {
    static int x = 10; // Class variable
    public static void main(String[] args) {
        // Declare and initialize variables a and b
        int a = 10;
        int b = 20;
        
        // Start of a new block scope
        {
            // Modify variables a and b within the block
            a = 100;
            b = 899;
            System.out.println("Inside block: a = " + a + ", b = " + b);
        }
        // Variables a and b retain their modified values after the block
        System.out.println("Before block: a = " + a + ", b = " + b);

        System.out.println("Value of x = " + x); // Accessing class variable x
        int x = 5; // Local variable, shadows class variable x
        System.out.println("Local x = " + x); // Prints the local variable x overriding the class variable
    }

    // Method to demonstrate local variable scope
    static void random(int marks){
        int num = 67; // Local variable, only accessible within this method
        System.out.println("Random number = " + num);
        System.out.println("Marks = " + marks);

    }
}