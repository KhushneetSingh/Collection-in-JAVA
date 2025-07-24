import java.util.*;

public class function {
    public static void main(String[] args) {
        int ans = sum();  // Call the sum function
        System.out.println("The sum is: " + ans);
        // sub(45, 45);  // Call the sub function, but we don't do anything with the result
        System.out.println("The answer from sb finction : "+sub(34,45));
    }
    static int sum(){   //Can't be void, must return an int
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers to sum:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int result = a + b;
        // System.out.println("The sum is: " + result);
        return result;  // Return the result instead of printing it and it will end the function

        // System.out.println("This line will never be executed");  // This line is unreachable
    }
    static int sub(int a, int b) {
        return a - b;  // Example of another function that could be added
    }
}