import java.util.*;

public class hill_cipher1 {
    public static void main(String args[]) {
        int[][] msg_index;
        int[][] key_index;
        int[] msg_copy = new int[3];

        ArrayList<String> char_arr = new ArrayList<String>();

        String plain_text = "";
        String key = "";
        String encrypted = "";

        Scanner sc = new Scanner(System.in);

        // stroing a to z into arraylist
        for (char a = 'a'; a <= 'z'; a++) {
            char_arr.add(String.valueOf(a));
        }

        System.out.println("Enter your msg:");
        plain_text = sc.nextLine();

        if (plain_text.length() % 3 != 0) {
            System.out.println("\tPadding plain text!");
            for (int i = 0; i < plain_text.length() % 3; i++) {
                plain_text = plain_text + "z";
            }
        }
        System.out.println("\t" + plain_text);

        System.out.println("Enter key:");
        key = sc.nextLine();

        if (key.length() % 3 != 0) {
            System.out.println("\tPadding key!");

            for (int i = 0; i < key.length() % 3; i++) {
                key = key + "z";
            }
        }
        System.out.println("\t" + key);

        msg_index = new int[3][plain_text.length() / 3];
        key_index = new int[3][key.length() / 3];

        for (int i = 0, k = 0; i < plain_text.length() / 3; i++) {
            for (int j = 0; j < 3; j++) {
                msg_index[j][i] = char_arr.indexOf(String.valueOf(plain_text.charAt(k++)));
                System.out.print(msg_index[j][i] + "\t|");
            }
            System.out.println();
        }

        System.out.println("-------");

        for (int i = 0, k = 0; i < 3; i++) {
            for (int j = 0; j < key.length() / 3; j++) {
                key_index[i][j] = char_arr.indexOf(String.valueOf(key.charAt(k++)));
                System.out.print(key_index[i][j] + "\t|");
            }
            System.out.println();
        }

        // encryption

        int addition = 0;
        int mod = 0;

        System.out.println("-------");
        for (int k = 0; k < plain_text.length() / 3; k++) {
            for (int i = 0; i < 3; i++) {
                msg_copy[i] = msg_index[i][k];
            }
            for (int i = 0; i < 3; i++) {
                addition = 0;
                for (int j = 0; j < key.length() / 3; j++) {
                    addition = addition + (key_index[i][j] * msg_copy[j]);
                }
                mod = addition % 26;
                System.out.println(addition + "\t:" + mod + "\t:" + char_arr.get(mod));
                encrypted = encrypted + char_arr.get(mod);
            }

        }

        System.out.println(encrypted);

    }

}
