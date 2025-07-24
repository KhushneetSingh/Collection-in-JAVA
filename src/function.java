import java.util.*;

public class function {
    public static void main(String[] args) {
        sum();
    }
    static void sum(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers to sum:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int result = a + b;
        System.out.println("The sum is: " + result);
    }
}