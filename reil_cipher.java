import java.util.ArrayList;
import java.util.Scanner;

public class reil_cipher {
    public static void main(String args[]) {
        String[] levels;
        Scanner sc = new Scanner(System.in);
        String plain_text = "";
        int key, index = 0;
        boolean incr = false, decr = false;
        String encrypted_msg = "";
        String decrypted_msg = "";

        try {
            System.out.println("Enter plain text:");
            plain_text = sc.nextLine();

            System.out.println("Enter key:");
            key = sc.nextInt();

            levels = new String[key];
            index = 0;

            // encryption
            for (int i = 0; i < levels.length; i++) {
                levels[i] = "";
            }
            for (int i = 0; i < plain_text.length(); i++) {
                if (index >= key - 1) {
                    decr = true;
                    incr = false;
                } else if (index <= 0) {
                    incr = true;
                    decr = false;
                }

                levels[index] = levels[index] + String.valueOf(plain_text.charAt(i));
                System.out.println("Level-" + index + ":" + levels[index]);

                if (incr) {
                    index++;
                } else if (decr) {
                    index--;
                }

            }
            for (int i = 0; i < levels.length; i++) {
                encrypted_msg = encrypted_msg + levels[i];
            }

            System.out.println("Encrypted msg:" + encrypted_msg);

            // Decryption

            // to get what was the length of each level for e.g. plaintext=Prathamesh and
            // key=3 will give us phs on first level i.e str of length 3(phs) similarly we
            // need to calculate for each level

            String[] blanks = new String[key];
            int[] level_lenghts = new int[key];
            int[] index_counts = new int[key];
            index = 0;

            for (int i = 0; i < blanks.length; i++) {
                blanks[i] = "";
            }

            // simulating the process of encryption using the encrypted_msg length to get
            // length of each levels of original plaintext
            for (int i = 0; i < encrypted_msg.length(); i++) {
                if (index >= key - 1) {
                    decr = true;
                    incr = false;
                } else if (index <= 0) {
                    incr = true;
                    decr = false;
                }

                blanks[index] = blanks[index] + String.valueOf('z');
                System.out.println("Level-" + index + ":" + blanks[index]);

                if (incr) {
                    index++;
                } else if (decr) {
                    index--;
                }

            }

            // get length of each blank
            for (int i = 0; i < level_lenghts.length; i++) {
                level_lenghts[i] = blanks[i].length();
                index_counts[i] = blanks[i].length();

                System.out.println("\t" + i + ":" + level_lenghts[i]);

            }

            // set each blank to null string to reuse blank array
            for (int i = 0; i < blanks.length; i++) {
                blanks[i] = "";
            }

            // extract strings from encrypted msg as per each levels length
            index = 0;
            for (int i = 0; i < key; i++) {
                for (int j = 0; j < level_lenghts[i]; j++) {
                    blanks[i] = blanks[i] + String.valueOf(encrypted_msg.charAt(index));
                    index++;
                }
                System.out.println("blanks:" + blanks[i]);

            }

            index = 0;
            int str_index = 0;
            for (int i = 0; i < plain_text.length(); i++) {
                if (index >= key - 1) {
                    decr = true;
                    incr = false;
                    str_index++;
                } else if (index <= 0) {
                    incr = true;
                    decr = false;
                    str_index++;
                }

                decrypted_msg = decrypted_msg
                        + String.valueOf(blanks[index].charAt(level_lenghts[index] - index_counts[index]));
                index_counts[index] = index_counts[index] - 1;

                System.out.println("dcrypt" + str_index + ":" + decrypted_msg);

                if (incr) {
                    index++;
                } else if (decr) {
                    index--;
                }

            }

            System.out.println("Decrypted msg:" + decrypted_msg);

        } catch (Exception e) {
            sc.close();
            e.printStackTrace();
        }

    }
}
