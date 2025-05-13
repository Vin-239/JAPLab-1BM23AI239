import java.lang.*;
import java.util.Scanner;

public class Lab02a{
    int intVal = 0;
    double doubleVal = 0;
    boolean booleanVal = false;
    char charVal = ' ';
    int a, b;
    int sum = 0;

    public void accept(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a integer: ");
        intVal = sc.nextInt();

        System.out.print("Enter a double: ");
        doubleVal = sc.nextDouble();

        System.out.print("Enter a boolean: ");
        booleanVal = sc.nextBoolean();

        System.out.print("Enter a character: ");
        charVal = sc.next().charAt(0);

        System.out.print("Enter number 1: ");
        a = sc.nextInt();

        System.out.print("Enter number 2: ");
        b = sc.nextInt();
    }

    public void convertDisplay(){
        Integer boxInt = intVal;
        Double boxDouble = doubleVal;
        Boolean boxBoolean = booleanVal;
        Character boxChar = charVal;

        int intUnbox = boxInt;
        double doubleUnbox = boxDouble;
        char charUnbox = boxChar;
        boolean booleanUnbox = boxBoolean;

        System.out.println("---Boxed values---");
        System.out.println("Integer: " + boxInt);
        System.out.println("Double: " + boxDouble);
        System.out.println("Char: " + boxChar);
        System.out.println("Boolean: " + boxBoolean);

        System.out.println("---Unboxed values---");
        System.out.println("int: " + intUnbox);
        System.out.println("double: " + doubleUnbox);
        System.out.println("char: " + charUnbox);
        System.out.println("boolean: " + booleanUnbox);
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
        Lab02a main = new Lab02a();
        main.accept();
        main.convertDisplay();
        //obj.accept();
        //obj.display();
    }
}