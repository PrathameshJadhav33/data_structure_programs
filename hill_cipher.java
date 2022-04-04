import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class hill_cipher {
    public static void main(String args[]) {
        // String[] char_arr = new String[26];
        ArrayList<String> char_arr = new ArrayList<String>();

        Scanner sc = new Scanner(System.in);
        int length = 0;
        String msg;
        int random;
        HashSet<String> h1 = new HashSet<String>();

        for (char a = 'a'; a <= 'z'; a++) {
            // char_arr[(int) i] = String.valueOf(a);
            char_arr.add(String.valueOf(a));
        }

        System.out.println("Enter msg:");
        msg = sc.nextLine();

        length = msg.length();

        int[] multiplication = new int[length];
        int[] mod = new int[length];
        int[] msg_indexs = new int[length];

        for (int i = 0; i < length; i++) {
            msg_indexs[i] = char_arr.indexOf(String.valueOf(msg.charAt(i)));
        }

        for (int j = 0; j < length; j++) {
            System.out.println(msg_indexs[j]);
        }

        // to allow duplicates replace hashmap with vector or arraylist
        while (h1.size() != (length * length)) {
            random = (int) (Math.random() * (26 - 0) - 0);
            // h1.add(char_arr[random]);
            h1.add(char_arr.get(random));
        }

        System.out.println("Random chars:" + h1);

        Iterator k = h1.iterator();

        // inititialize and generate index of those radmly selected arrys
        int[][] key_arr = new int[length][length];
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                key_arr[i][j] = char_arr.indexOf(k.next());
            }
        }

        // print random char index arry
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                System.out.print(key_arr[i][j] + "\t|");
            }
            System.out.println();
        }

        int addition = 0;

        System.out.println("Multiplication array:");

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                addition = addition + (key_arr[i][j] * msg_indexs[j]);
            }
            multiplication[i] = addition;
            mod[i] = multiplication[i] % 26;
            System.out.println(multiplication[i] + "\t|");

        }

        System.out.println("mod array:");

        for (int i : mod) {
            System.out.println(i + "|");
        }

        for (int i : mod) {
            System.out.print(char_arr.get(i));
        }

    }
}
