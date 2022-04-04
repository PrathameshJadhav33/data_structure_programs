import java.util.*;

public class affine_cipher {
    public static void main(String args[]) {

        ArrayList<String> char_arr = new ArrayList<String>();
        int a, b;
        int ciphered_index, index;
        String en_msg = " ";

        a = (int) (Math.random() * (26 - 0) - 0);
        b = (int) (Math.random() * (26 - 0) - 0);

        for (char j = 'a'; j <= 'z'; j++) {
            char_arr.add(String.valueOf(j));

        }

        Scanner sc = new Scanner(System.in);

        // encryption
        System.out.println("Enter text:");
        String msg = sc.nextLine();

        for (int i = 0; i < msg.length(); i++) {
            if (msg.charAt(i) != ' ') {
                index = char_arr.indexOf(String.valueOf(msg.charAt(i)));
                ciphered_index = (a * index + b) % 26;
                en_msg = en_msg + char_arr.get(ciphered_index);
            } else {
                en_msg = en_msg + " ";

            }

        }

        System.out.println("Encrypted message:" + en_msg);

        // decryption

        int a_inv;
        int flag = 1;

        for (int i = 0; i < 26; i++) {

            flag = (a * i) % 26;
            if (flag == 1) {

                a_inv = i;
            }
        }

    }
}