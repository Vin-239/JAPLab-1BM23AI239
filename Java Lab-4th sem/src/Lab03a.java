import java.util.Scanner;

public class Lab03a {
    public boolean compareStrings(String s1, String s2) {
        return s1.equals(s2);
    }

    public boolean compareStringsIgnoreCase(String s1, String s2) {
        return s1.equalsIgnoreCase(s2);
    }

    public String concatenateString(String s1, String s2) {
        return s1.concat(s2);
    }

    public String stringCpy(String s) {
        return new String(s);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter s1: ");
        String s1 = sc.nextLine();

        System.out.print("Enter s2: ");
        String s2 = sc.nextLine();

        Lab03a o = new Lab03a();


        System.out.println("Compare strings: " + o.compareStrings(s1, s2));
        System.out.println("Compare strings(ignore case): " + o.compareStringsIgnoreCase(s1, s2));
        System.out.println("Concatenated string: " + o.concatenateString(s1, s2));

        String cpyString = o.stringCpy(s1);

        System.out.println("Copied string: " + cpyString);
    }
}

