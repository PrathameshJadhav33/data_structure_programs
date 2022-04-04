import java.util.*;

public class poly_cipher {
    public static void main(String args[]) {

        ArrayList<String> char_arr = new ArrayList<String>();
        int a, b;
        int ciphered_index, index1, index2;
        String en_msg = "";
        String de_msg = "";

        a = (int) (Math.random() * (26 - 0) - 0);
        b = (int) (Math.random() * (26 - 0) - 0);

        for (char j = 'a'; j <= 'z'; j++) {
            char_arr.add(String.valueOf(j));

        }

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter text:");
        String msg = sc.nextLine();

        System.out.println("Enter key:");
        String key = sc.nextLine();

        String pad_key = "";

        for (int i = 0; i < (int) ((msg.length() / key.length()) + 1); i++) {
            pad_key = pad_key + key;
        }

        System.out.println(pad_key);

        // Encryption
        for (int i = 0; i < msg.length(); i++) {
            if (msg.charAt(i) != ' ') {
                index1 = char_arr.indexOf(String.valueOf(msg.charAt(i)));
                index2 = char_arr.indexOf(String.valueOf(pad_key.charAt(i)));

                ciphered_index = (index1 + index2) % 26;
                en_msg = en_msg + char_arr.get(ciphered_index);
            } else {
                en_msg = en_msg + " ";

            }

        }

        System.out.println("Encrypted message:" + en_msg);

        // Decryption

        for (int i = 0; i < en_msg.length(); i++) {
            if (en_msg.charAt(i) != ' ') {
                index1 = char_arr.indexOf(String.valueOf(en_msg.charAt(i)));
                index2 = char_arr.indexOf(String.valueOf(pad_key.charAt(i)));

                ciphered_index = (index1 - index2 + 26) % 26;
                de_msg = de_msg + char_arr.get(ciphered_index);
            } else {
                de_msg = de_msg + " ";
            }

        }

        System.out.println("Decrypted message:" + de_msg);

    }
}