import java.lang.*;
import java.util.Scanner;

public class Lab02b {
    int a, b;
    int sum = 0;

    public void accept() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number 1: ");
        a = sc.nextInt();

        System.out.print("Enter number 2: ");
        b = sc.nextInt();
    }

    public Integer boxSum(int a, int b) {
        Integer aVal = a;
        Integer bVal = b;

        return (aVal + bVal);
    }

    public int unboxSum(int val) {
        sum = boxSum(a, b);
        return sum;
    }

    public void display() {
        Integer boxVal = boxSum(a, b);
        int unboxVal = unboxSum(boxVal);
        System.out.println("Boxed sum: " + boxVal);
        System.out.println("Unboxed sum: " + unboxVal);
    }

    public static void main(String[] args) {
        Lab02b obj = new Lab02b();
        obj.accept();
        obj.display();
    }
}