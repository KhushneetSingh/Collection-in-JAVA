package FunMethod;

// Encapsulation demo: shows private, default, protected, and public access modifiers
class EncapsulateDemo {
    private int privateValue; // Only accessible within this class
    int defaultValue;         // Accessible within the package (default)
    protected int protectedValue; // Accessible within package and subclasses
    public int publicValue;   // Accessible everywhere

    // Constructor to initialize all fields
    public EncapsulateDemo(int priv, int def, int prot, int pub) {
        privateValue = priv;
        defaultValue = def;
        protectedValue = prot;
        publicValue = pub;
    }

    // Getter and setter for privateValue (encapsulation in action)
    public int getPrivateValue() {
        return privateValue;
    }
    public void setPrivateValue(int priv) {
        privateValue = priv;
    }

    // Method to display all values
    public void showValues() {
        System.out.println("privateValue = " + privateValue);
        System.out.println("defaultValue = " + defaultValue);
        System.out.println("protectedValue = " + protectedValue);
        System.out.println("publicValue = " + publicValue);
    }
}

/*
 * Encapsulation is about restricting direct access to fields and providing controlled access via methods.
 * - private: only this class
 * - default: only package
 * - protected: package + subclasses
 * - public: everywhere
 * Use getter/setter for private fields!
 */

public class OOPs {
    public static void main(String[] args) {
        EncapsulateDemo obj = new EncapsulateDemo(1, 2, 3, 4);
        obj.setPrivateValue(10); // Set private value using setter
        System.out.println("Private value (via getter): " + obj.getPrivateValue());
        obj.showValues(); // Show all values
        obj.publicValue = 99; // Direct access to public field
        System.out.println("Updated publicValue: " + obj.publicValue);
        // obj.privateValue = 100; // Not allowed, private!
    }
}