import java.util.Collections;
import java.util.Comparator;
import java.util.Stack;
import java.util.Vector;

public class stack_c {
    public static void main(String args[]) {
        Stack<Integer> s = new Stack<Integer>();

        s.push(10);
        s.push(11);
        for (int i = 0; i < 20; i++) {
            s.push(i);
        }

        System.out.println(s.pop());
        System.out.println(s);

        Collections.shuffle(s);

        System.out.println(s);

        Collections.sort(s, Comparator.naturalOrder());

        System.out.println(s);

        Vector<Integer> v1 = new Vector<Integer>();

        v1.addAll(s);

        System.out.println(v1);

        System.out.println(s.search(10));
        System.out.println(s.peek());
        System.out.println(s.isEmpty());
    }
}