import java.util.ArrayList;
import java.util.Scanner;

public class playfair_cipher {
    public static void main(String[] args) {
        Character[] chars = new Character[26];

        for (char a = 'a', i = 0; a <= 'z'; a++, i++) {
            chars[Integer.valueOf(i)] = a;
        }

        String key, plaintext;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter key:");
        key = sc.next();

        ArrayList<Character> d = new ArrayList<Character>();

        for (int i = 0; i < key.length(); i++) {
            if (d.contains(key.charAt(i)) == false) {
                d.add(key.charAt(i));
            }
        }

        for (int j = 0; j < chars.length; j++) {
            if (d.contains(chars[j]) == false) {
                if (chars[j] == 'j') {
                    continue;
                }
                d.add(chars[j]);
            }
        }

        System.out.println(d + " " + d.size());

        Character[][] matrix = new Character[5][5];

        int index = 0;
        for (int j = 0; j < 5; j++) {
            for (int k = 0; k < 5; k++) {
                matrix[j][k] = d.get(index);
                System.out.print(" " + matrix[j][k]);
                index++;
            }
            System.out.println();
        }

        System.out.println("Enter plaintext:");
        plaintext = sc.next();

        ArrayList<Character> diagraphs = new ArrayList<Character>();

        // check whether consecutive duplicates are present in plaintext and add z or x
        // to diagraph
        for (int k = 0; k < plaintext.length(); k++) {
            if (k > 0 && plaintext.charAt(k) == plaintext.charAt(k - 1) && k % 2 != 0) {
                if (plaintext.charAt(k) == 'z') {
                    diagraphs.add('x');
                } else {
                    diagraphs.add('z');
                }
                diagraphs.add(plaintext.charAt(k));
            } else {
                diagraphs.add(plaintext.charAt(k));
            }
        }

        // Add z or x to last position of diagraphs if size of string is odd as we
        // require even no. of Characters to form pairs of 2
        if (diagraphs.size() % 2 != 0) {
            if (diagraphs.get(diagraphs.size() - 1) == 'z') {
                diagraphs.add('x');
            } else {
                diagraphs.add('z');
            }
        }

        System.out.println(diagraphs + " " + diagraphs.size());
        int column1 = 0, row1 = 0;
        int column2 = 0, row2 = 0;

        char tofind;
        String encrypted_msg = "";

        for (int l = 0; l < diagraphs.size(); l = l + 2) {

            tofind = diagraphs.get(l);
            for (int j = 0; j < 5; j++) {
                for (int k = 0; k < 5; k++) {
                    if (matrix[j][k] == tofind) {
                        row1 = j;
                        column1 = k;
                        break;
                    }
                }
            }

            tofind = diagraphs.get(l + 1);
            for (int j = 0; j < 5; j++) {
                for (int k = 0; k < 5; k++) {
                    if (matrix[j][k] == tofind) {
                        row2 = j;
                        column2 = k;
                        break;
                    }
                }
            }

            if (row1 == row2) {
                column1 = (column1 + 1) % 5;
                column2 = (column2 + 1) % 5;
            }

            else if (column1 == column2) {
                row1 = (row1 + 1) % 5;
                row2 = (row2 + 1) % 5;
            }

            else {
                int pass;
                pass = column1;
                column1 = column2;
                column2 = pass;

            }

            encrypted_msg = encrypted_msg + matrix[row1][column1] + matrix[row2][column2];

        }

        System.out.println("Encrypted message:" + encrypted_msg);

    }
}