package day2;

class Parent {
    void parentMethod() {
        System.out.println("This is the parent method.");
    }
}

class Child extends Parent {
    void childMethod() {
        System.out.println("This is the child method.");
    }
}

public class casting {
    public static void main(String[] args) {
        // Upcasting: Child object is referenced by Parent reference
        Parent p = new Child();
        p.parentMethod(); // Allowed
        // p.childMethod(); // Not allowed, Parent reference can't access child-specific methods

        // Downcasting: Parent reference (that actually points to a Child object) is cast back to Child
        Child c = (Child) p;
        c.childMethod(); // Now allowed

        // Unsafe downcasting example (will throw ClassCastException)
        // Parent p2 = new Parent();
        // Child c2 = (Child) p2; // This will fail at runtime
    }
}
