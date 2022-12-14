import java.util.Arrays;
import java.util.Scanner;

public class Binary_search {
    public int search(int arr[], int target) {
        int index = -1;
        int right = arr.length;
        int left = 0;
        while (left < right) {
            int mid = (left + right) / 2;
            if (arr[mid] == target)
                return mid;
            else if (arr[mid] < target)
                left = mid + 1;
            else
                right = mid - 1;
        }

        return index;

    }

    public static void main(String args[]) {
        int[] arr = new int[10];
        int target;
        Scanner sc = new Scanner(System.in);

        try {
            // taking input from user
            System.out.println("Enter 10 elements");
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }

            // sorting given array
            // for (int i = 0; i < arr.length; i++) {

            // }
            Arrays.sort(arr);

            for (int a : arr)
                System.out.print("\t" + a);
            // taking user input
            System.out.println("\nEnter value to be searched:");
            target = sc.nextInt();

            System.out.println(new Binary_search().search(arr, target));

        } finally {
            sc.close();
        }
    }
}
