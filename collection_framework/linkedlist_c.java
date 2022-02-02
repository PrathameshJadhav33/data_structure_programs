import java.util.LinkedList;
import java.util.Collections;
import java.util.Comparator;
import java.lang.String;

public class linkedlist_c {
    public static void main(String args[]) {

        // Integer specific Linked list
        LinkedList<Integer> ll = new LinkedList<Integer>();
        for (int i = 0; i < 4; i++) {
            ll.add(i);
        }

        Collections.shuffle(ll);

        // linkedlist to store any type of elements

        LinkedList<Object> ll1 = new LinkedList<Object>();

        for (int i = 0; i < 4; i++) {
            ll1.add(i);
        }

        ll1.add("string");
        ll1.add(1111.2334);
        ll1.add(ll);

        System.out.println(ll1);

        // Using linked list specific methods

        System.out.println("\n\nUsing linked list specific methods:");
        ll1.addFirst("first");
        System.out.println(ll1);

        ll1.addLast("last");
        System.out.println(ll1);

        ll1.removeFirst();
        System.out.println(ll1);

        ll1.removeLast();
        System.out.println(ll1);

        System.out.println("Using mehtods from Collections class:");

        System.out.println("before sort:" + ll);
        ll.sort(Comparator.reverseOrder());
        // or
        Collections.sort(ll, Comparator.reverseOrder());
        System.out.println("after sort:" + ll);

    }

}
