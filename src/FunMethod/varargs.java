package FunMethod;
import java.util.*;
public class varargs {
    public static void main(String[] args) {
        fun(1, 2, 3, 4, 5); // Calling with multiple arguments
        multiple(2, 4, 6 , "Khushneet", "Singh"); // Calling with mixed arguments
    }
    static void fun(int... a){
        System.out.println("Variable arguments: " + Arrays.toString(a));
    }
    static void multiple(int a, int b, int c, String... names){
        System.out.println("Integers: " + a + ", " + b + ", " + c);
        System.out.println("Strings: " + Arrays.toString(names));
    }
}