package dpack;

import bpack.B;
import cpack.C;

public class ProtectedDemo {
    public static void main(String[] args) {
        B objB = new B();
        objB.display();

        C objC = new C();
        objC.display();
    }
}
