package cpack;
import apack.A;

public class C {
    public void display() {
        A obj = new A();
        System.out.println("Default var: Not accessible");
        System.out.println("Protected var: Not accessible");
        System.out.println("Private var: Not accessible");
        System.out.println("Public var: " + obj.publicVar);
    }
}
