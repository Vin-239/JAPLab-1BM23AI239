package dpack;

import bpack.B;
import cpack.C;

public class ProtectedDemo {
    public static void main(String[] args) {
        B objB = new B();
        System.out.println("Output from B (subclass):");
        objB.display();

        C objC = new C();
        System.out.println("\nOutput from C (object of A):");
        objC.display();
    }
}
