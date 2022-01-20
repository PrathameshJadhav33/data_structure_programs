import java.util.Scanner;

public class stack {

    public int top;
    public int[] arr;

    public stack(int[] a, int t) {

        if (t < -1 || t >= a.length) {
            System.out.println("Unable to initialize! wrong value of top");
            return;
        }
        top = t;
        arr = a;
    }

    public void push(int element) {
        if (top >= arr.length - 1) {
            System.out.println("\tStack overflow");
            return;
        }
        top++;
        arr[top] = element;
        System.out.println("\tInserted " + element + " at index " + top);

    }

    public void pop() {
        if (top <= -1) {
            System.out.println("Stack underflow");
            return;
        }
        System.out.println("\tPopped element:" + arr[top]);
        top--;

    }

    public void display() {
        if (top <= -1) {
            System.out.println("Stack underflow");
            return;
        }
        for (int i = top; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }

    public int[] getstack() {
        return arr;
    }

    public static void main(String args[]) {
        int[] arr = new int[3];
        int choice, element;

        stack s = new stack(arr, 4);

        Scanner sc = new Scanner(System.in);
        try {
            do {
                System.out.println("1.Push\n2.Pop\n3.Display\n4.Exit\nyour choice:");
                choice = sc.nextInt();
                switch (choice) {
                    case 1:
                        System.out.println("\tEnter element to push:");
                        element = sc.nextInt();
                        s.push(element);
                        break;
                    case 2:
                        s.pop();
                        break;
                    case 3:
                        s.display();

                }

            } while (choice != 4);
        } finally {
            sc.close();
        }
    }
}
