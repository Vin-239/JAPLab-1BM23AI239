import java.util.Scanner;

public class Lab01a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double fee = 2000;

        System.out.println("--- Gym Membership Menu ---");
        System.out.println();

        System.out.print("Enter name: ");
        String name = sc.nextLine();

        System.out.print("Enter age: ");
        int age = sc.nextInt();

        System.out.print("Active membership (true/false): ");
        boolean isActive = sc.nextBoolean();

        System.out.print("Enter duration (in months): ");
        int duration = sc.nextInt();

        System.out.println("--- Member details ---");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Duration: " + duration);

        if (isActive) {
            System.out.println("Membership Status: Active");
            System.out.println("Membership Fee: $" + (duration * fee));
        } else {
            System.out.println("Membership Status: Inactive");
        }

        sc.close();
    }
}
