import java.util.Vector;
import java.util.HashSet;

public class hashset_c {
    public static void main(String args[]) {

        HashSet<Integer> h = new HashSet<Integer>();

        for (int i = 1; i < 10; i = i + 2) {
            h.add(i);
        }

        HashSet<Integer> h1 = new HashSet<Integer>();
        for (int i = 0; i < 10; i = i + 2) {
            h1.add(i);
        }

        // Union of two sets
        h.addAll(h1);
        System.out.println(h);

        // difference
        h.removeAll(h1);
        System.out.println(h);

        // Intersection
        h.retainAll(h1);
        System.out.println(h);

        // converting set to list OR HashSet to Vector
        Vector<Integer> v = new Vector<Integer>();

        v.addAll(h);
    }
}
