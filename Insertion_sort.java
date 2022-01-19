import java.util.Scanner;

public class Insertion_sort {

    public int[] sort(int arr[]) {
        int k, key, swap;
        for (int i = 1; i < arr.length - 1; i++) {
            key = arr[i];
            k = i - 1;
            while (k >= 0 && arr[k] > key) {
                swap = arr[k];
                arr[k] = arr[k + 1];
                arr[k + 1] = swap;
                k--;
            }
        }
        return arr;

    }

    public static void main(String args[]) {
        int[] arr = new int[10];
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter 10 elements");
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }

            arr = new Insertion_sort().sort(arr);
            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i]);
            }

        } finally {
            sc.close();
        }
    }
}