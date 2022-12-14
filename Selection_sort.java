
import java.util.Scanner;
import java.util.Random;

public class Selection_sort {

    public int[] sort1(int arr[]) {
        int k, unsorted = 0, min, min_index, swap;

        for (int i = unsorted + 1; i < arr.length; i++) {
            min = arr[unsorted];
            min_index = unsorted;
            k = i;

            while (k < arr.length) {
                if (arr[k] < min) {

                    min = arr[k];
                    min_index = k;
                }
                k++;
            }

            swap = arr[unsorted];
            arr[unsorted] = arr[min_index];
            arr[min_index] = swap;

            unsorted++;

        }
        return arr;
    }

    public int[] sort(int[] arr) {
        int sorted_index = 0;

        for (int i = 0; i < arr.length; i++) {

            int min_index = sorted_index;
            int min_value = Integer.MAX_VALUE;
            for (int j = sorted_index; j < arr.length; j++) {
                if (arr[j] < min_value) {
                    min_index = j;
                    min_value = arr[j];
                }
            }
            int temp = arr[min_index];
            arr[min_index] = arr[sorted_index];
            arr[sorted_index] = temp;
            sorted_index++;
        }

        return arr;
    }

    public static void main(String args[]) {
        int[] arr = new int[5];

        // Scanner sc = new Scanner(System.in);
        Random random = new Random();

        try {
            System.out.println("Enter " + arr.length + " elements:");
            for (int i = 0; i < arr.length; i++) {
                arr[i] = random.nextInt(1000);
                System.out.print("\t" + arr[i]);
            }

            arr = new Selection_sort().sort(arr);
            System.out.println();
            System.out.println("sorted elements:");
            for (int i = 0; i < arr.length; i++) {
                System.out.print("\t" + arr[i]);
            }

        } finally {
            // sc.close();
        }
    }
}
