import java.util.Vector;

public class Lab061<T> {
    Vector<T> queue;
    int front, rear, size, capacity;

    public Lab061(int capacity) {
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

    public void display() {
        if (size == 0) {
            System.out.println("Queue is empty!");
            return;
        }
        System.out.print("Queue elements: ");
        for (int i = 0; i < size; i++) {
            System.out.print(queue.get((front + i) % capacity) + " ");
        }
        System.out.println();
    }


    public static void main(String[] args) {
        Lab061<Object> q = new Lab061<>(2);
        q.enqueue(1);
        q.enqueue("Two");
        q.enqueue("Three"); // triggers resize
        System.out.println("Front: " + q.peek());
        System.out.println("Dequeued: " + q.dequeue());
        System.out.println("Queue size: " + q.size());
        q.display();
    }
}
