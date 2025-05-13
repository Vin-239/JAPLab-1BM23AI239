import java.util.Scanner;
import java.util.Vector;

public class Lab06<T> {
    private Vector<T> queue;
    private int front, rear, size, capacity;

    public Lab06(int capacity) {
        this.capacity = capacity;
        this.size = 0;
        this.front = 0;
        this.rear = -1;
        this.queue = new Vector<>(capacity);
    }

    public void enqueue(T element) {
        if (size == capacity) {
            capacity *= 2;
            Vector<T> newQueue = new Vector<>(capacity);
            for (int i = 0; i < size; i++) {
                newQueue.add(queue.get((front + i) % size));
            }
            queue = newQueue;
            front = 0;
            rear = size - 1;
        }
        rear = (rear + 1) % capacity;
        queue.add(rear, element);
        size++;
    }

    public T dequeue() {
        if (size == 0) {
            System.out.println("Queue is empty!");
            return null;
        }
        T element = queue.get(front);
        front = (front + 1) % capacity;
        size--;
        return element;
    }

    public T peek() {
        if (size == 0) {
            System.out.println("Queue is empty!");
            return null;
        }
        return queue.get(front);
    }

    public int size() {
        return size;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Lab06<Object> lab6 = new Lab06<>(5);

        while (true) {
            System.out.println("\nChoose an operation:");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Peek");
            System.out.println("4. Check size");
            System.out.println("5. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 1) {
                System.out.print("Choose data type for the element (1: Integer, 2: String, 3: Double): ");
                int dataType = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Enter the element: ");
                Object element = null;
                if (dataType == 1) {
                    element = scanner.nextInt();
                } else if (dataType == 2) {
                    element = scanner.nextLine();
                } else if (dataType == 3) {
                    element = scanner.nextDouble();
                }
                lab6.enqueue(element);
            } else if (choice == 2) {
                System.out.println("Dequeued element: " + lab6.dequeue());
            } else if (choice == 3) {
                System.out.println("Front element: " + lab6.peek());
            } else if (choice == 4) {
                System.out.println("Queue size: " + lab6.size());
            } else if (choice == 5) {
                break;
            } else {
                System.out.println("Invalid choice, try again.");
            }
        }
        scanner.close();
    }
}

