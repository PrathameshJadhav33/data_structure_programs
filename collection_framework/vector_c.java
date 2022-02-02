
import java.util.Vector;
import java.util.Collections;
import java.util.Comparator;

public class vector_c {

    public static void main(String args[]) {

        // Constrctor used suggest that after excceding it defined capacity each time it
        // will increase its capacity by 3
        Vector<Integer> v1 = new Vector<Integer>(5, 3);

        for (int i = 0; i < 10; i++) {
            v1.add(i);
        }

        System.out.println("Capacity:" + v1.capacity());
        System.out.println("Size:" + v1.size());

        // Using mehtods from Collections class
        System.out.println("Using mehtods from Collections class:");

        System.out.println("before sort:" + v1);
        v1.sort(Comparator.reverseOrder());
        // or
        Collections.sort(v1, Comparator.reverseOrder());
        System.out.println("after sort:" + v1);

        Collections.shuffle(v1);
        System.out.println("after shuffle:" + v1);

        System.out.println("maximum value:" + Collections.max(v1));

        System.out.println("manimum value:" + Collections.min(v1));

        // normal methods

        System.out.println("Contains(10):" + v1.contains(10));

        System.out.println("elementAt(4):" + v1.elementAt(4));

        System.out.println("get(4):" + v1.get(4));

        // remove all elements with frequency(occurence) of 1
        v1.removeIf(n -> Collections.frequency(v1, n) == 1);
        System.out.println("after removeIf:" + v1);

    }
}
