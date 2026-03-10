=import java.util.Scanner;

// Node class
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

// Stack class
class StackLL {
    Node top = null;

    // Push operation
    void push(int x) {
        Node newNode = new Node(x);
        newNode.next = top;
        top = newNode;
    }

    // Pop operation
    void pop() {
        if (top == null) {
            System.out.println("Stack is empty");
            return;
        }

        System.out.println(top.data + " popped");
        top = top.next;
    }

    // Peek operation
    void peek() {
        if (top == null) {
            System.out.println("Stack is empty");
            return;
        }

        System.out.println("Top element is: " + top.data);
    }

    // Display operation
    void display() {
        if (top == null) {
            System.out.println("Stack is empty");
            return;
        }

        Node temp = top;
        System.out.println("Stack elements:");

        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StackLL stack = new StackLL();

        System.out.print("Enter number of elements to push: ");
        int n = sc.nextInt();

        // User input using for loop
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element: ");
            int val = sc.nextInt();
            stack.push(val);
        }

        System.out.println("\n--- Stack Display ---");
        stack.display();

        System.out.println("\n--- Peek Element ---");
        stack.peek();

        System.out.println("\n--- Pop Operation ---");
        stack.pop();

        System.out.println("\n--- Stack After Pop ---");
        stack.display();
    }
}
