import java.util.Scanner;

public class linear_search {

    // returns index of target from search_arr[],
    // if not found in given arr then -1 is returned
    public int search(int search_arr[], int target) {
        int index = -1;
        for (int i = 0; i < search_arr.length; i++) {
            if (target == search_arr[i]) {
                index = i;
            }
        }

        return index;

    }

    public static void main(String args[]) {
        // variables

        int[] arr = new int[5];
        int target, index;
        Scanner sc = new Scanner(System.in);

        // code
        try {
            for (int i = 0; i < arr.length; i++) {
                System.out.println("Enter number " + (i + 1) + ":");
                arr[i] = sc.nextInt();
            }
            System.out.println("Enter no to be searched:");
            target = sc.nextInt();

            index = new linear_search().search(arr, target);
            if (index == -1) {
                System.out.println("Element not found");
            } else {
                System.out.println("Element found at index :" + index);
            }
        } finally {
            sc.close();
        }

    }
}