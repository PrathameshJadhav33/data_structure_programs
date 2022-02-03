import java.lang.Character;
import java.util.Scanner;
import java.lang.String;

//Code to generate ciphered text using Caesar cipher technique

public class B73_Caesar_cipher {
    public static void main(String args[]) {
        // variables
        char arr[] = new char[26];
        int index = 0, shift = 2;
        char ori;
        String input, ciphered = "";
        Scanner sc = new Scanner(System.in);

        // generate a to z and store in arr[]
        for (char i = 'a', j = 0; i <= 'z'; i++, j++) {
            arr[(int) j] = i;
        }

        // code
        try {
            System.out.print("Enter text to cipher\t:");
            input = sc.nextLine();

            System.out.print("Enter shift\t:");
            shift = sc.nextInt();

            for (int k = 0; k < input.length(); k++) {
                ori = input.charAt(k);
                if (ori != ' ') {
                    ori = Character.toLowerCase(ori);
                    index = new String(arr).indexOf(ori);
                    index = (index + (shift - 1)) % 26;
                    ciphered = ciphered + arr[index];
                } else {
                    ciphered = ciphered + ' ';
                }
            }
            System.out.println("Ciphered text\t:" + ciphered);

        } catch (Exception e) {
            System.out.println(e);
            sc.close();
        }
    }
}
