import java.util.Random;
import java.util.Scanner;

public class Quick_sort {

    public void quick_sort1(int arr[]) {

        quick_sort1(arr, 0, arr.length - 1);

    }

    public void quick_sort1(int arr[], int left, int right) {
        if (left >= right) {
            return;
        }
        int pivot = arr[(left + right) / 2];
        int index = partition(arr, left, right, pivot);

        quick_sort1(arr, left, index - 1);
        quick_sort1(arr, index, right);

    }

    public int partition(int arr[], int left, int right, int pivot) {
        while (left <= right) {
            while (arr[left] < pivot) {
                left++;
            }
            while (arr[right] > pivot) {
                right--;
            }
            if (left <= right) {

                int swap = 0;

                swap = arr[right];
                arr[right] = arr[left];
                arr[left] = swap;

                left++;
                right--;
            }
        }

        return left;
    }

    public static void main(String args[]) {
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        try {
            System.out.println("Enter 5 elements:");
            for (int i = 0; i < arr.length; i++) {
                arr[i] = random.nextInt(1000);
                System.out.print("\t" + arr[i]);

            }

            new Quick_sort().quick_sort1(arr);
            System.out.println();

            System.out.println("Sorted array:");

            for (int i = 0; i < arr.length; i++) {
                System.out.print("\t" + arr[i]);
            }
        } finally {
            sc.close();
        }
    }

}
