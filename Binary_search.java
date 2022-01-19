import java.util.Scanner;

public class Binary_search {
    public int search(int arr[], int target) {
        int index = -1;

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
            for (int i = 0; i < arr.length; i++) {

            }

            // taking user input
            System.out.println("Enter value to be searched:");
            target = sc.nextInt();

            new Binary_search().search(arr, target);

        } finally {
            sc.close();
        }
    }
}
