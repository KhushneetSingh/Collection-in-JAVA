import java.util.*;

public class function {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number 1: ");
        int num1 = sc.nextInt();

        System.out.println("Enter number 2: ");
        int num2 = sc.nextInt();
        
        int sum2 = num1 + num2;
        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum2);
    }
}