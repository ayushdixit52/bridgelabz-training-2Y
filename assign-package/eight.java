// Simulated package: com.access.one
class Base {
    public void publicMethod() {
        System.out.println("Public Method: Accessible everywhere");
    }

    protected void protectedMethod() {
        System.out.println("Protected Method: Accessible in subclass or same package");
    }

    void defaultMethod() {
        System.out.println("Default Method: Accessible only within same package");
    }

    private void privateMethod() {
        System.out.println("Private Method: Accessible only within the same class");
    }

    public void testBaseAccess() {
        System.out.println("\n--- Access within Base Class ---");
        publicMethod();
        protectedMethod();
        defaultMethod();
        privateMethod();
    }
}

// Simulated package: com.access.two
class Derived extends Base {
    public void testAccess() {
        System.out.println("\n--- Access from Derived (subclass in another package) ---");

        publicMethod();       // ✅ Accessible (public)
        protectedMethod();    // ✅ Accessible (inherited)
        // defaultMethod();   // ❌ Not accessible (different package)
        // privateMethod();   // ❌ Not accessible (private to Base)

        System.out.println("Note: Default and Private methods are NOT accessible here.");
    }
}

// Simulated package: com.access.main
public class eight {
    public static void main(String[] args) {
        Base base = new Base();
        base.testBaseAccess();

        Derived derived = new Derived();
        derived.testAccess();

        System.out.println("\n--- Access from Non-Subclass in Another Package ---");
        base.publicMethod();      // ✅ Accessible (public)
        // base.protectedMethod(); // ❌ Not accessible (not subclass)
        // base.defaultMethod();   // ❌ Not accessible (different package)
        // base.privateMethod();   // ❌ Not accessible (private)
        
        System.out.println("Note: Only PUBLIC method accessible from non-subclass in another package.");

        System.out.println("\n===== Access Modifier Summary Table =====");
        System.out.println("-------------------------------------------------------------");
        System.out.println("Modifier     | Same Class | Same Package | Subclass (Diff Pkg) | Other Pkg");
        System.out.println("-------------------------------------------------------------");
        System.out.println("public       | Yes        | Yes          | Yes                 | Yes");
        System.out.println("protected    | Yes        | Yes          | Yes                 | No");
        System.out.println("default      | Yes        | Yes          | No                  | No");
        System.out.println("private      | Yes        | No           | No                  | No");
        System.out.println("-------------------------------------------------------------");
    }
}

