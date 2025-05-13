import java.util.Scanner;

public class Lab03b {
    String revString;
    void checkCapacity() {
        StringBuffer s1 = new StringBuffer();
        StringBuffer s2 = new StringBuffer("cat");

        System.out.println("Capacity of empty string: " + s1.capacity());
        System.out.println("Capacity of \"cat\" string: " + s2.capacity());
    }

    void reverseUpperString() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string to reverse: ");
        String ori = sc.nextLine();

        StringBuffer buffer = new StringBuffer(ori);
        buffer.reverse();

        revString = buffer.toString().toUpperCase();
        System.out.println("Original String: " + ori);
        System.out.println("Reversed Uppercase String: " + revString);
    }

    void appendString() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string to append: ");
        String s = sc.nextLine();

        StringBuffer buffer = new StringBuffer(revString);
        buffer.append(s);

        System.out.println("New appended string: " + buffer.toString());
    }
    public static void main(String[] args) {
        Lab03b o = new Lab03b();

        o.checkCapacity();
        o.reverseUpperString();
        o.appendString();
    }
}