interface Stack {
    void push(int item);
    int pop();
}

class FixedStack implements Stack {
    int[] stack;
    int top;

    FixedStack(int size) {
        stack = new int[size];
        top = -1;
    }

    public void push(int item) {
        if (top == stack.length - 1)
            System.out.println("Stack Overflow");
        else
            stack[++top] = item;
    }

    public int pop() {
        if (top < 0) {
            System.out.println("Stack Underflow");
            return -1;
        }
        return stack[top--];
    }
}

class DynamicStack implements Stack {
    int[] stack;
    int top;

    DynamicStack() {
        stack = new int[2];
        top = -1;
    }

    public void push(int item) {
        if (top == stack.length - 1) {
            int[] newStack = new int[stack.length * 2];
            System.arraycopy(stack, 0, newStack, 0, stack.length);
            stack = newStack;
        }
        stack[++top] = item;
    }

    public int pop() {
        if (top < 0) {
            System.out.println("Stack Underflow");
            return -1;
        }
        return stack[top--];
    }
}

public class Lab09 {
    public static void main(String[] args) {
        Stack s1 = new FixedStack(3);
        Stack s2 = new DynamicStack();

        // Testing FixedStack
        s1.push(1);
        s1.push(2);
        s1.push(3);
        s1.push(4); // Should show overflow

        System.out.println("Fixed Stack pop: " + s1.pop());
        System.out.println("Fixed Stack pop: " + s1.pop());

        // Testing DynamicStack
        s2.push(10);
        s2.push(20);
        s2.push(30); // Should resize

        System.out.println("Dynamic Stack pop: " + s2.pop());
        System.out.println("Dynamic Stack pop: " + s2.pop());
    }
}
