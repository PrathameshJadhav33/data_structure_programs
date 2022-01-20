import java.lang.System;

public class linear_queue {
    public int front, rear;
    public int[] arr;

    public linear_queue(int[] a, int f, int r) {
        if (f == r && f != -1 && r != -1) {
            System.out.println("Queue empty");
            return;
        }
        if (r >= a.length || f >= a.length || f < -1 || r < -1 || f > r) {
            System.out.println("Wrong values of front and rear!");
            return;
        }

        if (r == -1 && f == -1) {
            arr = a;
            front = 0;
            rear = 0;
            return;
        }
        arr = a;
        front = f;
        rear = r;
    }

    public void enqueue(int element) {
        if (rear > arr.length - 1) {
            System.out.println("Queue overflow");
            return;
        }

        arr[rear] = element;
        rear++;

        System.out.println("\tEnqueue :" + element);
    }

    public void dequeue() {
        if (front >= rear) {
            System.out.println("Queue underflow");
            return;
        }

        System.out.println("\tDequeue :" + arr[front]);
        front++;
    }

    public int[] getqueue() {
        int[] array = new int[rear - front];

        for (int i = front, k = 0; i < rear; i++, k++) {
            array[k] = arr[i];
        }
        return array;
    }

    public static void main(String args[]) {
        long start = System.nanoTime();
        int[] a = new int[3];
        linear_queue lc = new linear_queue(a, -1, -1);

        lc.enqueue(10);
        lc.enqueue(11);
        lc.enqueue(12);
        lc.enqueue(13);

        lc.dequeue();
        lc.dequeue();
        lc.dequeue();
        lc.dequeue();
        lc.dequeue();
        lc.dequeue();

        a = lc.getqueue();
        for (int i = a.length - 1; i >= 0; i--) {
            System.out.print("\t" + a[i]);
        }

        long duration = (System.nanoTime() - start) / 1000000;

        System.out.println("Run time:" + duration + " milliseconds");

    }

}
