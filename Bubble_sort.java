import java.util.Random;
import java.util.Scanner;

public class Bubble_sort {
    public int[] sort(int arr[]) {
        int swap;
        boolean isswapped = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = swap;
                    isswapped = true;
                }
            }
            if (!isswapped)
                break;
        }

        return arr;
    }

    public static void main(String args[]) {
        int[] arr = new int[10];
        // Scanner sc = new Scanner(System.in);
        Random random = new Random();

        try {
            for (int i = 0; i < arr.length; i++) {
                arr[i] = random.nextInt(1000);
                System.out.print("\t" + arr[i]);
            }

            arr = new Bubble_sort().sort(arr);

            System.out.println();
            for (int i = 0; i < arr.length; i++) {
                System.out.print("\t" + arr[i]);
            }
        } finally {
            // sc.close();
        }
    }

}
