package bpack;
import apack.A;

public class B extends A {
    public void display() {
        System.out.println("Default var: Not accessible");
        System.out.println("Protected var: " + protectedVar);
        System.out.println("Private var: Not accessible");
        System.out.println("Public var: " + publicVar);
    }
}
