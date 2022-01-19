import java.util.Scanner;

public class Bubble_sort {
    public int[] sort(int arr[]) {
        int swap;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = swap;
                }
            }
        }

        return arr;
    }

    public static void main(String args[]) {
        int[] arr = new int[10];
        Scanner sc = new Scanner(System.in);

        try {
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }

            arr = new Bubble_sort().sort(arr);

            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i]);
            }
        } finally {
            sc.close();
        }
    }

}
