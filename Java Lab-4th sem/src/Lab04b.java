import java.util.Scanner;

public class Lab04b {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] scores = new int[5];
        int sum = 0;
        int highest = 0;

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter score for student " + (i + 1) + ": ");
            scores[i] = scanner.nextInt();
            sum += scores[i];
            if (scores[i] > highest) {
                highest = scores[i];
            }
        }

        System.out.println("\nTotal sum of scores: " + sum);
        System.out.println("Highest score: " + highest);

        scanner.close();
    }
}
