package bpack;
import apack.A;

public class B extends A {
    public void display() {
        //System.out.println("Default var: " + + defaultVar);
        System.out.println("Protected var: " + protectedVar);
        //System.out.println("Private var: " + privateVar);
        System.out.println("Public var: " + publicVar);
    }
}
