import java.util.Scanner;

class Student{
    String name;
    int RollNumber;
    int[] marks;
    int total = 0;
    double average =0;
    int highestScore = Integer.MIN_VALUE;

    public void accept (Scanner sc, int noofSubjects){
        System.out.print("Enter Name: ");
        name = sc.next();
        System.out.print("Enter roll number: ");
        RollNumber = sc.nextInt();
        marks = new int [noofSubjects];
        total = 0;
        highestScore = Integer.MIN_VALUE;

        for(int i=0; i< noofSubjects; i++){
            System.out.print("Enter marks in subject" + (i+1) + ":");
            marks[i] = sc.nextInt();
            total += marks[i];
            if (marks[i] > highestScore){
                highestScore = marks[i];
            }

        }
        average = (double) total / noofSubjects;

    }

    public void display(){
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + RollNumber);
        for (int i=0; i < marks.length; i++){
            System.out.println("Marks in subject" + (i+1) + ": " + marks[i]);
        }
        System.out.println("Total Marks: " + total);
        System.out.println("Average: " + average);
        System.out.println("Highest Score: " + highestScore);
    }
}

public class Lab04b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of subjects: ");
        int noofSubjects = sc.nextInt();
        Student[] students = new Student[noofSubjects];
        for (int i=0; i < noofSubjects; i++){
            students[i] = new Student();
            System.out.println("\n---Enter Details for Student" + (i+1)+"---");
            students[i].accept(sc, noofSubjects);
        }
        System.out.println("\n===Student Reports===");
        for (int i=0; i < noofSubjects; i++){
            System.out.println("\n---Student" + (i+1) + "---");
            students[i].display();
        }

    }
}
