
import java.util.Scanner;

public class Selection_sort {

    public int[] sort(int arr[]) {
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

    public static void main(String args[]) {
        int[] arr = new int[5];

        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter " + arr.length + " elements:");
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }

            arr = new Selection_sort().sort(arr);

            System.out.println("sorted elements:");
            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i]);
            }

        } finally {
            sc.close();
        }
    }
}
