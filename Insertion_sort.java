import java.util.Scanner;
import java.util.Random;

public class Insertion_sort {

    // public int[] sort(int arr[]) {
    // int k, key, swap;
    // for (int i = 1; i < arr.length - 1; i++) {
    // key = arr[i];
    // k = i - 1;
    // while (k >= 0 && arr[k] > key) {
    // swap = arr[k];
    // arr[k] = arr[k + 1];
    // arr[k + 1] = swap;
    // k--;
    // }
    // }
    // return arr;

    // }

    public int[] sort(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int cur = arr[i];
            for (int j = i - 1; j > -1; j--) {
                if (cur < arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }

    public static void main(String args[]) {
        int[] arr = new int[10];
        // Scanner sc = new Scanner(System.in);
        Random random = new Random();
        try {
            System.out.println("Enter 10 elements");
            for (int i = 0; i < arr.length; i++) {
                arr[i] = random.nextInt(1000);
                System.out.print("\t" + arr[i]);
            }

            arr = new Insertion_sort().sort(arr);
            System.out.println();
            for (int i = 0; i < arr.length; i++) {
                System.out.print("\t" + arr[i]);
            }

        } finally {
            // sc.close();
        }
    }
}